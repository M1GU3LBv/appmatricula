package com.tarea.appmatricula;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.mybutton);
        actionBar.setDisplayHomeAsUpEnabled(true);


        TextView nombre = findViewById(R.id.nombre);

        // key must be same which is send by first activity
        String nombre1 = intent.getStringExtra("nombre");
        // display the string into textView
        nombre.setText(nombre1);

        String Escuela = intent.getStringExtra("escuela");
        TextView Escuela1 = findViewById(R.id.Escuela);
        Escuela1.setText(Escuela);

        String Carrera = intent.getStringExtra("carrera");
        TextView Carrera1 = findViewById(R.id.Carrera);
        Carrera1.setText(Carrera);

        String Cuotas = intent.getStringExtra("cuotas");
        TextView Cuotas1 = findViewById(R.id.Cuotas);
        Cuotas1.setText(Cuotas);

        String GastosAdicionales = intent.getStringExtra("gastosAdicionales");
        TextView GastosAdicionales1 = findViewById(R.id.GastosAdicionales);
        GastosAdicionales1.setText(GastosAdicionales);

        String CostoCarrera = intent.getStringExtra("costoCarrera");
        TextView CostoCarrera1 = findViewById(R.id.CostoCarrera);
        CostoCarrera1.setText(CostoCarrera);
        String Pension = intent.getStringExtra("pension");
        TextView Pension1 = findViewById(R.id.Cuotas);
        Pension1.setText(Pension);
        String Total = intent.getStringExtra("total");
        TextView Total1 = findViewById(R.id.Total);
        Total1.setText(Total);




















    }






    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
