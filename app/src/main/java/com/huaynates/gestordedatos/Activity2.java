package com.huaynates.gestordedatos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends Activity {
      TextView monto;
      String mont;
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.recibido);

        monto =(TextView) findViewById(R.id.mont1);
        Bundle bundle=this.getIntent().getExtras();
        mont = bundle.getString("Monto");

        monto.setText(mont);

    }
}
