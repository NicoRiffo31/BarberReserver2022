package com.example.barberreserver2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registrar extends AppCompatActivity {

    Button registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        //BOTON LOGIN
        registrarse=(Button)findViewById(R.id.btn_registrarse);

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( registrar.this, MainActivity.class);
                startActivity(i);

            }
        });

    }
}