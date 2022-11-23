package com.example.barberreserver2022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.barberreserver2022.Database.DataBaseQueryReservar;
import com.example.barberreserver2022.Database.DatabaseHelper;
import com.example.barberreserver2022.modelos.ReservaClass;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;

public class Reservar extends AppCompatActivity implements View.OnClickListener {
    Button btn_fecha, btn_hora, btn_reservar;
    EditText text_fecha, text_hora;
    private int ano,mes,dia,hora,minutos;

   // List<ReservaClass> listaDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar);

        btn_fecha=(Button) findViewById(R.id.btn_fecha);
        btn_hora=(Button) findViewById(R.id.btn_hora);
        text_fecha=(EditText) findViewById(R.id.text_fecha);
        text_hora=(EditText) findViewById(R.id.text_hora);

        btn_reservar=(Button) findViewById(R.id.btn_realizarReserva);

        btn_fecha.setOnClickListener(this);
        btn_hora.setOnClickListener(this);

        this.obtenerListaReserva();

        btn_reservar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                ReservaClass reservaNueva = new ReservaClass();

                reservaNueva.setFecha(text_fecha.getText().toString());
                reservaNueva.setHora(text_hora.getText().toString());

                DataBaseQueryReservar db = new DataBaseQueryReservar(getBaseContext());
                db.insertaReserva(reservaNueva);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view==btn_fecha){
            final Calendar c = Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        text_fecha.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                    }
                }
                ,ano,mes,dia);
                datePickerDialog.show();
            }
        }
        if (view==btn_hora){
            final Calendar c = Calendar.getInstance();
            hora=c.get(Calendar.HOUR_OF_DAY);
            minutos=c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hoursOfDay, int minute) {
                    text_hora.setText(hoursOfDay+":"+minute);
                }
            },hora,minutos,false);
            timePickerDialog.show();
        }
    }

    public void obtenerListaReserva(){

    }
}