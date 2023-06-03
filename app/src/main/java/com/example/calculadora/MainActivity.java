package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        //entradas texto
    private EditText et1;
    private EditText et2;

    //salida texto

    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relizamos cast para las variables
        et1 = (EditText)findViewById(R.id.editTextNumber);
        et2 = (EditText)findViewById(R.id.number2id);

        //el casteo de view
        tv1 = (TextView)findViewById(R.id.idtev);
    }

    //funcion para sumar, recive un view para mostrar,
    //obtenemos el valro del texto
    public void Sumar(View vista){
        //vovemos strig los edittext
        String val1 = et1.getText().toString();
        String val2 = et1.getText().toString();

        //ahora los volvemos enteros para la suma, parseamos
        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);

        int suma = num1 + num2;

        //el TextView no recibe enteros solo texto
        //lo volvemos string y luego lo mostramos con ' setText envia el valor'
        String resultado = String.valueOf(suma);
        tv1.setText(resultado);
    }

}