package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ventana4_resq4A extends AppCompatActivity {

    ImageButton house4a, avan4a;
    RadioButton rbA2a, rbA2b, rbA2c, rbA2d;
    String nombre, respuesta1, respuesta2ABC, respuesta2D, respuesta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana4_resq4);

        house4a = findViewById(R.id.homeV4A);
        avan4a = findViewById(R.id.avanV4A);

        rbA2a = findViewById(R.id.RBVent4_1A);
        rbA2b = findViewById(R.id.RBVent4_2A);
        rbA2c = findViewById(R.id.RBVent4_3A);
        rbA2d = findViewById(R.id.RBVent4_4A);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        respuesta1 = extras.getString("respuesta1");
        respuesta2ABC = extras.getString("respuesta2ABC");
        respuesta2D = extras.getString("respuesta2D");
        respuesta3 = extras.getString("respuesta3");

    }

    public void moviV4A(View view){

        if (house4a.isPressed()){

            Intent intent14 = new Intent(this, MainActivity.class);
            startActivity(intent14);

        }
        if (avan4a.isPressed()){

            if (rbA2a.isChecked()==true){

                Intent intent16 = new Intent(this, VentResul.class);
                intent16.putExtra("nombre", nombre);
                intent16.putExtra("respuesta1", respuesta1);
                intent16.putExtra("respuesta2ABC", respuesta2ABC);
                intent16.putExtra("respuesta2D",respuesta2D);
                intent16.putExtra("respuesta3", respuesta3);
                intent16.putExtra("respuesta4A", "respA4a");
                startActivity(intent16);

            }
            else if(rbA2b.isChecked()==true){

                Intent intent17 = new Intent(this, VentResul.class);
                intent17.putExtra("nombre", nombre);
                intent17.putExtra("respuesta1", respuesta1);
                intent17.putExtra("respuesta2ABC", respuesta2ABC);
                intent17.putExtra("respuesta2D",respuesta2D);
                intent17.putExtra("respuesta3", respuesta3);
                intent17.putExtra("respuesta4A", "respA4b");
                startActivity(intent17);

            }
            else if (rbA2c.isChecked()==true){

                Intent intent18 = new Intent(this, VentResul.class);
                intent18.putExtra("nombre", nombre);
                intent18.putExtra("respuesta1", respuesta1);
                intent18.putExtra("respuesta2ABC", respuesta2ABC);
                intent18.putExtra("respuesta2D",respuesta2D);
                intent18.putExtra("respuesta3", respuesta3);
                intent18.putExtra("respuesta4A", "respA4c");
                startActivity(intent18);

            }
            else if (rbA2d.isChecked()==true){

                Intent intent19 = new Intent(this, VentResul.class);
                intent19.putExtra("nombre", nombre);
                intent19.putExtra("respuesta1", respuesta1);
                intent19.putExtra("respuesta2ABC", respuesta2ABC);
                intent19.putExtra("respuesta2D",respuesta2D);
                intent19.putExtra("respuesta3", respuesta3);
                intent19.putExtra("respuesta4A", "respA4d");
                startActivity(intent19);

            }
            else if (rbA2a.isChecked()==false & rbA2b.isChecked()==false & rbA2c.isChecked()==false & rbA2d.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }

    }

}
