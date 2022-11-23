package com.example.barberreserver2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

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

                Intent i = new Intent( Principal.this, Reservar.class);
                startActivity(i);

            }
        });

        //BOTON BARBEROS
        barberos=(Button)findViewById(R.id.btn_barberos);

        barberos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( Principal.this, Barberos.class);
                startActivity(i);

            }
        });

        //BOTON UBICACION
        ubicacion=(Button)findViewById(R.id.btn_ubicacion);

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( Principal.this, Maps.class);
                startActivity(i);

            }
        });

        //BOTON LaBarberia
        ubicacion=(Button)findViewById(R.id.btn_labarberia);

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( Principal.this, Labarberia.class);
                startActivity(i);

            }
        });


    }
}