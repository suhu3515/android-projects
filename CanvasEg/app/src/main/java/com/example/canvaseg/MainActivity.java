package com.example.canvaseg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img_view);

        Bitmap bm = Bitmap.createBitmap(720,1200, Bitmap.Config.ARGB_8888);
        img.setBackground(new BitmapDrawable(bm));

        Canvas canvas = new Canvas(bm);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(50);

        canvas.drawText("Rectangle",420,150,paint);
        canvas.drawRect(400,200,650,700,paint);

        canvas.drawText("Circle",120,150,paint);
        canvas.drawCircle(200,350,150,paint);

        canvas.drawText("Square",120,800,paint);
        canvas.drawRect(50,850,350,1150,paint);

        canvas.drawText("Line",400,800,paint);
        canvas.drawLine(520,850,520,1150,paint);



    }
}
