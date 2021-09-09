package com.example.dibujo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaNombre, cajaHoras;
    Button btnCalcular, btnLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaNombre=findViewById(R.id.caja3);
        cajaHoras=findViewById(R.id.caja2);
        btnCalcular=findViewById(R.id.caja4);
        btnLimpiar=findViewById(R.id.caja5);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int horas=Integer.parseInt(cajaHoras.getText().toString());
                String nombre= cajaNombre.getText().toString();

                if(horas<=40){
                    int salario=horas * 20000;
                    String mensaje= "Señor(a) "+ nombre +" ,su salario fue de: "+salario;
                    Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_LONG).show();
                }else{
                    int salario = (((horas-40)*25000)*(40*20000));
                    String mensaje= "Señor(a) "+nombre+" ,su salario fue de: "+salario;
                    Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_LONG).show();

                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cajaHoras.setText("");
                cajaNombre.setText("");
            }
        });
        //cada hora extra son 25 mil pesos
        // las horas máximas son 40 y cada hora vale 20 mil
    }
}