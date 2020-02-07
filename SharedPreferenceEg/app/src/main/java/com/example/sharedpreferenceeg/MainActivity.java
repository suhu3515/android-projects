package com.example.sharedpreferenceeg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_save,btn_retrive;
    EditText uname,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_retrive = findViewById(R.id.btn_retr);
        btn_save = findViewById(R.id.btn_save);
        uname = findViewById(R.id.et_uname);
        pwd = findViewById(R.id.et_pwd);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveData();

            }
        });

        btn_retrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fetchData();

            }
        });
    }

    private void fetchData()
    {

        SharedPreferences sharedPreferences = getSharedPreferences("user",Context.MODE_PRIVATE);
        uname.setText(sharedPreferences.getString("user",null));
        pwd.setText(sharedPreferences.getString("pass",null));

    }

    private void saveData()
    {

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

}
