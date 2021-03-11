package com.example.spinnerejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button accionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Conectar();
        String[] años = new String[42];
        int c= 0;
        for(int i=1980; i<=2021;i++){
            años[c] = String.valueOf(i);
            c++;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,años);
        spinner.setAdapter(adapter);
    }

    private void Conectar(){
        spinner=findViewById(R.id.spinner);
    }
    public void accionar(View view){
        String selection= spinner.getSelectedItem().toString();
        Toast.makeText(this,selection,Toast.LENGTH_LONG).show();
    }

}