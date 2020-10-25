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
     double numbers[];
     int num = 0;
     String operations[];
     String currentNum;
     int radianes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultado = findViewById(R.id.Etiqueta);
        numbers = new double[10];
        operations = new String[10];
        currentNum="";
        radianes=1;

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
        numbers[num] = Double.parseDouble(currentNum);
        operations[num] = "+";
        num +=1;
        mostrar("+");
        currentNum="";
    }
    public void pressButtonResta(View view) {
        numbers[num] = Double.parseDouble(currentNum);
        operations[num] = "-";
        num +=1;
        mostrar("-");
        currentNum="";
    }
    public void pressButtonMult(View view) {
        numbers[num] = Double.parseDouble(currentNum);
        operations[num] = "x";
        num +=1;
        mostrar("x");
        currentNum="";
    }
    public void pressButtonDiv(View view) {
        numbers[num] = Double.parseDouble(currentNum);
        operations[num] = "/";
        num +=1;
        mostrar("/");
        currentNum="";
    }
    public void pressButtonIgual(View view) {
        numbers[num] = Double.parseDouble(currentNum);
        int i;
        double currentResult = 0;
        if (operations[0] == "+")
            currentResult = numbers[0] + numbers[1];
        else if (operations[0] == "-")
            currentResult = numbers[0] - numbers[1];
        else if (operations[0] == "x")
            currentResult = numbers[0] * numbers[1];
        else if (operations[0] == "/")
            currentResult = numbers[0] / numbers[1];
        else if (operations[0] == "cos")
        {
            if (radianes==0) {
                numbers[0]=numbers[0]*Math.PI/180;
            }
            currentResult = Math.cos(numbers[0]);
        }
        else if (operations[0] == "sin")
        {
            if (radianes==0) {
                numbers[0]=numbers[0]*Math.PI/180;
            }
            currentResult = Math.sin(numbers[0]);
        }
        else if (operations[0] == "tan")
        {
            if (radianes==0) {
                numbers[0]=numbers[0]*Math.PI/180;
            }
            currentResult = Math.tan(numbers[0]);
        }

        for (i=1; i < num; i++) {
            if (operations[i] == "+")
                currentResult +=  numbers[i+1];
            else if (operations[i] == "-")
                currentResult -= numbers[i+1];
            else if (operations[i] == "x")
                currentResult *= numbers[i+1];
            else if (operations[i] == "/")
                currentResult /= numbers[i+1];
        }
        Resultado.setText(Double.toString(currentResult));
        num = 0;
        numbers = new double[15];
        operations = new String[15];
        currentNum="";

    }
    //Trigonometria
    public void pressButtonCoseno(View view) {
        if (currentNum.equals("") && numbers[0]==0){
            Resultado.setText("cos");
            operations[num] = "cos";
        }
        else{
            num = 0;
            numbers = new double[15];
            operations = new String[15];
            Resultado.setText("ERROR");
            currentNum="";

        }
    }
    public void pressButtonSeno(View view) {
        if (currentNum.equals("") && numbers[0]==0){
            Resultado.setText("sin");
            operations[num] = "sin";
        }
        else{
            num = 0;
            numbers = new double[15];
            operations = new String[15];
            Resultado.setText("ERROR");
            currentNum="";

        }


    }
    public void pressButtonTangente(View view) {
        System.out.println(numbers[0]);
        if (currentNum.equals("") && numbers[0]==0){
            Resultado.setText("tan");
            operations[num] = "tan";
        }
        else{
            num = 0;
            numbers = new double[15];
            operations = new String[15];
            Resultado.setText("ERROR");
            currentNum="";

        }

    }
    public void pressButtonClean(View view) {
        num = 0;
        numbers = new double[15];
        operations = new String[15];
        currentNum="";
        Resultado.setText("");
    }
    public void mostrar(String res){
        if (currentNum.equals("") && numbers[0]==0 || Resultado.getText().equals("ERROR"))
        {
            Resultado.setText(res);
        }
        else{
            Resultado.setText(Resultado.getText() + res);
        }
        currentNum=currentNum+res;
    }
    public void pressButtonGrados(View view){
        radianes=0;
    }
    public void pressButtonRadianes(View view){
        radianes=1;

    }



}


