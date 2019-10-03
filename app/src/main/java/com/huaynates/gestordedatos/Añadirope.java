package com.huaynates.gestordedatos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.RandomAccess;

public class Añadirope extends AppCompatActivity {

    Spinner spin;
    Button registrar;
    RadioButton rd;
    RadioButton rd1;
    EditText monto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        spin = findViewById(R.id.spin);
        registrar = findViewById(R.id.button);
        rd= findViewById(R.id.rad1);
        rd1 = findViewById(R.id.rad2);
        monto = findViewById(R.id.edit1);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

    }

    private void add(){
        String saldo = spin.getSelectedItem().toString();
        String cantidad = monto.getText().toString();
        String tipo;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String date = df.format(Calendar.getInstance().getTime());
        if(rd.isChecked()){
            tipo = "Ingresos";
        }else{
            tipo = "Egresos";
        }
        Intent e = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(e);
        finish();
    }
}