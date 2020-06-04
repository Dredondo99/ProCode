package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ventana3_resq3 extends AppCompatActivity {

    ImageButton houseV3, avanV3;
    RadioButton rb3a, rb3b, rb3c;
    String nombre, respuesta1, respuesta2ABC, respuesta2D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana3_resq3);

        houseV3 = findViewById(R.id.homeV3);
        avanV3 = findViewById(R.id.avanV3);

        rb3a = findViewById(R.id.RBVent3_1);
        rb3b = findViewById(R.id.RBVent3_2);
        rb3c = findViewById(R.id.RBVent3_3);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        respuesta1 = extras.getString("respuesta1");
        respuesta2ABC = extras.getString("respuesta2ABC");
        respuesta2D = extras.getString("respuesta2D");

    }

    public void moviV3(View view){

        if (houseV3.isPressed()) {

            Intent intent11 = new Intent(this, MainActivity.class);
            startActivity(intent11);

        }
        if (avanV3.isPressed()) {

            if (rb3a.isChecked()==true){

                if (respuesta1.equals("resp1a")){

                    Intent intent13aa = new Intent(this, ventana4_resq4A.class);
                    intent13aa.putExtra("nombre", nombre);
                    intent13aa.putExtra("respuesta1", respuesta1);
                    intent13aa.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13aa.putExtra("respuesta2D", respuesta2D);
                    intent13aa.putExtra("respuesta3", "resp3a");
                    startActivity(intent13aa);

                }
                else if (respuesta1.equals("resp1b")){

                    Intent intent13ab = new Intent(this, ventana4_resq4B.class);
                    intent13ab.putExtra("nombre", nombre);
                    intent13ab.putExtra("respuesta1", respuesta1);
                    intent13ab.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13ab.putExtra("respuesta2D", respuesta2D);
                    intent13ab.putExtra("respuesta3", "resp3a");
                    startActivity(intent13ab);

                }
                else if (respuesta1.equals("resp1c")){

                    Intent intent13ac = new Intent(this, ventana4_resq4C.class);
                    intent13ac.putExtra("nombre", nombre);
                    intent13ac.putExtra("respuesta1", respuesta1);
                    intent13ac.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13ac.putExtra("respuesta2D", respuesta2D);
                    intent13ac.putExtra("respuesta3", "resp3a");
                    startActivity(intent13ac);

                }
                else if (respuesta1.equals("resp1d")){

                    Intent intent13ad = new Intent(this, ventana4_resq4D.class);
                    intent13ad.putExtra("nombre", nombre);
                    intent13ad.putExtra("respuesta1", respuesta1);
                    intent13ad.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13ad.putExtra("respuesta2D", respuesta2D);
                    intent13ad.putExtra("respuesta3", "resp3a");
                    startActivity(intent13ad);

                }

            }
            else if (rb3b.isChecked()==true){

                if (respuesta1.equals("resp1a")){

                    Intent intent13ba = new Intent(this, ventana4_resq4A.class);
                    intent13ba.putExtra("nombre", nombre);
                    intent13ba.putExtra("respuesta1", respuesta1);
                    intent13ba.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13ba.putExtra("respuesta2D", respuesta2D);
                    intent13ba.putExtra("respuesta3", "resp3b");
                    startActivity(intent13ba);

                }
                else if (respuesta1.equals("resp1b")){

                    Intent intent13bb = new Intent(this, ventana4_resq4B.class);
                    intent13bb.putExtra("nombre", nombre);
                    intent13bb.putExtra("respuesta1", respuesta1);
                    intent13bb.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13bb.putExtra("respuesta2D", respuesta2D);
                    intent13bb.putExtra("respuesta3", "resp3b");
                    startActivity(intent13bb);

                }
                else if (respuesta1.equals("resp1c")){

                    Intent intent13bc = new Intent(this, ventana4_resq4C.class);
                    intent13bc.putExtra("nombre", nombre);
                    intent13bc.putExtra("respuesta1", respuesta1);
                    intent13bc.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13bc.putExtra("respuesta2D", respuesta2D);
                    intent13bc.putExtra("respuesta3", "resp3b");
                    startActivity(intent13bc);

                }
                else if (respuesta1.equals("resp1d")){

                    Intent intent13bd = new Intent(this, ventana4_resq4D.class);
                    intent13bd.putExtra("nombre", nombre);
                    intent13bd.putExtra("respuesta1", respuesta1);
                    intent13bd.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13bd.putExtra("respuesta2D", respuesta2D);
                    intent13bd.putExtra("respuesta3", "resp3b");
                    startActivity(intent13bd);

                }

            }
            else if (rb3c.isChecked()==true){

                if (respuesta1.equals("resp1a")){

                    Intent intent13ca = new Intent(this, ventana4_resq4A.class);
                    intent13ca.putExtra("nombre", nombre);
                    intent13ca.putExtra("respuesta1", respuesta1);
                    intent13ca.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13ca.putExtra("respuesta2D", respuesta2D);
                    intent13ca.putExtra("respuesta3", "resp3c");
                    startActivity(intent13ca);

                }
                else if (respuesta1.equals("resp1b")){

                    Intent intent13cb = new Intent(this, ventana4_resq4B.class);
                    intent13cb.putExtra("nombre", nombre);
                    intent13cb.putExtra("respuesta1", respuesta1);
                    intent13cb.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13cb.putExtra("respuesta2D", respuesta2D);
                    intent13cb.putExtra("respuesta3", "resp3c");
                    startActivity(intent13cb);

                }
                else if (respuesta1.equals("resp1c")){

                    Intent intent13cc = new Intent(this, ventana4_resq4C.class);
                    intent13cc.putExtra("nombre", nombre);
                    intent13cc.putExtra("respuesta1", respuesta1);
                    intent13cc.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13cc.putExtra("respuesta2D", respuesta2D);
                    intent13cc.putExtra("respuesta3", "resp3c");
                    startActivity(intent13cc);

                }
                else if (respuesta1.equals("resp1d")){

                    Intent intent13cd = new Intent(this, ventana4_resq4D.class);
                    intent13cd.putExtra("nombre", nombre);
                    intent13cd.putExtra("respuesta1", respuesta1);
                    intent13cd.putExtra("respuesta2ABC", respuesta2ABC);
                    intent13cd.putExtra("respuesta2D", respuesta2D);
                    intent13cd.putExtra("respuesta3", "resp3c");
                    startActivity(intent13cd);

                }

            }
            else if (rb3a.isChecked()==false & rb3b.isChecked()==false & rb3c.isChecked()==false){

                Toast.makeText(this, "Debes seleccionar alguna respuesta", Toast.LENGTH_SHORT).show();

            }

        }

    }

}
