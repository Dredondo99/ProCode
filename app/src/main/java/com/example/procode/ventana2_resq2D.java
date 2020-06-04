package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ventana2_resq2D extends AppCompatActivity {

    ImageButton houseV2d, avanV2d;
    RadioButton rbD2a, rbD2b, rbD2c, rbD2d;
    String nombre, respuesta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2_resq2_d);

        houseV2d = findViewById(R.id.homeV2d);
        avanV2d = findViewById(R.id.avanV2d);

        rbD2a = findViewById(R.id.RBVent2_1d);
        rbD2b = findViewById(R.id.RBVent2_2d);
        rbD2c = findViewById(R.id.RBVent2_3d);
        rbD2d = findViewById(R.id.RBVent2_4d);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        respuesta1 = extras.getString("respuesta1");

    }

    public void moviV2d (View view){

        if (houseV2d.isPressed()) {

            Intent intent8 = new Intent(this, MainActivity.class);
            startActivity(intent8);

        }
        if (avanV2d.isPressed()) {

            if (rbD2a.isChecked()==true) {

                Intent intent10a = new Intent(this, ventana3_resq3.class);
                intent10a.putExtra("nombre", nombre);
                intent10a.putExtra("respuesta1", respuesta1);
                intent10a.putExtra("respuesta2D","respD2a");
                startActivity(intent10a);

            }
            else if (rbD2b.isChecked()==true){

                Intent intent10b = new Intent(this, ventana3_resq3.class);
                intent10b.putExtra("nombre", nombre);
                intent10b.putExtra("respuesta1", respuesta1);
                intent10b.putExtra("respuesta2D","respD2b");
                startActivity(intent10b);

            }
            else if (rbD2c.isChecked()==true){

                Intent intent10c = new Intent(this, ventana3_resq3.class);
                intent10c.putExtra("nombre", nombre);
                intent10c.putExtra("respuesta1", respuesta1);
                intent10c.putExtra("respuesta2D","respD2c");
                startActivity(intent10c);

            }
            else  if(rbD2d.isChecked()==true) {

                Intent intent10d = new Intent(this, ventana3_resq3.class);
                intent10d.putExtra("nombre", nombre);
                intent10d.putExtra("respuesta1", respuesta1);
                intent10d.putExtra("respuesta2D","respD2d");
                startActivity(intent10d);

            }
            else if (rbD2a.isChecked()==false & rbD2b.isChecked()==false & rbD2c.isChecked()==false || rbD2d.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }

    }

}
