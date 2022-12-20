package com.example.luccodeliveryandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luccodeliveryandroid.databinding.ActivityMainBinding;

public class Login extends AppCompatActivity {
    private Button registratiButton;
    protected ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.registratiButton.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this,Registrati.class);
            startActivity(intent);
        });
    }
}