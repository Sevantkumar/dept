package com.example.dept;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String[] str={"Select Branch","CSE","ISE","MECH"};
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner) findViewById(R.id.spinne);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(getApplicationContext(),
                android.support.constraint.R.layout.support_simple_spinner_dropdown_item,str);
        sp.setAdapter(adp);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int ind=adapterView.getSelectedItemPosition();
                if(ind==1){
                    Intent n1=new Intent(getApplicationContext(),CSE.class);
                    startActivity(n1);
                }
                if(ind==2){
                    Intent n2=new Intent(getApplicationContext(),ISE.class);
                    startActivity(n2);
                }
                if(ind==3){
                    Intent n3=new Intent(getApplicationContext(),MECH.class);
                    startActivity(n3);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}