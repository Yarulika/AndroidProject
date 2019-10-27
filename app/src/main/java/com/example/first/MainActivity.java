package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextPass;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login); //activity_main

        findViews();
        setUpView();
    }

    private void findViews(){
        editTextPass = findViewById(R.id.etxt_password);
        editTextUsername = findViewById(R.id.etxt_username);
        buttonLogin = findViewById(R.id.btn_login);
    }

    private void setUpView(){
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String password = editTextPass.getText().toString();
                String username = editTextUsername.getText().toString();
                Toast.makeText(MainActivity.this, password + "" + username, Toast.LENGTH_SHORT).show();
                Snackbar.make(view, "snackbar", Snackbar.LENGTH_SHORT).show();
            }
        });

    }

    public void sendMessage(View view){


    }

}
