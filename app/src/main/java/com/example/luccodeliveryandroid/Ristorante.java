package com.example.luccodeliveryandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Ristorante extends AppCompatActivity {
    private TextView textView;
    private RecyclerView recyclerView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ristorante);
        textView= findViewById(R.id.nomeRistorante);
        imageView=findViewById(R.id.imageView4);
        Project project= (Project) getIntent().getSerializableExtra("ristorante");
        textView.setText(project.getName());
        imageView.setImageResource(project.getImage());
        recyclerView= findViewById(R.id.recycler1);
        RistoranteAdapter ristoranteAdapter= new RistoranteAdapter(new Project[]{project});
        recyclerView.setAdapter(ristoranteAdapter);



    }
}