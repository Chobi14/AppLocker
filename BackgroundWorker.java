package com.example.luisgerman.misesion;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by LuisGerman on 19/11/2016.
 */
public class BackgroundWorker extends AsyncTask <String,Void,String> {
    Context context;
    AlertDialog alertDialog;

    public String prueba;
    BackgroundWorker (Context ctx){
        context = ctx;
    }

    @Override
    protected String doInBackground(String... params) {
        String type = params[0];
        String ln_url = "http://moviles2016.esy.es/logeo.php";
        if(type.equals("logeo")) {
            try {
                String user_name = params[1];
                String pass_word = params[2];
                URL url = new URL(ln_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"
                        +URLEncoder.encode("pass_word","UTF-8")+"="+URLEncoder.encode(pass_word,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result = "";
                String line="";
                while((line = bufferedReader.readLine()) != null)
                {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                prueba = result;
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }



    @Override
    protected void onPreExecute() {
        //alertDialog = new AlertDialog.Builder(context).create();
        //alertDialog.setTitle("Estado del logeo");
        super.onPreExecute();
        alertDialog = new AlertDialog.Builder(context).create();

    }



    @Override
    protected void onPostExecute(String result) {
        //alertDialog.setMessage(result);
        //alertDialog.show();
        //pasar el parametro del usuario



            /*Toast.makeText(context, ""+captionStr, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(context, universidad.class);
            Bundle b = new Bundle();
            b.putString("url", "Hello"); //Your id
            intent.putExtras(b); //Put your id to your next Intent
            context.startActivity(intent);

            // context.finish();*/
            /*if(result == "1") {
                Intent intent = new Intent(context, universidad.class);
                context.startActivity(intent);
            }*/
        //AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        //alertDialog = new AlertDialog.Builder(context).create();
        if((result.equals("NULL")) || (result.equals(" ")) ) {
            alertDialog.setTitle("¡Importante!");
            alertDialog.setMessage("Datos incorrectos");
            alertDialog.setCancelable(false);
        /*alertDialog.setButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface alertDialog, int id) {
                aceptar();
            }


        });*/
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            //((Activity)context).finish();
                            /*Intent intent = new Intent(context, MiPrimerSesion.class);
                            context.startActivity(intent);*/

                        }
                    });
            alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {

                }
            });



        }else {
            prueba=result;
            alertDialog.setTitle("¡Bienvenid@ a los casilleros!");
            //alertDialog.setMessage("!Bienvenido!" + result);
            alertDialog.setMessage("Encontrarás tu casillero apartado en el kiosco");
            alertDialog.setCancelable(false);
        /*alertDialog.setButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface alertDialog, int id) {
                aceptar();
            }


        });*/
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(context, universidad.class);
                            intent.putExtra("direccion", prueba);
                            context.startActivity(intent);

                        }
                    });


            alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {

                }
            });


        }
        alertDialog.show();




    }




    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }


}
