package com.example.fontcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int ch = 1;
    int font = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final TextView t = (TextView)findViewById(R.id.textView);
//        Button font = (Button)findViewById(R.id.font);
//        font.setOnClickListener(this);
//        Button color = (Button)findViewById(R.id.color);
//        color.setOnClickListener(this);
    }

    public void changeColor(View v){
        TextView t = (TextView) findViewById(R.id.textView);
        switch(ch) {
            case 1:
                t.setTextColor(Color.RED);
                break;
            case 2:
                t.setTextColor(Color.BLUE);
                break;
            case 3:
                t.setTextColor(Color.GRAY);
                break;
        }
        ch++;
        if(ch==4){
            ch=1;
        }
    }
    public void changeFont(View v){
        final TextView t = (TextView) findViewById(R.id.textView);
        t.setTextSize(font);
        font+=10;
        if(font==50)
            font = 20;
    }
}
