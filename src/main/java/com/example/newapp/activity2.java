package com.example.newapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class activity2 extends Activity {
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_layout);
        textView1 = findViewById(R.id.activity2_textview1);
        Intent intent = getIntent();
        String getIntentData = intent.getStringExtra("gzy");
        textView1.setText(getIntentData);
    }
}
