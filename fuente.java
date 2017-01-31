package com.example.luisgerman.misesion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LuisGerman on 21/11/2016.
 */
public class fuente extends AppCompatActivity {

    String LaDireccion;
    //String ElCasillero;
    private Button boton51;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuente);

        //creamos el bundle para recibir los parametros del usuairo
        Bundle bundle = getIntent().getExtras();
        LaDireccion = bundle.getString("direccion");
       // ElCasillero = bundle.getString("direccioncasillero");
        //textView2.setText(LaDireccion);
        boton51 = (Button) findViewById(R.id.button51);
        boton51.setText(LaDireccion);
    }

    public void desaparta(View view)
    {
        String casillerodes = LaDireccion;
        //String pas = ElCasillero;
        String type = "desaparta";
        BackgroundWorker4 backgroundWorker4 = new BackgroundWorker4(this);
        backgroundWorker4.execute(type,casillerodes);
    }

    public void cerrar3(View view)
    {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
