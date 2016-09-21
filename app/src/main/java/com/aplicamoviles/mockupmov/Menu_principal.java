package com.aplicamoviles.mockupmov;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Menu_principal extends ActionBarActivity {

    Button b_map;
    Button b_mejoras;
    Button b_coleccionables;
    Button b_perfil;
    Button b_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        b_map = (Button) findViewById(R.id.b_map);
        b_mejoras = (Button) findViewById(R.id.b_updates);
        b_coleccionables = (Button) findViewById(R.id.b_coleccionables);
        b_perfil = (Button) findViewById(R.id.b_perfil);
        b_salir = (Button) findViewById(R.id.b_salida);
    }

    public void onClickMapa(View view)
    {
        Intent i = new Intent(this, Mapa.class);
        startActivity(i);

    }

    public void onClickMejoras(View view)
    {
        Intent i = new Intent(this, Mejoras.class);
        startActivity(i);

    }

    public void onClickColeccionables(View view)
    {
        Intent i = new Intent(this, Coleccionables.class);
        startActivity(i);

    }

    public void onClickPerfil(View view)
    {
        Intent i = new Intent(this, Perfil.class);
        startActivity(i);

    }

    public void onClickSalir(View view)
    {
        finish();
        System.exit(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
