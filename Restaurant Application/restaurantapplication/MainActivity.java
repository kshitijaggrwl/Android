package com.example.restaurantapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1, b2, b3;
    static int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.text2);
        Intent intent = getIntent();
        int value = intent.getIntExtra("price", 0);
        flag = flag + value;
        t1.setText("Total Price: "+flag);
        b1 = findViewById(R.id.ind);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun1();
            }
        });
        b2 = findViewById(R.id.chi);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun2();
            }
        });
        b3 = findViewById(R.id.thai);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun3();
            }
        });

    }



    public void fun1(){
        Intent i1=new Intent(this, Indian.class);
        startActivity(i1);
    }
    public void fun2(){
        Intent i2=new Intent(this, Chinese.class);
        startActivity(i2);
    }
    public void fun3(){
        Intent i3=new Intent(this, Thai.class);
        startActivity(i3);
    }
}
