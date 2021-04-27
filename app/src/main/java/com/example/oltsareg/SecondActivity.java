package com.example.oltsareg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText nev = findViewById(R.id.nev);
        EditText szuldat = findViewById(R.id.szuldat);
        EditText szigszam = findViewById(R.id.szigszam);
        Button tovabbGomb = findViewById(R.id.tovabbGomb);

        tovabbGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                i.putExtra("adottnev", nev.getText().toString());
                i.putExtra("adottszuldat",szuldat.getText().toString());
                i.putExtra("adottszigszam", szigszam.getText().toString());
                startActivity(i);
            }
        });
    }
}