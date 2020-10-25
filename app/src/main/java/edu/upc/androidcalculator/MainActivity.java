package edu.upc.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultado = (TextView)findViewById(R.id.Etiqueta);

    }

    public void pressButton1(View view) {
        mostrar("1");
    }
    public void pressButton2(View view) {
        mostrar("2");
    }
    public void pressButton3(View view) {
        mostrar("3");
    }
    public void pressButton4(View view) {
        mostrar("4");
    }
    public void pressButton5(View view) {
        mostrar("5");
    }
    public void pressButton6(View view) {
        mostrar("6");
    }
    public void pressButton7(View view) {
        mostrar("7");
    }
    public void pressButton8(View view) {
        mostrar("8");
    }
    public void pressButton9(View view) {
        mostrar("9");
    }
    public void pressButton0(View view) {
        mostrar("0");
    }
    //Operaciones
    public void pressButtonSuma(View view) {
        mostrar("+");
    }
    public void pressButtonResta(View view) {
        mostrar("-");
    }
    public void pressButtonDiv(View view) {
        mostrar("/");
    }
    public void pressButtonMult(View view) {
        mostrar("x");
    }
    //Trigonometria
    public void pressButtonCoseno(View view) {

    }
    public void pressButtonSeno(View view) {

    }
    public void pressButtonTangente(View view) {

    }
    //Punto
    public void pressButtonPunto(View view) {

    }
    public void pressButtonBorrar(View view) {

    }
    public void pressButtonClean(View view) {
        mostrar("5");
    }
    public void mostrar(String res){
        Resultado.setText(Resultado.getText()+res);
    }
}


