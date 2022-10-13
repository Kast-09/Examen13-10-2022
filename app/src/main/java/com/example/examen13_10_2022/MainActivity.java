package com.example.examen13_10_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3;
    EditText et1, et2;

    public int band = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
    }

    public void restar(View v){
        tv2.setText("Restar");
        band = 1;
    }

    public void sumar(View v){
        tv2.setText("Sumar");
        band = 2;
    }

    public void dividir(View v){
        tv2.setText("Dividir");
        band = 3;
    }

    public void multiplicar(View v){
        tv2.setText("Multiplicar");
        band = 4;
    }

    public void operar(View v){
        float v1 = Float.parseFloat(et1.getText().toString());
        float v2 = Float.parseFloat(et2.getText().toString());

        String resultado = "El resultado es: ";

        float v3 = 0;

        switch (band){
            case 1: v3 = v1 - v2; break;
            case 2: v3 = v1 + v2; break;
            case 3: v3 = v1 / v2; break;
            case 4: v3 = v1 * v2; break;
            default: resultado = "Seleccione operador"; break;
        }

        tv3.setText(resultado + v3);
    }
}