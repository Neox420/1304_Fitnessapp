    package com.example.m_1304;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;


    public class SecondActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            Button button1=findViewById(R.id.bauchActivityButton);
            Button button2 = findViewById(R.id.rueckenActivityButton);
            Button button3 = findViewById(R.id.beineActivityButton);
            Button button4 = findViewById(R.id.armeActivityButton);
            Button button5 = findViewById(R.id.brustActivityButton);
            Button button6 = findViewById(R.id.schulterActivityButton);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(SecondActivity.this,BauchActivity.class);
                    startActivity(intent);
                }

            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(SecondActivity.this, RueckenActivity.class);
                    startActivity(intent);
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(SecondActivity.this, BeineActivity.class);
                    startActivity(intent);
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(SecondActivity.this, ArmeActivity.class);
                    startActivity(intent);
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(SecondActivity.this, BrustActivity.class);
                    startActivity(intent);
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(SecondActivity.this, SchulterActivity.class);
                    startActivity(intent);
                }
            });

                }
        }
