package com.example.android_may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnStart,btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart=findViewById(R.id.btn_start);
        btnStop=findViewById(R.id.btn_stop);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);

    }
    public void onClick(View view){
        switch(view.getId())
        {
            case R.id.btn_start:
                Intent i=new Intent(MainActivity.this,MyService.class);
                startActivity(i);
                break;
            case R.id.btn_stop:

                Intent i1=new Intent(MainActivity.this,MyService.class);
                stopService(i1);
                break;

        }
    }
}