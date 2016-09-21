package com.aplicamoviles.mockupmov;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nelson on 20/09/2016.
 */
public class Mapa extends Activity {

    Button b_retorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);

        b_retorno = (Button) findViewById(R.id.b_ma_retornar);
    }

    public void onClickMenuPrincipal(View view)
    {
        Intent i = new Intent(this, Menu_principal.class);
        startActivity(i);

    }

}

