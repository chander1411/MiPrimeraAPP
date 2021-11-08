package facci.leonardotoala.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText cuadrotextoF;
    private TextView resultadoF;
    private Button convertirF;
    private EditText cuadrotextoC;
    private TextView resultadoC;
    private Button convertirC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String idioma = Locale.getDefault().getLanguage();
        if(idioma=="es") {
            setContentView(R.layout.activity_main2);
        }else{
            setContentView(R.layout.activity_main);
        }
        cuadrotextoF = (EditText) findViewById(R.id.entradaF);
        resultadoF =(TextView) findViewById(R.id.resultadoF);
        convertirF =(Button) findViewById(R.id.convertirbotonF);

        cuadrotextoC = (EditText) findViewById(R.id.entradaC);
        resultadoC =(TextView) findViewById(R.id.resultadoC);
        convertirC =(Button) findViewById(R.id.convertirbotonC);

        convertirF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String va = null;
                Double valor = null;
                Double resultant = null;
                va = cuadrotextoF.getText().toString();
                valor = Double.parseDouble(va);
                resultant = (valor-32)/(1.8);
                resultadoF.setText(resultant.toString());
                Log.e("valor",resultant.toString());

            }
        });
        convertirC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String va = null;
                Double valor = null;
                Double resultant = null;
                va = cuadrotextoC.getText().toString();
                valor = Double.parseDouble(va);
                resultant = (valor*1.8)+(32);
                resultadoC.setText(resultant.toString());
                Log.e("valor",resultant.toString());

            }
        });

        Log.e("MainActivity","Leonardo Toala");

    }
}