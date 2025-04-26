package com.example.multipleactivitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private EditText editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        editNumber = findViewById(R.id.editTextNumber);
    }

    public void goToFourthActivity(View view) {
        String number = editNumber.getText().toString();
        Intent intent = new Intent(this, FourthActivity.class);
        intent.putExtra("number_key", number);
        startActivity(intent);
    }
}
