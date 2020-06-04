package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Ventana1Resq extends AppCompatActivity {

    ImageButton house1, avanV1;
    RadioButton rb1a, rb1b, rb1c, rb1d;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana1_resq);

        house1 = findViewById(R.id.houseV1);
        avanV1 = findViewById(R.id.avanV1);

        rb1a = findViewById(R.id.RBVent1_1);
        rb1b = findViewById(R.id.RBVent1_2);
        rb1c = findViewById(R.id.RBVent1_3);
        rb1d = findViewById(R.id.RBVent1_4);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");

    }

    public void moviV1 (View view) {

        if (house1.isPressed()) {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        if (avanV1.isPressed()) {

            if (rb1a.isChecked()==true) {

                Intent intent1 = new Intent(this, ventana2_resq2ABC.class);
                intent1.putExtra("nombre", nombre);
                intent1.putExtra("respuesta1", "resp1a");
                startActivity(intent1);

            }
            else if (rb1b.isChecked()==true){

                Intent intent2 = new Intent(this, ventana2_resq2ABC.class);
                intent2.putExtra("nombre", nombre);
                intent2.putExtra("respuesta1", "resp1b");
                startActivity(intent2);

            }
            else if (rb1c.isChecked()==true){

                Intent intent3 = new Intent(this, ventana2_resq2ABC.class);
                intent3.putExtra("nombre", nombre);
                intent3.putExtra("respuesta1", "resp1c");
                startActivity(intent3);

            }
            else if (rb1d.isChecked()==true){

                Intent intent4 = new Intent(this, ventana2_resq2D.class);
                intent4.putExtra("nombre", nombre);
                intent4.putExtra("respuesta1", "resp1d");
                startActivity(intent4);

            }
            else if (rb1a.isChecked()==false & rb1b.isChecked()==false & rb1c.isChecked()==false & rb1d.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }

    }
}
