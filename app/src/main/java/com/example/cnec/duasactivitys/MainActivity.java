package com.example.cnec.duasactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocarActivity(View v){
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        startActivity(intent);
    }

    public void trocarActivityVermelha(View v){
        Intent intent = new Intent(getApplicationContext(), ActivityVermelha.class);

        startActivity(intent);
    }


    public void trocarAmarela(View v) {
        Intent i = new Intent(getApplicationContext(), CadastroClientesActivity.class);

        startActivity(i);
    }


}
