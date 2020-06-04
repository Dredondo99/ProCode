package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ventana4_resq4B extends AppCompatActivity {

    ImageButton house4b, avan4b;
    RadioButton rbB4a, rbB4b, rbB4c, rbB4d;
    String nombre, respuesta1, respuesta2ABC, respuesta2D, respuesta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana4_resq4_b);

        house4b = findViewById(R.id.homeV4B);
        avan4b = findViewById(R.id.avanV4B);

        rbB4a = findViewById(R.id.RBVent4_1B);
        rbB4b = findViewById(R.id.RBVent4_2B);
        rbB4c = findViewById(R.id.RBVent4_3B);
        rbB4d = findViewById(R.id.RBVent4_4B);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        respuesta1 = extras.getString("respuesta1");
        respuesta2ABC = extras.getString("respuesta2ABC");
        respuesta2D = extras.getString("respuesta2D");
        respuesta3 = extras.getString("respuesta3");

    }

    public void moviV4B (View view){

        if (house4b.isPressed()){

            Intent intent20 = new Intent(this, MainActivity.class);
            startActivity(intent20);

        }
        if (avan4b.isPressed()){

            if (rbB4a.isChecked()==true){

                Intent intent22 = new Intent(this, VentResul.class);
                intent22.putExtra("nombre", nombre);
                intent22.putExtra("respuesta1", respuesta1);
                intent22.putExtra("respuesta2ABC", respuesta2ABC);
                intent22.putExtra("respuesta2D", respuesta2D);
                intent22.putExtra("respuesta3", respuesta3);
                intent22.putExtra("respuesta4B", "respB4a");
                startActivity(intent22);

            }
            else if(rbB4b.isChecked()==true){

                Intent intent23 = new Intent(this, VentResul.class);
                intent23.putExtra("nombre", nombre);
                intent23.putExtra("respuesta1", respuesta1);
                intent23.putExtra("respuesta2ABC", respuesta2ABC);
                intent23.putExtra("respuesta2D", respuesta2D);
                intent23.putExtra("respuesta3", respuesta3);
                intent23.putExtra("respuesta4B", "respB4b");
                startActivity(intent23);

            }
            else if(rbB4c.isChecked()==true){

                Intent intent24 = new Intent(this, VentResul.class);
                intent24.putExtra("nombre", nombre);
                intent24.putExtra("respuesta1", respuesta1);
                intent24.putExtra("respuesta2ABC", respuesta2ABC);
                intent24.putExtra("respuesta2D", respuesta2D);
                intent24.putExtra("respuesta3", respuesta3);
                intent24.putExtra("respuesta4B", "respB4c");
                startActivity(intent24);

            }
            else if(rbB4d.isChecked()==true){

                Intent intent25 = new Intent(this, VentResul.class);
                intent25.putExtra("nombre", nombre);
                intent25.putExtra("respuesta1", respuesta1);
                intent25.putExtra("respuesta2ABC", respuesta2ABC);
                intent25.putExtra("respuesta2D", respuesta2D);
                intent25.putExtra("respuesta3", respuesta3);
                intent25.putExtra("respuesta4B", "respB4d");
                startActivity(intent25);

            }
            else if (rbB4a.isChecked()==false|| rbB4b.isChecked()==false ||rbB4c.isChecked()==false || rbB4d.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }

    }

}
