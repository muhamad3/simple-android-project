package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button goacvt3 = findViewById(R.id.go_actv_3);
        goacvt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actintent = new Intent(getApplicationContext(),MainActivity3.class);

                startActivity(actintent);
            }
        });
    }
}