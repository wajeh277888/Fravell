package com.example.fravell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumVeri1 extends AppCompatActivity {

    private Button phonepinbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_veri1);

        findViewById(R.id.phonepinbtn);
        phonepinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NumVeri1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}