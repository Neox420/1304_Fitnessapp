package com.example.m_1304;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BrustActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brust);

        Button button1=findViewById(R.id.obereBrustActivityButton);
        Button button2=findViewById(R.id.mittlereBrustActivityButton);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BrustActivity.this,ObereBrustActivity.class);
                startActivity(intent);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BrustActivity.this,MittlereBrustActivity.class);
                startActivity(intent);
            }

        });


    }
}