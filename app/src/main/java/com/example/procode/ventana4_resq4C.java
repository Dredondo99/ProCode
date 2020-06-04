package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ventana4_resq4C extends AppCompatActivity {

    ImageButton house4c, avan4c;
    RadioButton rbC4a, rbC4b, rbC4c, rbC4d;
    String nombre, respuesta1, respuesta2ABC, respuesta2D, respuesta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana4_resq4_c);

        house4c = findViewById(R.id.homeV4C);
        avan4c = findViewById(R.id.avanV4C);

        rbC4a = findViewById(R.id.RBVent4_1C);
        rbC4b = findViewById(R.id.RBVent4_2C);
        rbC4c = findViewById(R.id.RBVent4_3C);
        rbC4d = findViewById(R.id.RBVent4_4C);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        respuesta1 = extras.getString("respuesta1");
        respuesta2ABC = extras.getString("respuesta2ABC");
        respuesta2D = extras.getString("respuesta2D");
        respuesta3 = extras.getString("respuesta3");

    }

    public void moviV4C (View view){

        if (house4c.isPressed()){

            Intent intent26 = new Intent(this, MainActivity.class);
            startActivity(intent26);

        }
        if (avan4c.isPressed()){

            if (rbC4a.isChecked()==true){

                Intent intent28 = new Intent(this, VentResul.class);
                intent28.putExtra("nombre", nombre);
                intent28.putExtra("respuesta1", respuesta1);
                intent28.putExtra("respuesta2ABC", respuesta2ABC);
                intent28.putExtra("respuestaD", respuesta2D);
                intent28.putExtra("respuesta3", respuesta3);
                intent28.putExtra("respuesta4C", "respC4a");
                startActivity(intent28);

            }
            else if (rbC4b.isChecked()==true){

                Intent intent29 = new Intent(this, VentResul.class);
                intent29.putExtra("nombre", nombre);
                intent29.putExtra("respuesta1", respuesta1);
                intent29.putExtra("respuesta2ABC", respuesta2ABC);
                intent29.putExtra("respuestaD", respuesta2D);
                intent29.putExtra("respuesta3", respuesta3);
                intent29.putExtra("respuesta4C", "respC4b");
                startActivity(intent29);

            }
            else if (rbC4c.isChecked()==true){

                Intent intent30 = new Intent(this, VentResul.class);
                intent30.putExtra("nombre", nombre);
                intent30.putExtra("respuesta1", respuesta1);
                intent30.putExtra("respuesta2ABC", respuesta2ABC);
                intent30.putExtra("respuestaD", respuesta2D);
                intent30.putExtra("respuesta3", respuesta3);
                intent30.putExtra("respuesta4C", "respC4c");
                startActivity(intent30);

            }
            else if (rbC4d.isChecked()==true){

                Intent intent31 = new Intent(this, VentResul.class);
                intent31.putExtra("nombre", nombre);
                intent31.putExtra("respuesta1", respuesta1);
                intent31.putExtra("respuesta2ABC", respuesta2ABC);
                intent31.putExtra("respuestaD", respuesta2D);
                intent31.putExtra("respuesta3", respuesta3);
                intent31.putExtra("respuesta4C", "respC4d");
                startActivity(intent31);

            }
            else if (rbC4a.isChecked()==false || rbC4b.isChecked()==false || rbC4c.isChecked()==false || rbC4d.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }

    }

}
