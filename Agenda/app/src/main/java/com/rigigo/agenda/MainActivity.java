package com.rigigo.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Siguiente(View v){
        EditText nombrePersona = (EditText) findViewById(R.id.etNombrePersona);
        EditText telPersona = (EditText) findViewById(R.id.etTelefono);
        EditText emailPerosna = (EditText) findViewById(R.id.etEmail);
        EditText descPersona = (EditText) findViewById(R.id.etDescripcion);
        EditText fecNac = (EditText) findViewById(R.id.etFecNac);

        Intent intent = new Intent(this, Contacto.class);
        intent.putExtra("persona", nombrePersona.getText().toString());
        intent.putExtra("telefono", telPersona.getText().toString());
        intent.putExtra("correo", emailPerosna.getText().toString());
        intent.putExtra("describe", descPersona.getText().toString());
        intent.putExtra("nace",fecNac.getText().toString());

        startActivity(intent);

    }
}
