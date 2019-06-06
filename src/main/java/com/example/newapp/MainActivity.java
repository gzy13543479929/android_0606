package com.example.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_activity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_activity2 = findViewById(R.id.activity_main_button1);
        final Intent intent_to_activity2 = new Intent(this,activity2.class);

        button_activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_to_activity2.putExtra("gzy",100);
                startActivity(intent_to_activity2);
            }

        });
    }
}
