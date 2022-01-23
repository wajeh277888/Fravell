package com.example.fravell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPass extends AppCompatActivity {

    private Button take_to_pin_veri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);


        take_to_pin_veri=findViewById(R.id.take_to_pin_veri);
        take_to_pin_veri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForgotPass.this,NewPassEnter.class);
                startActivity(intent);
            }
        });
    }
}