package com.salgado.cristopher.platzigram.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.salgado.cristopher.platzigram.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        showToolbar(getResources().getString(R.string.toolbar_tittle_createaccount),true);

    }

    public void showToolbar(String titulo,boolean haveReturn){
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(haveReturn);
    }

}
