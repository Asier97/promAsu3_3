package com.example.promasu3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejer1(View view) {
        Intent i = new Intent(MainActivity.this, Ejercicio1Activity.class);
        startActivity(i);
    }

    public void ejer2(View view) {
        Intent i = new Intent(MainActivity.this,Ejercicio2Activity.class);
        startActivity(i);
    }
}




