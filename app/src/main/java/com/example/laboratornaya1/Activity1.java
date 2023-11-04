package com.example.laboratornaya1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }
    public void sendMessage(View view) {
        // действия, совершаемые после нажатия на кнопку

        // создаем intent чтобы потом с его помощью запустить Activity2
        Intent intent2 = new Intent(this, Activity2.class);

        // присваиваем значение передаваемому параметру
        String message = "Переданный параметр: Мыцик";

        // передаем значение параметра в Activity2
        intent2.putExtra("message", message);

        // запуск Activity2
        startActivity(intent2);
    }

}