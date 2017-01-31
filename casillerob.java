package com.example.luisgerman.misesion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by LuisGerman on 21/11/2016.
 */
public class casillerob extends AppCompatActivity implements View.OnClickListener{
    //private TextView textView5;
    Button NumCasillero;
    String LaDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //aqui llamamos a nuestro xml de casillero b
        setContentView(R.layout.casillerob);

        //creamos el bundle para recibir los parametros del usuairo
        Bundle bundle = getIntent().getExtras();
        LaDireccion = bundle.getString("direccion");
       /* textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(LaDireccion);*/

        findViewById(R.id.button19).setOnClickListener(this);
        findViewById(R.id.button20).setOnClickListener(this);
        findViewById(R.id.button21).setOnClickListener(this);
        findViewById(R.id.button22).setOnClickListener(this);
        findViewById(R.id.button23).setOnClickListener(this);
        findViewById(R.id.button24).setOnClickListener(this);
        findViewById(R.id.button45).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String usu = LaDireccion;
        String locker = " ";
        String type = "aparta";
        Button boton;
        Intent i = new Intent(this, apde.class);



        switch (view.getId()) {
            case R.id.button19:
                boton = (Button) findViewById(R.id.button19);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button20:
                boton = (Button) findViewById(R.id.button20);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button21:
                boton = (Button) findViewById(R.id.button21);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button22:
                boton = (Button) findViewById(R.id.button22);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button23:
                boton = (Button) findViewById(R.id.button23);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button24:
                boton = (Button) findViewById(R.id.button24);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button45:
                Intent pli = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                pli.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pli);
                break;
            default:
                break;
        }
    }
}
