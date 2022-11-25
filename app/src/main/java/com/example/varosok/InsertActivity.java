package com.example.varosok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity {

    private EditText EditTextVaros, EditTextOrszag,EditTextLakossag;
    private Button buttonVissza ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        init();
        buttonVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(InsertActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        EditTextVaros.setHint("Város");
        EditTextOrszag.setHint("Ország");
        EditTextLakossag.setHint("Lakosság");

    }

    private void init(){

        buttonVissza= findViewById(R.id.buttonBack);
        EditTextVaros=findViewById(R.id.EditTextVaros);
        EditTextOrszag=findViewById(R.id.EditTextOrszag);
        EditTextLakossag=findViewById(R.id.EditTextLakossag);

    }

}