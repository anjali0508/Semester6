package com.example.formdetailsdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        TextView t2 = (TextView)findViewById((R.id.textView6));
        Intent i = getIntent();
        String name = i.getStringExtra("name_key");
        String usn = i.getStringExtra("usn_key");
        t1.setText(name);
        t2.setText(usn);

    }
}
