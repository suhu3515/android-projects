package com.example.studentmarklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etname,etroll,etm1,etm2,etm3;
    Button btnResult;
    TextView tvRoll,tvAvg,tvGrade;
    float m1,m2,m3,tot,avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.et_sname);
        etroll = findViewById(R.id.et_sroll);
        etm1 = findViewById(R.id.et_sm1);
        etm2 = findViewById(R.id.et_sm2);
        etm3 = findViewById(R.id.et_sm3);
        btnResult = findViewById(R.id.btn_sres);
        tvRoll = findViewById(R.id.tv_iroll);
        tvAvg = findViewById(R.id.tv_iavg);
        tvGrade = findViewById(R.id.tv_igrade);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m1 = Float.parseFloat(etm1.getText().toString());
                m2 = Float.parseFloat(etm2.getText().toString());
                m3 = Float.parseFloat(etm3.getText().toString());
                tot = m1 + m2 + m3;
                avg = tot / 3;
                tvRoll.setText(etroll.getText().toString());
                tvAvg.setText(String.valueOf(avg));
                if(avg >= 80)
                {
                    tvGrade.setText("A");
                }
                else if (avg>=60 && avg<80)
                {
                    tvGrade.setText("B");
                }
                else if (avg>=40 && avg<60)
                {
                    tvGrade.setText("C");
                }
                else
                {
                    tvGrade.setText("D");
                }

            }
        });
    }
}
