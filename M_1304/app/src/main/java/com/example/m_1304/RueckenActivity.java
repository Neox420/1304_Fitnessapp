package com.example.m_1304;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RueckenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruecken);

        Button button1=findViewById(R.id.unterRueckenActivityButton);
        Button button2=findViewById(R.id.oberRueckenActivityButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RueckenActivity.this,UnterRuecken.class);
                startActivity(intent);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RueckenActivity.this,OberRuecken.class);
                startActivity(intent);
            }

        });
    }
}