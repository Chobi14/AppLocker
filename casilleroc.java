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
public class casilleroc extends AppCompatActivity implements View.OnClickListener{
    //private TextView textView5;
    Button NumCasillero;
    String LaDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //aqui llamamos a nuestro xml de casillero c
        setContentView(R.layout.casilleroc);

        //creamos el bundle para recibir los parametros del usuairo
        Bundle bundle = getIntent().getExtras();
        LaDireccion = bundle.getString("direccion");
        /*textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(LaDireccion);*/

        findViewById(R.id.button25).setOnClickListener(this);
        findViewById(R.id.button26).setOnClickListener(this);
        findViewById(R.id.button27).setOnClickListener(this);
        findViewById(R.id.button28).setOnClickListener(this);
        findViewById(R.id.button29).setOnClickListener(this);
        findViewById(R.id.button30).setOnClickListener(this);
        findViewById(R.id.button31).setOnClickListener(this);
        findViewById(R.id.button32).setOnClickListener(this);
        findViewById(R.id.button33).setOnClickListener(this);
        findViewById(R.id.button46).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String usu = LaDireccion;
        String locker = " ";
        String type = "aparta";
        Button boton;
        Intent i = new Intent(this, apde.class);



        switch (view.getId()) {
            case R.id.button25:
                boton = (Button) findViewById(R.id.button25);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button26:
                boton = (Button) findViewById(R.id.button26);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button27:
                boton = (Button) findViewById(R.id.button27);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button28:
                boton = (Button) findViewById(R.id.button28);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button29:
                boton = (Button) findViewById(R.id.button29);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button30:
                boton = (Button) findViewById(R.id.button30);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button31:
                boton = (Button) findViewById(R.id.button31);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button32:
                boton = (Button) findViewById(R.id.button32);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button33:
                boton = (Button) findViewById(R.id.button33);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;

            case R.id.button46:
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
