package com.aplicamoviles.mockupmov;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Nelson on 20/09/2016.
 */
public class Inicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }


    public void onClickMenuPrincipal(View view)
    {
        Intent i = new Intent(this, Menu_principal.class);
        startActivity(i);

    }
}

