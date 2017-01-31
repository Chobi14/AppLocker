package com.example.luisgerman.misesion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by LuisGerman on 19/11/2016.
 */
public class universidad extends AppCompatActivity {

    //private Button button2;
     String LaDireccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universidad);

        //creamos el bundle para recibir los parametros del usuairo
        Bundle bundle = getIntent().getExtras();
        LaDireccion = bundle.getString("direccion");
        //textView2.setText(LaDireccion);
        //button2 = (Button) findViewById(R.id.button2);
        //button2.setText(LaDireccion);
    }

    public void segunda(View view)
    {
        Intent i = new Intent(this, casilleroa.class);
        i.putExtra("direccion", LaDireccion);
        startActivity(i);
    }

    public void tercera(View view)
    {
        Intent i = new Intent(this, casillerob.class);
        i.putExtra("direccion", LaDireccion);
        startActivity(i);
    }

    public void cuarta(View view)
    {
        Intent i = new Intent(this, casilleroc.class);
        i.putExtra("direccion", LaDireccion);
        startActivity(i);
    }

    public void quinta(View view)
    {
        Intent i = new Intent(this, casillerod.class);
        i.putExtra("direccion", LaDireccion);
        startActivity(i);
    }

    public void sexta(View view)
    {

        String usu = LaDireccion;
        String type = "elmio";
        BackgroundWorker3 backgroundWorker3 = new BackgroundWorker3(this);
        backgroundWorker3.execute(type,usu);
    }

    public void cerrar(View view)
    {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
