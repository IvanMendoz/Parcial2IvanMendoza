package com.example.parcial2ivanmendoza_tpis1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    List<String> empleados;
    List<String> cargo;
    List<String> compania;

    int[] img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lsvEmpleados);

        empleados = new ArrayList<String>();
        empleados.add("Alexander Pierrot");
        empleados.add("Carlos Lopez");
        empleados.add("Sara Bonz");
        empleados.add("Alexander Pierrot");
        empleados.add("Liliana Clarence");
        empleados.add("Benito Peralta");
        empleados.add("Juan Jaramillo");
        empleados.add("Christian Steps");
        empleados.add("Alexa Giraldo");
        empleados.add("Linda Murillo");
        empleados.add("Lizeth Astrada");

        cargo = new ArrayList<String>();
        cargo.add("CEO");
        cargo.add("Asistente");
        cargo.add("Directora de MArketing");
        cargo.add("Diseñadora de Productos");
        cargo.add("Supervisor de Ventas");
        cargo.add("CEO");
        cargo.add("CTO");
        cargo.add("Lead Programmer");
        cargo.add("Directora de Marketing");
        cargo.add("CEO");


        compania = new ArrayList<String>();
        compania.add("Insures S.O.");
        compania.add("Hospital Blue");
        compania.add("Electrical Parts Itd");
        compania.add("Creativa App");
        compania.add("Neumáticos Press");
        compania.add("Banco Nacional");
        compania.add("Cooperativa Verde");
        compania.add("FrutiSofy");
        compania.add("Seguros Boliver");
        compania.add("Concensionario Motolox");

        int[] imagenes = {
                R.drawable.lead_photo_1,
                R.drawable.lead_photo_2,
                R.drawable.lead_photo_3,
                R.drawable.lead_photo_4,
                R.drawable.lead_photo_5,
                R.drawable.lead_photo_6,
                R.drawable.lead_photo_7,
                R.drawable.lead_photo_8,
                R.drawable.lead_photo_9,
                R.drawable.lead_photo_10,
        };

        /*
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1 );
         */

        Adaptador adaptador = new Adaptador( this, R.layout.empleado, empleados, cargo, compania, imagenes );
        lista.setAdapter( adaptador );


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText( getApplicationContext(), "Selecciono> " + empleados.get( i ), Toast.LENGTH_LONG ).show();
                Intent intento = new Intent( getApplicationContext(), Empleado_seleccionado.class );
                intento.putExtra( "nombre", empleados.get( i ) );
                intento.putExtra( "cargo", cargo.get( i ) );
                intento.putExtra( "compania", compania.get( i ) );
                intento.putExtra( "imagen", imagenes[ i ] );
                startActivity( intento );
            }
        });




    }
}