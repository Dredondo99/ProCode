package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ventana2_resq2ABC extends AppCompatActivity {

    ImageButton house2, avanV2;
    RadioButton rbABC2a, rbABC2b, rbABC2c, rbABC2d;
    String nombre, respuesta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2_resq2_abc);

        house2 = findViewById(R.id.homeV2);
        avanV2 = findViewById(R.id.avanV2);

        rbABC2a = findViewById(R.id.RBVent2_1);
        rbABC2b = findViewById(R.id.RBVent2_2);
        rbABC2c = findViewById(R.id.RBVent2_3);
        rbABC2d = findViewById(R.id.RBVent2_4);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        respuesta1 = extras.getString("respuesta1");

    }

    public void moviV2 (View view){

        if (house2.isPressed()){

            Intent intent5 = new Intent(this, MainActivity.class);
            startActivity(intent5);

        }
        if (avanV2.isPressed()) {

            if (rbABC2a.isChecked()==true) {

                Intent intent7a = new Intent(this, ventana3_resq3.class);
                intent7a.putExtra("nombre", nombre);
                intent7a.putExtra("respuesta1", respuesta1);
                intent7a.putExtra("respuesta2ABC", "respABC2a");
                startActivity(intent7a);

            }
            else if (rbABC2b.isChecked()==true){

                Intent intent7b = new Intent(this, ventana3_resq3.class);
                intent7b.putExtra("nombre", nombre);
                intent7b.putExtra("respuesta1", respuesta1);
                intent7b.putExtra("respuesta2ABC", "respABC2b");
                startActivity(intent7b);

            }
            else if (rbABC2c.isChecked()==true){

                Intent intent7c = new Intent(this, ventana3_resq3.class);
                intent7c.putExtra("nombre", nombre);
                intent7c.putExtra("respuesta1", respuesta1);
                intent7c.putExtra("respuesta2ABC", "respABC2c");
                startActivity(intent7c);

            }
            else if (rbABC2d.isChecked()==true){

                Intent intent7d = new Intent(this, ventana3_resq3.class);
                intent7d.putExtra("nombre", nombre);
                intent7d.putExtra("respuesta1", respuesta1);
                intent7d.putExtra("respuesta2ABC", "respABC2d");
                startActivity(intent7d);

            }
            else if (rbABC2a.isChecked()==false & rbABC2b.isChecked()==false & rbABC2c.isChecked()==false & rbABC2d.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }
    }

}
