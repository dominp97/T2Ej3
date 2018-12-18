package com.pmdm.t2ej3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        String ac=intent.getAction();
        String[] textRecibidoEmail;
        String textRecibidoTitulo;
        String textRecibidoTexto;

        if(ac.equals(Intent.ACTION_SEND)) {
            TextView edRecibidoDest=findViewById(R.id.textView);
            TextView edRecibidoTit=findViewById(R.id.textView2);
            TextView edRecibidoTex=findViewById(R.id.textView3);
            textRecibidoEmail = intent.getStringArrayExtra(Intent.EXTRA_EMAIL);
            textRecibidoTitulo = intent.getStringExtra(Intent.EXTRA_SUBJECT);
            textRecibidoTexto = intent.getStringExtra(Intent.EXTRA_TEXT);
            if(textRecibidoEmail!=null){
                String salida = "";
                for(String t : textRecibidoEmail){
                    salida += t;
                }
                edRecibidoDest.setText(salida);
                edRecibidoTit.setText(textRecibidoTitulo);
                edRecibidoTex.setText(textRecibidoTexto);
            }

        }
    }
}
