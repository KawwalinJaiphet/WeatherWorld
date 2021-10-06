package com.example.weatherapptutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button Buttonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Buttonlogin = findViewById(R.id.buttonlogin);
        Buttonlogin.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    System.out.println("Clicked");
                    Intent login = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(login);
                }
        });
    }
}