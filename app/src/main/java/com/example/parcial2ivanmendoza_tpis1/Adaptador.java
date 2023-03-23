package com.example.parcial2ivanmendoza_tpis1;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    int layout;
    List<String> empleados;
    List<String> cargo;
    List<String> compania;
    int [] imagenes;

    public Adaptador(Context contexto, int layout, List<String> nombreEmpleado, List<String> cargoEmpleado, List<String> companiaEmpleado, int[] imagenes) {
        this.contexto = contexto;
        this.layout = layout;
        this.empleados = nombreEmpleado;
        this.cargo = cargoEmpleado;
        this.compania = companiaEmpleado;
        this.imagenes = imagenes;
    }

    @Override
    public int getCount() {
        return cargo.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater layoutInflater = LayoutInflater.from( contexto );
        v = layoutInflater.inflate( R.layout.empleado, null );

        TextView txtNombre = v.findViewById( R.id.txvNombre );
        txtNombre.setText(empleados.get( i ));

        TextView txtCargo = v.findViewById( R.id.txvCargo );
        txtCargo.setText(cargo.get( i ));

        TextView txtCompania = v.findViewById( R.id.txvCompania );
        txtCompania.setText(compania.get( i ));

        ImageView img = v.findViewById( R.id.imgEmpleado );
        img.setImageResource( imagenes[ i ] );

        return v;
    }
}
