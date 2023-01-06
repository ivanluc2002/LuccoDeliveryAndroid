package com.example.luccodeliveryandroid;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.luccodeliveryandroid.databinding.ActivityMainBinding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Login extends AppCompatActivity {
    private Button registratiButton;
    protected ActivityMainBinding binding;
    protected boolean scrivi(String utente, String text) throws IOException {
        File file = new File(getFilesDir(), utente);
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(file);
            stream.write(text.getBytes());
            stream.close();
        }catch (Exception e ){
            e.printStackTrace();

        }
        return true;
    }
    protected String leggi(String log) throws IOException {
        File file = new File(getFilesDir(), log);
        int length = (int) file.length();
        byte[] bytes = new byte[length];
        try (FileInputStream in = new FileInputStream(file)) {
            int a = in.read(bytes);
            Log.d("result", "a: " + a);
        } catch (Exception e) {
            e.printStackTrace();
            return new String(bytes);
        }
        return new String(bytes);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.registratiButton.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this,Registrati.class);
            startActivity(intent);
        });
        binding.accediButton.setOnClickListener(view -> {
            try{
            Boolean writeOK = scrivi(  "log", "email: "+binding.emailForm.getText().toString()+"password: "+binding.passwordForm.getText().toString());
            if (writeOK==true) {
                String testo = leggi( "log");
                Log. d(  "Leggi: ", testo);
            } else {
                Log.d("Male: ", "non va");
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
            Intent intent= new Intent(Login.this,Home.class);
            startActivity(intent);
        });

    }

}
