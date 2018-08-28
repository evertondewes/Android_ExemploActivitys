package com.example.cnec.duasactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadastroClientesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_clientes);
    }

    public void vaiParaAVermelha(View v){
        Intent i = new Intent(getApplicationContext(), ActivityVermelha.class);

        startActivity(i);
    }
}
