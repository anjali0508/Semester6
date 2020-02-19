package com.example.formdetailsdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void display(View v){
        EditText nameView = (EditText)findViewById(R.id.editText2);
        String name = nameView.getText().toString();
        EditText usnView = (EditText)findViewById(R.id.editText3);
        String usn = usnView.getText().toString();
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("name_key", name);
        i.putExtra("usn_key", usn);
        startActivity(i);
    }
}
