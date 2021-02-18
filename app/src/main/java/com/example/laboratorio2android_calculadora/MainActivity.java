package com.example.laboratorio2android_calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    TextView workingsTV;
    TextView resultsTV;

    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTextViews();

    }

    private void initTextViews() {

        workingsTV = (TextView)findViewById(R.id.workingsTextView);
        resultsTV = (TextView)findViewById(R.id.workingsResultView);

    }

    private void setWorkings(String valor){

        workings = workings + valor;
        workingsTV.setText(workings);

    }

    public void igualEnClick(View view) {

        ArrayList<Double> numerosAcumulados = new ArrayList<>();
        String operacion = workings.replace(" ","");
        Double resultado = 0.0;
        for(int i = 0; i < operacion.length(); i++){

            if(Character.toString(workings.charAt(i)).equals("*")) {

                Double numero1 = Double.valueOf(Character.toString(workings.charAt(i - 1)));
                Double numero2 = Double.valueOf(Character.toString(workings.charAt(i + 1)));
                resultado += numero1 * numero2;


            } else if(Character.toString(workings.charAt(i)).equals("/")){

                Double numero1 = Double.valueOf(Character.toString(workings.charAt(i - 1)));
                Double numero2 = Double.valueOf(Character.toString(workings.charAt(i + 1)));
                resultado += numero1 / numero2;

            } else if(Character.toString(workings.charAt(i)).equals("+")){

                Double numero1 = Double.valueOf(Character.toString(workings.charAt(i - 1)));
                Double numero2 = Double.valueOf(Character.toString(workings.charAt(i + 1)));
                resultado += numero1 + numero2;

            } else if(Character.toString(workings.charAt(i)).equals("-")){

                Double numero1 = Double.valueOf(Character.toString(workings.charAt(i - 1)));
                Double numero2 = Double.valueOf(Character.toString(workings.charAt(i + 1)));
                resultado += numero1 - numero2;

            } else if(Character.toString(workings.charAt(i)).equals("^")){

                Double numero1 = Double.valueOf(Character.toString(workings.charAt(i - 1)));
                Double numero2 = Double.valueOf(Character.toString(workings.charAt(i + 1)));
                resultado += Math.pow(numero1 , numero2);

            }
        }
        resultsTV.setText(String.valueOf(resultado));



    }

    public void limpiarEnClick(View view) {
        workingsTV.setText("");
        workings = "";
        resultsTV.setText("");

    }
    public void ceroEnClick(View view) {
        setWorkings("0");
    }
    public void puntoEnClick(View view) {
        setWorkings(".");
    }
    public void tresEnClick(View view) {
        setWorkings("3");
    }
    public void dosEnClick(View view) {
        setWorkings("2");
    }
    public void unoEnClick(View view) {
        setWorkings("1");
    }
    public void menosEnClick(View view) {
        setWorkings("-");
    }
    public void seisEnClick(View view) {
        setWorkings("6");
    }
    public void cincoEnClick(View view) {
        setWorkings("5");
    }
    public void cuatroEnClick(View view) {
        setWorkings("4");
    }
    public void multiplicarEnClick(View view) {
        setWorkings("*");
    }
    public void nueveEnClick(View view) {
        setWorkings("9");
    }
    public void ochoEnClick(View view) {
        setWorkings("8");
    }
    public void sieteEnClick(View view) {
        setWorkings("7");
    }
    public void divisionEnClick(View view) {
        setWorkings("/");
    }
    public void potenciaEnClick(View view) {
        setWorkings("^");
    }

    public void masEnClick(View view) {
        setWorkings("+");
    }
}