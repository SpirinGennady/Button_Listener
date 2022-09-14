package com.example.button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = findViewById(R.id.tvText);
        Button button_plus = findViewById(R.id.oneButton);
        Button button_ravno = findViewById(R.id.twoButton);

        button_plus.setOnClickListener(this);
        button_ravno.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.oneButton:
                tvText.setText("Скоро будет калькулятор!");
                break;
            case R.id.twoButton:
                tvText.setText("Я очень надеюсь!");
                break;
        }
    }
}