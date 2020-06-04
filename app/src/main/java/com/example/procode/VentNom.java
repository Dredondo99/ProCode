package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class VentNom extends AppCompatActivity {

    ImageButton houseNom;
    EditText nomIn;
    Button comienza;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vent_nom);

        houseNom = findViewById(R.id.homeVentNom);
        nomIn = findViewById(R.id.nomIntro);
        comienza = findViewById(R.id.comenNom);

    }

    public void moviNombre(View view){

        if (houseNom.isPressed()){

            Intent intentNombre1 = new Intent(this, MainActivity.class);
            startActivity(intentNombre1);

        }
        if (comienza.isPressed()){

            nombre = nomIn.getText().toString();

            if (nombre.equals("")){

                Toast.makeText(this, "Debes introducir un nombre", Toast.LENGTH_SHORT).show();

            }else {

                Intent intentNombre3 = new Intent(this, Ventana1Resq.class);
                intentNombre3.putExtra("nombre", nombre);
                startActivity(intentNombre3);

            }


        }

    }

}
