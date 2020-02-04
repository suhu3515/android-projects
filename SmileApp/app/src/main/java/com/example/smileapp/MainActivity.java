package com.example.smileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.img_draw);

        Bitmap bitmap = Bitmap.createBitmap(720,1200, Bitmap.Config.ARGB_8888);
        iv.setBackgroundDrawable(new BitmapDrawable(bitmap));
        Canvas canvas = new Canvas(bitmap);

        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);

        canvas.drawCircle(360,600,200,paint);

        paint.setColor(Color.BLACK);

        canvas.drawCircle(280,490,10,paint);

        canvas.drawCircle(440,490,10,paint);

        canvas.drawLine(300,700,300,720,paint);

    }
}
