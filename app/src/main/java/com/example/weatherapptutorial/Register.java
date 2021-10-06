package com.example.weatherapptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private Button Button_reg;
    private Button button_golog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText edit_name = findViewById(R.id.edit_name);
        final EditText edit_email = findViewById(R.id.edit_email);
        Button reg = findViewById(R.id.button_reg);
        Button button_golog = (Button) findViewById(R.id.buttongolog);
        button_golog.setOnClickListener(view -> gotoLogin());
        DAOUser dao = new DAOUser();
        reg.setOnClickListener(v ->
                {
                    User user = new User(edit_name.getText().toString(), edit_email.getText().toString());
                    dao.add(user).addOnSuccessListener(suc ->

                            Toast.makeText(this, "User Register Successfully" , Toast.LENGTH_SHORT).show());
                }
        );

    }
    private void gotoLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
