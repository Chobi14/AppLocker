package com.example.luisgerman.misesion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LuisGerman on 21/11/2016.
 */
public class casillerod extends AppCompatActivity implements View.OnClickListener{
    //private TextView textView5;
    Button NumCasillero;
    String LaDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //aqui llamamos a nuestro xml de casillero d
        setContentView(R.layout.casillerod);

        //creamos el bundle para recibir los parametros del usuairo
        Bundle bundle = getIntent().getExtras();
        LaDireccion = bundle.getString("direccion");
       /* textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(LaDireccion);*/

        findViewById(R.id.button34).setOnClickListener(this);
        findViewById(R.id.button35).setOnClickListener(this);
        findViewById(R.id.button36).setOnClickListener(this);
        findViewById(R.id.button37).setOnClickListener(this);
        findViewById(R.id.button38).setOnClickListener(this);
        findViewById(R.id.button39).setOnClickListener(this);
        findViewById(R.id.button47).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String usu = LaDireccion;
        String locker = " ";
        String type = "aparta";
        Button boton;
        Intent i = new Intent(this, apde.class);



        switch (view.getId()) {
            case R.id.button34:
                boton = (Button) findViewById(R.id.button34);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button35:
                boton = (Button) findViewById(R.id.button35);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button36:
                boton = (Button) findViewById(R.id.button36);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button37:
                boton = (Button) findViewById(R.id.button37);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button38:
                boton = (Button) findViewById(R.id.button38);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button39:
                boton = (Button) findViewById(R.id.button39);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button47:
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
