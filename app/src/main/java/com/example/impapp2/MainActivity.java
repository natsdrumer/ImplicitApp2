 package com.example.impapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {
    private EditText etTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTxt = findViewById(R.id.edTxt);
        if(getIntent().hasExtra("txt")){
            String teste = getIntent().getStringExtra("txt");
            etTxt.setText(teste);
        }
    }
}