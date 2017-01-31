package com.example.luisgerman.misesion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by LuisGerman on 21/11/2016.
 */
public class casilleroa extends AppCompatActivity implements View.OnClickListener{
    private TextView textView5;
    Button NumCasillero;
    String LaDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //aqui llamamos a nuestro xml de casillero a
        setContentView(R.layout.casilleroa);

        //creamos el bundle para recibir los parametros del usuairo
        Bundle bundle = getIntent().getExtras();
        LaDireccion = bundle.getString("direccion");
        textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(LaDireccion);

        findViewById(R.id.button10).setOnClickListener(this);
        findViewById(R.id.button11).setOnClickListener(this);
        findViewById(R.id.button12).setOnClickListener(this);
        findViewById(R.id.button13).setOnClickListener(this);
        findViewById(R.id.button14).setOnClickListener(this);
        findViewById(R.id.button15).setOnClickListener(this);
        findViewById(R.id.button16).setOnClickListener(this);
        findViewById(R.id.button17).setOnClickListener(this);
        findViewById(R.id.button18).setOnClickListener(this);
        findViewById(R.id.button44).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String usu = LaDireccion;
        String locker = " ";
        String type = "aparta";
        Button boton;
        Intent i = new Intent(this, apde.class);



        switch (view.getId()) {
            case R.id.button10:
                boton = (Button) findViewById(R.id.button10);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button11:
                boton = (Button) findViewById(R.id.button11);
                locker = boton.getText().toString();

                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button12:
                boton = (Button) findViewById(R.id.button12);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button13:
                boton = (Button) findViewById(R.id.button13);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button14:
                boton = (Button) findViewById(R.id.button14);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button15:
                boton = (Button) findViewById(R.id.button15);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button16:
                boton = (Button) findViewById(R.id.button16);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button17:
                boton = (Button) findViewById(R.id.button17);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;
            case R.id.button18:
                boton = (Button) findViewById(R.id.button18);
                locker = boton.getText().toString();
                i.putExtra("direccion", usu);
                i.putExtra("direccioncasillero", locker);
                startActivity(i);
                break;

            case R.id.button44:
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
