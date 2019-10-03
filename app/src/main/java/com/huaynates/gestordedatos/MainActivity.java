package com.huaynates.gestordedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity  {
        EditText monto;
        Button ejecutar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        monto = (EditText)findViewById(R.id.edit1);
        ejecutar = (Button)findViewById(R.id.button);


        ejecutar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EnviarDatos();
            }

        });
    }
    private void EnviarDatos(){
        String mont;
        mont = monto.getText().toString();
        Intent intent= new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("Monto", mont);
        startActivity(intent);
    }

    }

