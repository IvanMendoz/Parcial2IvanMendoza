package com.example.parcial2ivanmendoza_tpis1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Empleado_seleccionado extends AppCompatActivity {

    ImageView empleado;
    TextView nombre, cargo, compania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empleado_seleccionado);

        empleado = findViewById( R.id.imgEmpleadoSeleccionado );
        nombre = findViewById( R.id.txvNombreSeleccionado );
        cargo = findViewById( R.id.txvCargoSeleccionado );
        compania = findViewById( R.id.txvCompaniaSeleccionada );

        Bundle bundle = getIntent().getExtras();
        empleado.setImageResource( bundle.getInt("imagen") );
        nombre.setText( bundle.getString("nombre") );
        cargo.setText( bundle.getString("cargo") );
        compania.setText( bundle.getString("compania") );

    }
}