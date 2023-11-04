package com.example.laboratornaya1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // получаем объект intent из Activity1, который запустил данную activity
        Intent intent2 = getIntent();
        // получаем сообщение из объекта intent
        String message = intent2.getStringExtra("message");
        // находим TextView по его id
        TextView messageText = findViewById(R.id.messageText);
        // предаем параметр в TextView
        messageText.setText(message);

    }

}