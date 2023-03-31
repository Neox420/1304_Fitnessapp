package com.example.m_1304;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BauchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bauch);

        Button button1=findViewById(R.id.seitlichActivityButton);
        Button button2=findViewById(R.id.geradeBauchActivityButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BauchActivity.this,SeitlicheBauchActivity.class);
                startActivity(intent);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BauchActivity.this,GeradeBauchActivity.class);
                startActivity(intent);
            }

        });
    }
}