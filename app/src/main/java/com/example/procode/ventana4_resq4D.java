package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ventana4_resq4D extends AppCompatActivity {

    ImageButton house4d, avan4d;
    RadioButton rbD4a, rbD4b, rbD4c, rbD4d;
    String nombre, respuesta1, respuesta2D, respuesta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana4_resq4_d);

        house4d = findViewById(R.id.homeV4D);
        avan4d = findViewById(R.id.avanV4D);

        rbD4a = findViewById(R.id.RBVent4_1D);
        rbD4b = findViewById(R.id.RBVent4_2D);
        rbD4c = findViewById(R.id.RBVent4_3D);
        rbD4d = findViewById(R.id.RBVent4_4D);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        respuesta1 = extras.getString("respuesta1");
        respuesta2D = extras.getString("respuesta2D");
        respuesta3 = extras.getString("respuesta3");

    }

    public void moviV4D (View view){

        if (house4d.isPressed()){

            Intent intent32 = new Intent(this, MainActivity.class);
            startActivity(intent32);

        }
        if (avan4d.isPressed()){

            if (rbD4a.isChecked()==true){

                Intent intent34 = new Intent(this, VentResul.class);
                intent34.putExtra("nombre", nombre);
                intent34.putExtra("respuesta1", respuesta1);
                intent34.putExtra("respuesta2D", respuesta2D);
                intent34.putExtra("respuesta3", respuesta3);
                intent34.putExtra("respuesta4D", "respD4a");
                startActivity(intent34);

            }
            else if (rbD4b.isChecked()==true){

                Intent intent35 = new Intent(this, VentResul.class);
                intent35.putExtra("nombre", nombre);
                intent35.putExtra("respuesta1", respuesta1);
                intent35.putExtra("respuesta2D", respuesta2D);
                intent35.putExtra("respuesta3", respuesta3);
                intent35.putExtra("respuesta4D", "respD4b");
                startActivity(intent35);

            }
            else if (rbD4c.isChecked()==true){

                Intent intent36 = new Intent(this, VentResul.class);
                intent36.putExtra("nombre", nombre);
                intent36.putExtra("respuesta1", respuesta1);
                intent36.putExtra("respuesta2D", respuesta2D);
                intent36.putExtra("respuesta3", respuesta3);
                intent36.putExtra("respuesta4D", "respD4c");
                startActivity(intent36);

            }
            else if (rbD4d.isChecked()==true){

                Intent intent37 = new Intent(this, VentResul.class);
                intent37.putExtra("nombre", nombre);
                intent37.putExtra("respuesta1", respuesta1);
                intent37.putExtra("respuesta2D", respuesta2D);
                intent37.putExtra("respuesta3", respuesta3);
                intent37.putExtra("respuesta4D", "respD4d");
                startActivity(intent37);

            }
            else if (rbD4a.isChecked()==false || rbD4b.isChecked()==false || rbD4c.isChecked()==false || rbD4d.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }

    }

}
