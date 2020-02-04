package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    Button btn_add,btn_sub,btn_div,btn_mul;
    TextView tv_result;
    float n1,n2,r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.num1);
        et2 = findViewById(R.id.num2);
        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_div = findViewById(R.id.btn_div);
        btn_mul = findViewById(R.id.btn_mul);
        tv_result = findViewById(R.id.txt_result);
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_div.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.btn_add:
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                r = n1+n2;
                tv_result.setText("The result is " + String.valueOf(r));
                break;

            case R.id.btn_sub:
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                r = n1-n2;
                tv_result.setText("The result is " + String.valueOf(r));
                break;

            case R.id.btn_mul:
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                r = n1*n2;
                tv_result.setText("The result is " + String.valueOf(r));
                break;

            case R.id.btn_div:
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                r = n1/n2;
                tv_result.setText("The result is " + String.valueOf(r));
                break;


        }

    }
}
