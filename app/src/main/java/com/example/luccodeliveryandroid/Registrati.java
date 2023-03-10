package com.example.luccodeliveryandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Registrati extends AppCompatActivity {
    private Button backACCEDI;
    protected com.example.luccodeliveryandroid.databinding.ActivityRegistratiBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(Registrati.this,R.layout.activity_registrati);
        binding.accediButtonPag2.setOnClickListener(view -> {
         getIntent();
         finish();
        });
        binding.registratiButtonPag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registrati.this,Home.class);
                startActivity(intent);
            }
        });
    }
}