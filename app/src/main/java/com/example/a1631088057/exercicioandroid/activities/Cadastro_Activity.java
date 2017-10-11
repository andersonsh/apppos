package com.example.a1631088057.exercicioandroid.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a1631088057.exercicioandroid.R;

/**
 * Created by 1631088057 on 10/10/2017.
 */


public class Cadastro_Activity extends Activity {

    private EditText txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_activity);

        txtNome = (EditText) findViewById(R.id.txtNome);

        Button b = (Button) findViewById(R.id.btnCancela);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

        Button c = (Button) findViewById(R.id.btnOK);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO: Gravar os dados do cadastro
                finish();
            }
        });
    }


}
