package com.dvj.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int valorContador;
    private TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorContador = 0;

        contador = findViewById(R.id.contador);

        findViewById(R.id.incrementar).setOnClickListener(view -> {
            incrementar();
        });

        findViewById(R.id.decrementar).setOnClickListener(view ->{
            decrementar();
        });

        findViewById(R.id.resetear).setOnClickListener(view ->{
            resetear();
        });

    }

    private void incrementar(){

            contador.setText(Integer.toString(valorContador++));


    }

    private void decrementar(){
        contador.setText(Integer.toString(valorContador--));
    }

    private void resetear(){
        contador.setText(Integer.toString(valorContador = 0));
    }

}