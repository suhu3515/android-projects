package com.example.stringreverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_rev;
    EditText et_str;
    Button btn_rev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_rev = findViewById(R.id.tv_rev);
        et_str = findViewById(R.id.str);
        btn_rev = findViewById(R.id.btn_rev);

        btn_rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer c = new StringBuffer(et_str.getText().toString());
                tv_rev.setText(c.reverse());
            }
        });
    }
}
