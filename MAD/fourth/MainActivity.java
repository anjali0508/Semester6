package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        ImageView i = (ImageView)findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas = new Canvas(bg);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawText("RECTANGLE",420,150,paint);
        canvas.drawRect(400,200,650,700,paint);
        canvas.drawLine(100,100,100,500,paint);
        canvas.drawCircle(200,700,100,paint);
        canvas.drawRect(150,150,200,200,paint);
    }
}
