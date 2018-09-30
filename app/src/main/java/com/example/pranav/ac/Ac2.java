package com.example.pranav.ac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class Ac2 extends AppCompatActivity {
    private RadioButton radioButton;
    private RadioButton radioButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);
        radioButton=(RadioButton) findViewById(R.id.k2);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pu3();
            }

        });
        radioButton1=(RadioButton) findViewById(R.id.k5);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pu4();
            }

        });
    }

    private void pu4() {
        Intent intent=new Intent(this,ac4.class);
        startActivity(intent);
    }

    private void pu3() {
        Intent intent=new Intent(this,Ac3.class);
        startActivity(intent);


    }
}
