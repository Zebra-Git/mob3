package com.example.multipleactivitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Должно быть обязательно!
        editText = findViewById(R.id.editText);
    }


    public void goToSecondActivity(View view) {
        String text = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("text_key", text);
        startActivity(intent);
    }
}