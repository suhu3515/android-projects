package com.example.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText principle,years,rate;
    TextView txt_interest;
    Button intCalc;
    float p,t,r,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principle = findViewById(R.id.et_p);
        years = findViewById(R.id.et_t);
        rate = findViewById(R.id.et_r);
        txt_interest = findViewById(R.id.tv_interest);
        intCalc = findViewById(R.id.btn_calc);

        intCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                p = Integer.parseInt(principle.getText().toString());
                t = Integer.parseInt(years.getText().toString());
                r = Integer.parseInt(rate.getText().toString());

                sum = (p * r * t) / 100;

                txt_interest.setText("Interest is " + sum);

            }
        });
    }
}
