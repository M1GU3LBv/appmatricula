package com.tarea.appmatricula;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculate = findViewById(R.id.button);
        TextView textViewResults = findViewById(R.id.textViewTotal);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí implementa la lógica de cálculo y actualización de los resultados
                // Puedes usar editTextName.getText().toString() para obtener el valor del campo de nombre
                // Actualiza textViewResults con los resultados calculados




            }
        });

        Spinner spinnerEscuela = findViewById(R.id.spinnerEscuela);
        Spinner spinnerCarrera = findViewById(R.id.spinnerCarrera);
        Spinner spinnerCuotas = findViewById(R.id.spinnerCuotas);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Escuelas_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEscuela.setAdapter(adapter);


        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Carrera_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCarrera.setAdapter(adapter2);


        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Cuotas_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCuotas.setAdapter(adapter3);
    }






}