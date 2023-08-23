package com.tarea.appmatricula;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.os.Bundle;

import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinnerOptions = findViewById(R.id.spinnerEscuela);
        Button buttonCalculate = findViewById(R.id.button);
        TextView textViewCarrera = findViewById(R.id.textViewCostoCarrera);

        Spinner spinnerEscuela = findViewById(R.id.spinnerEscuela);
        Spinner spinnerCarrera = findViewById(R.id.spinnerCarrera);
        Spinner spinnerCuotas = findViewById(R.id.spinnerCuotas);

//        buttonCalculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Aquí implementa la lógica de cálculo y actualización de los resultados
//                // Puedes usar editTextName.getText().toString() para obtener el valor del campo de nombre
//                // Actualiza textViewResults con los resultados calculados
//            }
//        });


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Escuelas_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEscuela.setAdapter(adapter);


        spinnerCarrera.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String SelectedCarrera = adapterView.getItemAtPosition(i).toString();

                switch (SelectedCarrera) {
                    case "Ingenieria de Sistemas":
                        textViewCarrera.setText("S/  " + 7000);
                        break;
                    case "Ingenieria Civil":
                        textViewCarrera.setText("S/  " + 4000);
                        break;
                    case "Psicologia":
                        textViewCarrera.setText("S/  " + 3500);
                        break;
                    case "Enfermeria":
                        textViewCarrera.setText("S/  " + 4500);
                        break;
                    case "Nutricion":
                        textViewCarrera.setText("S/  " + 4000);



                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Carrera_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCarrera.setAdapter(adapter2);


        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Cuotas_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCuotas.setAdapter(adapter3);
    }


    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}