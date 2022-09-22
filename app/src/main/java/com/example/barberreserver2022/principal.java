package com.example.barberreserver2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends AppCompatActivity {

    Button reservar;
    Button barberos;
    Button ubicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //BOTON reservar
        reservar=(Button)findViewById(R.id.btn_reservar);

        reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( principal.this, Reservar.class);
                startActivity(i);

            }
        });

        //BOTON BARBEROS
        barberos=(Button)findViewById(R.id.btn_barberos);

        barberos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( principal.this, barberos.class);
                startActivity(i);

            }
        });

        //BOTON UBICACION
        ubicacion=(Button)findViewById(R.id.btn_ubicacion);

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( principal.this, ubicacion.class);
                startActivity(i);

            }
        });


    }
}