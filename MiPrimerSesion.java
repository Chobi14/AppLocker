package com.example.luisgerman.misesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MiPrimerSesion extends AppCompatActivity {

    EditText UsernameEt, PasswordEt, usuariologea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_primer_sesion);
        UsernameEt = (EditText)findViewById(R.id.editText);
        PasswordEt = (EditText)findViewById(R.id.editText2);

        //pasar el parametro del usuario
        usuariologea = (EditText) findViewById(R.id.editText);
    }

    public void OnLogin(View view)
    {

        String usu = UsernameEt.getText().toString();
        String pas = PasswordEt.getText().toString();
        String type = "logeo";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,usu,pas);

        //pasar el parametro del usuario
        //Intent i = new Intent(this, universidad.class);
        //i.putExtra("direccion", usuariologea.getText().toString());
        //startActivity(i);

    }
}
