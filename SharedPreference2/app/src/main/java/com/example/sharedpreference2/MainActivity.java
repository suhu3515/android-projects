package com.example.sharedpreference2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pwd;

    @Override
    protected void onPause() {
        super.onPause();

        String username = uname.getText().toString();
        String password = pwd.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user",username);
        editor.putString("pass",password);
        editor.apply();
        Toast.makeText(MainActivity.this,"Saved Login Credintials",Toast.LENGTH_LONG).show();
        uname.getText().clear();
        pwd.getText().clear();
    }


    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getSharedPreferences("user",Context.MODE_PRIVATE);
        uname.setText(sharedPreferences.getString("user",null));
        pwd.setText(sharedPreferences.getString("pass",null));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = findViewById(R.id.et_uname);
        pwd = findViewById(R.id.et_pwd);


    }
}
