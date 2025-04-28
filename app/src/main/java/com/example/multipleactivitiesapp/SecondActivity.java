package com.example.multipleactivitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receivedText = findViewById(R.id.treceivedText);

        String text = getIntent().getStringExtra("text_key");
        if (text != null && !text.isEmpty()) {
            receivedText.setText(text);
        }

    }

    public void goToThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}

