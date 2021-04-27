package com.example.oltsareg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView sikeres = findViewById(R.id.sikeres);
        Bundle extras = getIntent().getExtras();

        if (extras != null){
            sikeres.setText(("Sikeres regisztráció!")+"\n" + (extras.getString("adottnev"))+"\n"+ (extras.getString("adottszuldat"))+"\n"+(extras.getString("adottszigszam")));
        }
    }

}