package com.example.luisgerman.misesion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by LuisGerman on 21/11/2016.
 */
public class apde extends AppCompatActivity {

    String LaDireccion;
    String ElCasillero;
    private Button boton40;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apde);

        //creamos el bundle para recibir los parametros del usuairo
        Bundle bundle = getIntent().getExtras();
        LaDireccion = bundle.getString("direccion");
        ElCasillero = bundle.getString("direccioncasillero");
        //textView2.setText(LaDireccion);
        boton40 = (Button) findViewById(R.id.button40);
        boton40.setText(ElCasillero);
    }

    public void aparta(View view)
    {
        String usu = LaDireccion;
        String pas = ElCasillero;
        String type = "aparta";
        BackgroundWorker2 backgroundWorker2 = new BackgroundWorker2(this);
        backgroundWorker2.execute(type,usu,pas);
    }

    public void cambia(View view)
    {
        finish();
    }

    public void cerrar2(View view)
    {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
