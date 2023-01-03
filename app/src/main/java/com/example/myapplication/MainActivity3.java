package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.IntentCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button goacvt2 = findViewById(R.id.goact4);
        goacvt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actintent = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(actintent);
            }
        });

        Button goacvt = findViewById(R.id.homebtn);
        goacvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }
}