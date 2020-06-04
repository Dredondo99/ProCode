package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class VentResul extends AppCompatActivity {

    EditText nomU;
    ImageButton houseResul;
    Button busca, guarda;
    TextView cajon1, cajon2, cajon3, cajon4, opcion1, opcion2;
    String nombre, nombre2, respuesta1, respuesta2ABC, respuesta2D, respuesta3, respuesta4A, respuesta4B, respuesta4C, respuesta4D;

    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vent_resul);

        houseResul = findViewById(R.id.homeVentResul);
        busca = findViewById(R.id.BuscarResul);
        guarda = findViewById(R.id.GuardarResul);
        nomU = findViewById(R.id.nomUser);
        cajon1 = findViewById(R.id.resp1);
        cajon2 = findViewById(R.id.resp2);
        cajon3 = findViewById(R.id.resp3);
        cajon4 = findViewById(R.id.resp4);
        opcion1 = findViewById(R.id.opc1);
        opcion2 = findViewById(R.id.opc2);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        nombre2 = extras.getString("nombre2");

        if (nombre.equals("nombre2")){

            nomU.setText(nombre2);

        }
        else{

            nomU.setText(nombre);

            respuesta1 = extras.getString("respuesta1");
            respuesta2ABC = extras.getString("respuesta2ABC");
            respuesta2D = extras.getString("respuesta2D");
            respuesta3 = extras.getString("respuesta3");
            respuesta4A = extras.getString("respuesta4A");
            respuesta4B = extras.getString("respuesta4B");
            respuesta4C = extras.getString("respuesta4C");
            respuesta4D = extras.getString("respuesta4D");

            if (respuesta1.equals("resp1a")){

                comprobar();

            }else if (respuesta1.equals("resp1b")){

                comprobar2();

            }else if (respuesta1.equals("resp1c")){

                comprobar3();

            }else{

                comprobar4();

            }

        }

    }

    public void comprobar() {

        //COMBINACIONES RESPUESTA 1A
        if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4a")) {

            opcion1.setText("PHP");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("Google Chrome");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4b")) {

            opcion1.setText("PHP");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4c")) {

            opcion1.setText("PHP");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4d")) {

            opcion1.setText("PHP");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4a")) {

            opcion1.setText("HTML");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4a")) {

            opcion1.setText("CCS");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4a")) {

            opcion1.setText("CSS");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4a")) {

            opcion1.setText("HTML");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4a")) {

            opcion1.setText("PHP");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4b")) {

            opcion1.setText("CCS");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4c")) {

            opcion1.setText("CCS");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4d")) {

            opcion1.setText("HTML");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4b")) {

            opcion1.setText("PHP");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Simples");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4c")) {

            opcion1.setText("PHP");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4d")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4b")) {

            opcion1.setText("HTML");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4c")) {

            opcion1.setText("HTML");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4d")) {

            opcion1.setText("CCS");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4b")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4c")) {

            opcion1.setText("CCS");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simles");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4d")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, comlejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4b")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4c")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4d")) {

            opcion1.setText("HTML");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4c")) {

            opcion1.setText("CCS");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Simples");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4a")) {

            opcion1.setText("PHP");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Simples");
            cajon4.setText("Google Chrome");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4a")) {

            opcion1.setText("CCS");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Google Chrome");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4a")) {

            opcion1.setText("HTML");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Google Chrome");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4a")) {

            opcion1.setText("HTML");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Google Chrome");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4d")) {

            opcion1.setText("HTML");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4b")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Complejos");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4c")) {

            opcion1.setText("PHP");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Complejos");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4b")) {

            opcion1.setText("PHP");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4d")) {

            opcion1.setText("PHP");
            opcion2.setText("HTML");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Complejos");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4d")) {

            opcion1.setText("HTML");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4b")) {

            opcion1.setText("HTML");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Comlpejos");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4c")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4a")) {

            opcion1.setText("HTML");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Simples");
            cajon4.setText("Google Chrome");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4d")) {

            opcion1.setText("CCS");
            opcion2.setText("JAVASCRIPT");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4d")) {

            opcion1.setText("PHP");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Complejos");
            cajon4.setText("Es indiferente");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4c")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Simples");
            cajon4.setText("Internet Explorer");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4b")) {

            opcion1.setText("PHP");
            opcion2.setText("CCS");
            cajon1.setText("Página web");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos  y simples");
            cajon4.setText("Mozilla Firefox");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4A.equals("respA4a")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("Google Chrome");

        } else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4A.equals("respA4c")) {

            opcion1.setText("CCS");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Para niños");
            cajon3.setText("Complejos");
            cajon4.setText("Internet Explorer");

        }
        else if (respuesta1.equals("resp1a") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4A.equals("respA4b")) {

            opcion1.setText("CCS");
            opcion2.setText("PHP");
            cajon1.setText("Página web");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Mozilla Firefox");

        }

    }
        public void comprobar2 () {

            //COMPROBACIÓN RESPUESTA 1B

            if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4a")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Complejos");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4b")) {

                opcion1.setText("SWIFT");
                opcion2.setText("OBJECTIVE-C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Complejos");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4c")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Complejos");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4d")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Complejos");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4a")) {

                opcion1.setText("PYTHON");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4a")) {

                opcion1.setText("C++");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4a")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4a")) {

                opcion1.setText("C");
                opcion2.setText("C++");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4a")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4b")) {

                opcion1.setText("SWIFT");
                opcion2.setText("OBJECTIVE-C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4c")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4d")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4b")) {

                opcion1.setText("OBJECTIVE-C");
                opcion2.setText("SWIFT");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Simples");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4c")) {

                opcion1.setText("C++");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4d")) {

                opcion1.setText("JAVA");
                opcion2.setText("C++");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4b")) {

                opcion1.setText("SWIFT");
                opcion2.setText("OBJECTIVE-C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4c")) {

                opcion1.setText("PYTHON");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Simples");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4d")) {

                opcion1.setText("JAVA");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4b")) {

                opcion1.setText("OBJECTIVE-C");
                opcion2.setText("SWIFT");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Simples");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4c")) {

                opcion1.setText("C++");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Intermedio, complejos y simles");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4d")) {

                opcion1.setText("JAVA");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Intermedio, comlejos y simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4b")) {

                opcion1.setText("OBJECTIVE-C");
                opcion2.setText("SWIFT");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Simples");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4c")) {

                opcion1.setText("JAVA");
                opcion2.setText("C++");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4d")) {

                opcion1.setText("C++");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4c")) {

                opcion1.setText("PYTHON");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Simples");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4a")) {

                opcion1.setText("JAVA");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4a")) {

                opcion1.setText("C++");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4a")) {

                opcion1.setText("C++");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4a")) {

                opcion1.setText("JAVA");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4d")) {

                opcion1.setText("PYTHON");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4b")) {

                opcion1.setText("SWIFT");
                opcion2.setText("OBJECTIVE-C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Complejos");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4c")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Complejos");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4b")) {

                opcion1.setText("SWIFT");
                opcion2.setText("OBJECTIVE-C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4d")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Complejos");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4d")) {

                opcion1.setText("PYTHON");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4b")) {

                opcion1.setText("SWIFT");
                opcion2.setText("OBJECTIVE-C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Comlpejos");
                cajon4.setText("Mac");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4c")) {

                opcion1.setText("JAVA");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Profesionales");
                cajon3.setText("Simples");
                cajon4.setText("Linux");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4a")) {

                opcion1.setText("PYTHON");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Simples");
                cajon4.setText("Windows");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4d")) {

                opcion1.setText("C");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4d")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Complejos");
                cajon4.setText("Solaris");

            } else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4c")) {

                opcion1.setText("JAVA");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Simples");
                cajon4.setText("Linux");

            }
            else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4b")) {

                opcion1.setText("C");
                opcion2.setText("PYTHON");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Todo tipo");
                cajon3.setText("Intermedio, complejos  y simples");
                cajon4.setText("MAC");

            }
            else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4B.equals("respB4a")) {

                opcion1.setText("PYTHON");
                opcion2.setText("JAVA");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Simples");
                cajon4.setText("Windows");

            }
            else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4B.equals("respB4c")) {

                opcion1.setText("C++");
                opcion2.setText("C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Para niños");
                cajon3.setText("Complejos");
                cajon4.setText("Linux");

            }
            else if (respuesta1.equals("resp1b") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4B.equals("respB4b")) {

                opcion1.setText("SWIFT");
                opcion2.setText("OBJECTIVE-C");
                cajon1.setText("Aplicación de escritorio");
                cajon2.setText("Usuario medio");
                cajon3.setText("Intermedio, complejos y simples");
                cajon4.setText("Mac");

            }
        }



    public void comprobar3() {

        //COMPROBACIÓN RESPUESTA 1C -------------------------------------------------------------------------------------------------------

        if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4a")) {

            opcion1.setText("JAVA");
            opcion2.setText("C#");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4b")) {

            opcion1.setText("JAVA");
            opcion2.setText("C#");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4c")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4d")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Complejos");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4a")) {

            opcion1.setText("TYPESCRIPT");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4a")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4a")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4a")) {

            opcion1.setText("JAVA");
            opcion2.setText("C#");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4a")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4b")) {

            opcion1.setText("SWIFT");
            opcion2.setText("OBJECTIVE-C");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4c")) {

            opcion1.setText("JAVA");
            opcion2.setText("C#");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4d")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4b")) {

            opcion1.setText("OBJECTIVE-C");
            opcion2.setText("SWIFT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Simples");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4c")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4d")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4b")) {

            opcion1.setText("SWIFT");
            opcion2.setText("OBJECTIVE-C");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4c")) {

            opcion1.setText("TYPESCRIPT");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4d")) {

            opcion1.setText("JAVA");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4b")) {

            opcion1.setText("OBJECTIVE-C");
            opcion2.setText("SWIFT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4c")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simles");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4d")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, comlejos y simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4b")) {

            opcion1.setText("OBJECTIVE-C");
            opcion2.setText("SWIFT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4c")) {

            opcion1.setText("JAVA");
            opcion2.setText("KOTLIN");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4d")) {

            opcion1.setText("TYPESCRIPT");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4c")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Simples");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4a")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4a")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4a")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4a")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("C#");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4d")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4b")) {

            opcion1.setText("SWIFT");
            opcion2.setText("OBJECTIVE-C");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Complejos");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4c")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Complejos");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4b")) {

            opcion1.setText("SWIFT");
            opcion2.setText("OBJECTIVE-C");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4d")) {

            opcion1.setText("JAVA");
            opcion2.setText("C#");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Complejos");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4d")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4b")) {

            opcion1.setText("SWIFT");
            opcion2.setText("OBJECTIVE-C");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Comlpejos");
            cajon4.setText("IOS");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2a") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4c")) {

            opcion1.setText("JAVA");
            opcion2.setText("KOTLIN");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Profesionales");
            cajon3.setText("Simples");
            cajon4.setText("Windows Phone");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4a")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Simples");
            cajon4.setText("Android");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4d")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4d")) {

            opcion1.setText("C#");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Complejos");
            cajon4.setText("Linux");

        } else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4c")) {

            opcion1.setText("JAVA");
            opcion2.setText("TYPESCRIPT");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Simples");
            cajon4.setText("Windows Phone");

        }
        else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2d") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4b")) {

            opcion1.setText("KOTLIN");
            opcion2.setText("C#");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Todo tipo");
            cajon3.setText("Intermedio, complejos  y simples");
            cajon4.setText("IOS");

        }
        else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3b") & respuesta4C.equals("respC4a")) {

            opcion1.setText("JAVA");
            opcion2.setText("KOTLIN");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Simples");
            cajon4.setText("Android");

        }
        else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2b") & respuesta3.equals("resp3a") & respuesta4C.equals("respC4c")) {

            opcion1.setText("JAVASCRIPT");
            opcion2.setText("JAVA");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Para niños");
            cajon3.setText("Complejos");
            cajon4.setText("Windows Phone");

        }
        else if (respuesta1.equals("resp1c") & respuesta2ABC.equals("respABC2c") & respuesta3.equals("resp3c") & respuesta4C.equals("respC4b")) {

            opcion1.setText("SWIFT");
            opcion2.setText("OBJECTIVE-C");
            cajon1.setText("Aplicación móvil");
            cajon2.setText("Usuario medio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("IOS");

        }

    }

    public void comprobar4(){

        //COMBINACIONES RESPUESTA 1D
        if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2a") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4a")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Empresa");
            cajon3.setText("Comlejos");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4a")) {

            opcion1.setText("PHP");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Comlejos");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4a")) {

            opcion1.setText("PERL");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Comlejos");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4a")) {

            opcion1.setText("JSP");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Comlejos");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4b")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4c")) {

            opcion1.setText("PERL");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4d")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PERL");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4b")) {

            opcion1.setText("PHP");
            opcion2.setText("PERL");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Simples");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4c")) {

            opcion1.setText("JSP");
            opcion2.setText("PERL");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Simples");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4d")) {

            opcion1.setText("JSP");
            opcion2.setText("PERL");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Simples");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4b")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4c")) {

            opcion1.setText("PERL");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4d")) {

            opcion1.setText("PHP");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4b")) {

            opcion1.setText("PERL");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Simples");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4c")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PERL");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4d")) {

            opcion1.setText("JSP");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2a") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4b")) {

            opcion1.setText("PHP");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Empresa");
            cajon3.setText("Simples");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2a") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4c")) {

            opcion1.setText("PERL");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Empresa");
            cajon3.setText("Intermedios, complejos y simples");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2a") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4d")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Empresa");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4c")) {

            opcion1.setText("PHP");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Simples");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4a")) {

            opcion1.setText("PERL");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Simples");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4a")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PERL");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4a")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4a")) {

            opcion1.setText("PHP");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2a") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4d")) {

            opcion1.setText("PHP");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Empresa");
            cajon3.setText("Simples");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4b")) {

            opcion1.setText("PERL");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4c")) {

            opcion1.setText("JSP");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2a") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4b")) {

            opcion1.setText("JSP");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Empresa");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4d")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PERL");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4d")) {

            opcion1.setText("PERL");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Simples");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4b")) {

            opcion1.setText("JSP");
            opcion2.setText("ASP.NET");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor dedicado");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2a") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4c")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Empresa");
            cajon3.setText("Simples");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4a")) {

            opcion1.setText("PERL");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Simples");
            cajon4.setText("Servidor web");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4d")) {

            opcion1.setText("PHP");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4d")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor en la nube");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4c")) {

            opcion1.setText("PERL");
            opcion2.setText("JSP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Simples");
            cajon4.setText("Servidor FTP");

        } else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2d") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4b")) {

            opcion1.setText("ASP.NET");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación móvil");
            cajon3.setText("Intermedio, complejos  y simples");
            cajon4.setText("Servidor dedicado");

        }
        else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3b") & respuesta4D.equals("respD4a")) {

            opcion1.setText("PERL");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Simples");
            cajon4.setText("Servidor web");

        }
        else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2b") & respuesta3.equals("resp3a") & respuesta4D.equals("respD4c")) {

            opcion1.setText("JSP");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Página web");
            cajon3.setText("Complejos");
            cajon4.setText("Servidor FTP");

        }
        else if (respuesta1.equals("resp1d") & respuesta2D.equals("respD2c") & respuesta3.equals("resp3c") & respuesta4D.equals("respD4b")) {

            opcion1.setText("JSP");
            opcion2.setText("PHP");
            cajon1.setText("Programar un servidor");
            cajon2.setText("Aplicación de escritorio");
            cajon3.setText("Intermedio, complejos y simples");
            cajon4.setText("Servidor dedicado");

        }

    }

    public void moviResul(View view){

        if (houseResul.isPressed()){

            Intent intentRes = new Intent(this, MainActivity.class);
            startActivity(intentRes);

        }
        if (guarda.isPressed()){

            ejecutarServicio("http://192.168.1.88:8080/ProCode/guardar_respuestas.php");

        }
        if (busca.isPressed()){

            buscarRespuestas("http://localhost:8080/procode/buscar_respuestas.php?nombre="+nomU.getText()+"");

        }

    }

    public void ejecutarServicio(String URL){

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "OPERACIÓN COMPLETADA", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String, String>();
                parametros.put("nombre",nomU.getText().toString());
                parametros.put("opcion1",opcion1.getText().toString());
                parametros.put("opcion2",opcion2.getText().toString());
                parametros.put("respuesta1",cajon1.getText().toString());
                parametros.put("respuesta2",cajon2.getText().toString());
                parametros.put("respuesta3",cajon3.getText().toString());
                parametros.put("respuesta4",cajon4.getText().toString());
                return parametros;
            }
        };
        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }

    public void buscarRespuestas(String URL){

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {

                    try {

                        jsonObject = response.getJSONObject(i);
                        opcion1.setText(jsonObject.getString("opcion1"));
                        opcion2.setText(jsonObject.getString("opcion2"));
                        cajon1.setText(jsonObject.getString("respuesta1"));
                        cajon2.setText(jsonObject.getString("respuesta2"));
                        cajon3.setText(jsonObject.getString("respuesta3"));
                        cajon4.setText(jsonObject.getString("respuesta4"));

                    } catch (JSONException e) {

                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();

                    }

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getApplicationContext(),"ERROR DE CONEXIÓN", Toast.LENGTH_SHORT).show();

            }
        }
        );

        requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);

    }

}
