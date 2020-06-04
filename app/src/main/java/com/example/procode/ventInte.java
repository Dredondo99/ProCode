package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ventInte extends AppCompatActivity implements View.OnClickListener {

    ImageButton houseInte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vent_inte);

        houseInte = findViewById(R.id.homeInte);

        houseInte.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (houseInte.isPressed()){

            Intent intentInt = new Intent(this, MainActivity.class);
            startActivity(intentInt);

        }

    }
}
