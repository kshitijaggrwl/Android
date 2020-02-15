package com.example.restaurantapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thai extends AppCompatActivity {
    int ip;
    {
        ip = 0;
    }
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai);
        b1 = findViewById(R.id.item1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                it1();
            }
        });
        b2 = findViewById(R.id.item2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                it2();
            }
        });
        b3 = findViewById(R.id.item3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                it3();
            }
        });
        b4 = findViewById(R.id.go_back);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bk();
            }
        });
    }

    public void it1(){
        ip=ip+500;

    }
    public void it2() {
        ip = ip + 300;
    }
    public void it3() {
        ip = ip + 400;
    }
    public void bk() {
        Intent i=new Intent(this, MainActivity.class);
        i.putExtra("price",ip);
        startActivity(i);
    }

}