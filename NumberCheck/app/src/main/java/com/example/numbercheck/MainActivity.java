package com.example.numbercheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num;
    Button armstrBtn,primeBtn,palindrmBtn;
    int num1,num2,num3,temp,temp2,a_sum,p_sum,ams,prm,pal,p_flag=0,m=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.et_num);
        armstrBtn = findViewById(R.id.btn_ams);
        primeBtn = findViewById(R.id.btn_prim);
        palindrmBtn = findViewById(R.id.btn_pali);

        armstrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(num.getText().toString().trim());
                ams = num1;
                while(ams>0)
                {
                    temp = ams % 10;
                    a_sum = a_sum + temp * temp * temp;
                    ams = ams / 10;
                }

                if (a_sum == num1)
                {
                    Toast.makeText(MainActivity.this,"The number is armstrong",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"The number is not armstrong",Toast.LENGTH_SHORT).show();
                }

            }
        });

        primeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num2 = Integer.parseInt(num.getText().toString().trim());
                prm = num2;
                m = prm / 2;
                if(prm==0 || prm==1)
                {
                    Toast.makeText(MainActivity.this,"The Number is not prime number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    for (int j=2;j<=m;j++)
                    {
                        if (prm % j == 0)
                        {
                            Toast.makeText(MainActivity.this,"The Number is not prime number",Toast.LENGTH_SHORT).show();
                            p_flag = 1;
                            break;
                        }
                    }
                    if (p_flag == 0)
                    {
                        Toast.makeText(MainActivity.this,"The Number is a prime number",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        palindrmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num3 = Integer.parseInt(num.getText().toString().trim());
                pal = num3;
                while (num3>0)
                {
                    temp2 = num3 % 10;
                    p_sum = (p_sum * 10) + temp2;
                    num3 = num3 / 10;
                }
                if (pal == p_sum)
                {
                    Toast.makeText(MainActivity.this,"The Number is a palindrome number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"The Number is not a palindrome number",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
