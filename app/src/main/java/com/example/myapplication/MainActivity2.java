package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this,bundle.getString("key"), Toast.LENGTH_LONG).show();
        btn4 = findViewById(R.id.button4);
        // Реализация интерфейса через анонимный класс
         btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        // Лямбда выражения
        // btn4.setOnClickListener(v -> {

        //});
    }
}