package com.rigigo.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class Contacto extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecNac;
    private TextView tvTelefono;
    private TextView tvCorreo;
    private TextView tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvFecNac = (TextView) findViewById(R.id.tvFecNac);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvCorreo = (TextView) findViewById(R.id.tvCorreo);
        tvDesc = (TextView) findViewById(R.id.tvDesc);

        Bundle parametros = getIntent().getExtras();
        String nombres = parametros.getString("persona");
        String telefonos = parametros.getString("telefono");
        String correos = parametros.getString("correo");
        String desc = parametros.getString("describe");
        String nace = parametros.getString("nace");

        tvNombre.setText(nombres);
        tvTelefono.setText(telefonos);
        tvCorreo.setText(correos);
        tvDesc.setText(desc);
        tvFecNac.setText(nace);

    }

}
