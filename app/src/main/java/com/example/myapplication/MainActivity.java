package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goacvt2 = findViewById(R.id.go_actv_2);
        goacvt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actintent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(actintent);
            }
        });

    }
}