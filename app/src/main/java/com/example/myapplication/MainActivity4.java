package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button goacvt2 = findViewById(R.id.back);
        goacvt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actintent = new Intent(getApplicationContext(),MainActivity4.class);
                finish();
            }
        });
    }
}