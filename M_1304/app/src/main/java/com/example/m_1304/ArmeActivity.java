package com.example.m_1304;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arme);

        Button button1=findViewById(R.id.oberarmActivityButton);
        Button button2=findViewById(R.id.unterarmActivityButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ArmeActivity.this,OberarmActivity.class);
                startActivity(intent);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ArmeActivity.this,UnterarmAcitivty.class);
                startActivity(intent);
            }

        });
    }
}