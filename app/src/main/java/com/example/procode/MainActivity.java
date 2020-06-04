package com.example.procode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tituloMain;
    ImageButton inte, iniciar;
    ImageView ust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tituloMain = findViewById(R.id.titMain);
        inte = findViewById(R.id.inteMain);
        iniciar = findViewById(R.id.avanMain);
        ust = findViewById(R.id.ustglobal);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "BebasNeue-Bold.ttf");
        tituloMain.setTypeface(typeface);

    }

    public void interrogar(View view){

        Intent intent1 = new Intent (this, ventInte.class);
        startActivity(intent1);

    }

    public void avanzar(View view){

        Intent intent2 = new Intent(this, VentNom.class);
        startActivity(intent2);

    }

    public void ustGlobal(View view){

        Uri uri = Uri.parse("https://www.ust-global.com/");
        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent3);
    }

}
