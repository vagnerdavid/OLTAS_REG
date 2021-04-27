package com.example.oltsareg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView covid = findViewById(R.id.covid);
        ImageView oltaskep = findViewById(R.id.oltaskep);

        oltaskep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atad = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(atad);
            }
        });
    }
}