package com.example.varosok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private Button buttonVissza;
    private TextView textViewLista;
    private List<City> varos = new ArrayList<>();
    private String url = "https://retoolapi.dev/G48Lqv/varosok";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);



        init();
        buttonVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        textViewLista.setText("Város Ország Lakosság");


    }

    private void init(){

        buttonVissza= findViewById(R.id.ButtonVissza);
        textViewLista=findViewById(R.id.textViewLista);

    }
}