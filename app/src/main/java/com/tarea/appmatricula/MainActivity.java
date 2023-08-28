package com.tarea.appmatricula;

import android.content.Intent;
import android.widget.*;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.baseline_more_vert_24);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Spinner spinnerOptions = findViewById(R.id.spinnerEscuela);
        TextView textViewNombre = findViewById(R.id.editTextName);
        Button buttonCalculate = findViewById(R.id.calcular);
        Button buttonImprimir = findViewById(R.id.imprimir);
        TextView textViewCarrera = findViewById(R.id.textViewCostoCarrera);
        TextView textViewPension = findViewById(R.id.textViewPension);
        TextView textViewTotal = findViewById(R.id.textViewTotal);
        TextView textViewGastosAdicionales = findViewById(R.id.textViewGastosAdicionales);

        Spinner spinnerEscuela = findViewById(R.id.spinnerEscuela);
        Spinner spinnerCarrera = findViewById(R.id.spinnerCarrera);
        Spinner spinnerCuotas = findViewById(R.id.spinnerCuotas);
        Spinner spinnerGastosAdicionales = findViewById(R.id.spinnerGastosAdicionales);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Escuelas_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEscuela.setAdapter(adapter);


        spinnerEscuela.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String SelectedEscuela = adapterView.getItemAtPosition(i).toString();


                switch (SelectedEscuela) {

                    case "Ingenieria y Arquitectura":
                        ArrayList<String> Carreras = new ArrayList<>();
                        Carreras.add("Ingenieria de Sistemas");
                        Carreras.add("Ingenieria Civil");
                        Carreras.add("Ingenieria de Metalurgia");
                        Carreras.add("Ingenieria de Alimentos");
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, Carreras);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinnerCarrera.setAdapter(adapter);
                        break;
                    case "Salud":
                        Carreras = new ArrayList<>();
                        Carreras.add("Enfermeria");
                        Carreras.add("Psicologia");
                        Carreras.add("Medicina General");
                        Carreras.add("Nutricion");

                        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, Carreras);
                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        spinnerCarrera.setAdapter(adapter1);
                        break;
                    case "Ciencias Humanas y Educacion":
                        Carreras = new ArrayList<>();
                        Carreras.add("Educacion Inicial");
                        Carreras.add("Educacion Media");
                        Carreras.add("Educacion Superior");

                        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, Carreras);
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        spinnerCarrera.setAdapter(adapter2);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });


        spinnerCarrera.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String SelectedCarrera = adapterView.getItemAtPosition(i).toString();
                int CostoCarrera;
                switch (SelectedCarrera) {

                    case "Ingenieria de Sistemas":
                        textViewCarrera.setText("       " + 7000);
                        CostoCarrera = 7000;
                        break;
                    case "Ingenieria Civil":
                        textViewCarrera.setText("       " + 4000);
                        CostoCarrera = 4000;
                        break;
                    case "Ingenieria de Metalurgia":
                        textViewCarrera.setText("       " + 8000);
                        CostoCarrera = 8000;
                        break;
                    case "Ingenieria de Alimentos":
                        textViewCarrera.setText("       " + 5500);
                        CostoCarrera = 5500;
                        break;
                    case "Nutricion":
                        textViewCarrera.setText("       " + 5000);
                        CostoCarrera = 5000;
                        break;
                    case "Educacion Inicial":
                        textViewCarrera.setText("       " + 4000);
                        CostoCarrera = 4000;
                        break;
                    case "Educacion Media":
                        textViewCarrera.setText("       " + 4500);
                        CostoCarrera = 4500;
                        break;
                    case "Educacion Superior":
                        textViewCarrera.setText("       " + 5000);
                        CostoCarrera = 5000;
                        break;
                    case "Medicina General":
                        textViewCarrera.setText("       " + 10000);
                        CostoCarrera = 10000;
                        break;
                    case "Enfermeria":
                        textViewCarrera.setText("       " + 4000);
                        CostoCarrera = 6000;
                        break;

                    case "Psicologia":
                        textViewCarrera.setText("       " + 3500);
                        CostoCarrera = 7000;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        spinnerCuotas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Integer SelectedCuotas = Integer.parseInt(adapterView.getItemAtPosition(i).toString());
                switch (SelectedCuotas) {
                    case 1:
                        String temp = textViewCarrera.getText().toString();


                        textViewPension.setText("" + temp);
                        break;

                    case 2:
                        temp = textViewCarrera.getText().toString();
                        Double temp2 = Double.parseDouble(temp);
                        temp = "       " + temp2 / 2 + "";

                        textViewPension.setText(temp);
                        break;
                    case 3:
                        temp = textViewCarrera.getText().toString();
                        temp2 = Double.parseDouble(temp);
                        temp = "       " + temp2 / 3 + "";

                        textViewPension.setText(temp);
                        break;
                    case 4:
                        temp = textViewCarrera.getText().toString();
                        temp2 = Double.parseDouble(temp);
                        temp = "       " + temp2 / 4 + "";

                        textViewPension.setText(temp);
                        break;
                    case 5:
                        temp = textViewCarrera.getText().toString();
                        temp2 = Double.parseDouble(temp);
                        temp = "       " + temp2 / 5 + "";

                        textViewPension.setText(temp);


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.Cuotas_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCuotas.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.GastosAdicionales_array, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGastosAdicionales.setAdapter(adapter5);

        spinnerGastosAdicionales.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String SelectedGastosAdicionales = adapterView.getItemAtPosition(i).toString();
                switch (SelectedGastosAdicionales) {
                    case "Carnet Medio Pasaje":
                        textViewGastosAdicionales.setText("       " + 22);
                        break;
                    case "Carnet Biblioteca":
                        textViewGastosAdicionales.setText("       " + 25);


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cuotas = spinnerCuotas.getSelectedItem().toString();
                String gastosAdicionales = textViewGastosAdicionales.getText().toString();
                Double gastostemp = Double.parseDouble(gastosAdicionales);
                double add = 0;

                if (cuotas.equals("1")) {
                    add = 0;


                } else {
                    add = 0.12;
                    showToast(cuotas);
                }

                String temp = textViewCarrera.getText().toString();
                Double temp2 = Double.parseDouble(temp);
                temp = "       " + (gastostemp + temp2 * add + temp2);
                textViewTotal.setText(temp);


            }
        });

        buttonImprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String nombre = textViewNombre.getText().toString();
                String escuela = spinnerEscuela.getSelectedItem().toString();
                String carrera = spinnerCarrera.getSelectedItem().toString();
                String cuotas = spinnerCuotas.getSelectedItem().toString();
                String costoCarrera = textViewCarrera.getText().toString();
                String gastosAdicionales = textViewGastosAdicionales.getText().toString();
                String total = textViewTotal.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("escuela", escuela);
                intent.putExtra("carrera", carrera);
                intent.putExtra("cuotas", cuotas);
                intent.putExtra("costoCarrera", costoCarrera);
                intent.putExtra("gastosAdicionales", gastosAdicionales);
                intent.putExtra("total", total);

              startActivity(intent);



            }
        });





    }


    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}
