package es.virgendelsoterrano.elpimi.amigoinvisible;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    private TextView TvTituloapp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(""); // Borramos el título en el ActionBar

        final Intent intent =new Intent(Main2Activity.this, MainActivity.class);
        findViewById(R.id.btn_a2_atras).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                Main2Activity.this.finish();
            }
        });

        final Intent intent_sig =new Intent(Main2Activity.this, Main3Activity.class);
        findViewById(R.id.btn_a2_sig).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_sig);
                Main2Activity.this.finish();
            }
        });

        TvTituloapp2= (TextView) findViewById(R.id.tituloapp2);
        String nombreAplicacion = getResources().getString(R.string.app_name);
        nombreAplicacion=nombreAplicacion.toUpperCase();
        TvTituloapp2.setText(nombreAplicacion);


/*

        TvTituloapp2 = (TextView)findViewById(R.id.tituloapp2);  //Localizar los controles
        Bundle bundle = this.getIntent().getExtras();           //Recuperamos la información pasada en el intent
        TvTituloapp2.setText(bundle.getString("TITULOAPP"));     //Construimos el mensaje a mostrar


        TvTituloapp2 = (TextView)findViewById(R.id.tituloapp2);
        Bundle b = new Bundle();
        b.putString("TITULOAPP", TvTituloapp2.getText().toString());

        //Añadimos la información al intent
        intent.putExtras(b);


*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        // Inicio: Alfonso pimienta


        Context contexto = getApplicationContext();
        CharSequence toasttxt = null;
        int duracion = Toast.LENGTH_SHORT;
        Toast mitoast = Toast.makeText(contexto, toasttxt, duracion);
        TextView autor = (TextView) findViewById(R.id.tvinfo);

       /* WebView miwebView  = (WebView) findViewById(R.id.webview);
        String headerhtml = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">"
                +"<html>  <head>  <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">"
                +"</head>  <body>";
        String cuerpohtml ="<div style=text-align:justify>Estoy probando el texto justificado, lo primero que pruebo son acentos y ñ, pá pé pí pó pú y las ññññññ </div>";
        String footerhtml ="</body></html>";
        String webPage_es = "<html  lang=\"es\"><head><meta charset='utf-8'></head><body><div style=text-align:justify>Estoy probando el texto justificado, lo primero que pruebo son acentos y ñ, pá pé pí pó pú y las ññññññ </div></body></html>";
        */




        switch (item.getItemId()) {
            case R.id.musica:




                break;

            case R.id.ayuda:
                toasttxt = "Opción ajustes";
                autor.setText("Con esta App podrás hacer el juego de amigo invisible. 1) Amigos para crear la lista de los participantes con sus teléfonos 2) Generará las combinaciones 3) Enviarás los SMS a cada participante con su amigo");
                /*miwebView.setVerticalScrollBarEnabled(true);
                miwebView.setVerticalFadingEdgeEnabled(true);

                miwebView.loadData(headerhtml+cuerpohtml+footerhtml, "text/html", "utf-8");
                */
                break;
            case R.id.autor:
                toasttxt = "Opción autor";
                autor.setText("Este programa ha sido realizado por Alfonso Teodoro Pimienta García. (c)IES Virgen del Soterraño. V 1.0 diciembre 2015.\n" +
                        "Autor de la música: Александр Даренских. Duración: 01:56\n" + "Fecha de publicación: 12.29.2015. Licencia Creative Commons: (CC BY-NC-ND 3.0)   \n");
                /*
                miwebView.setVerticalScrollBarEnabled(true);
                miwebView.setVerticalFadingEdgeEnabled(true);
                miwebView.loadData(getString(R.string.hello), "text/html", "utf-8");
                */
                break;


            case R.id.salir:
                //System.exit(0);
                super.finish();
                System.exit(0);
                break;



            /*
             * Force the system to close the app down completely instead of
             * retaining it in the background. The virtual machine that runs the
             * app will be killed. The app will be completely created as a new
             * app in a new virtual machine running in a new process if the user
             * starts the app again.
             */


            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                break;
        }
        mitoast.setText(toasttxt);
        mitoast.show();
        return super.onOptionsItemSelected(item);


        // Fin: Alfonso Pimienta


        //noinspection SimplifiableIfStatement

    }
}

