package com.example.metertoinches.metertoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText meterid;
    private Button convertid;
    private TextView resultid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meterid =(EditText) findViewById(R.id.meterid);
        convertid=(Button) findViewById(R.id.convertid);
        resultid=(TextView) findViewById(R.id.resultid);
        convertid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiply=39.37;
                double result=0.0;
                if(meterid.getText().toString().equals(""))
                {
                    resultid.setText(R.string.error);
                    resultid.setTextColor(Color.RED);
                }
                else {
                    double metervalue = Double.parseDouble(meterid.getText().toString());
                    result = metervalue * multiply;
                    resultid.setText(String.format("%.2f", result) + " inches");
                    resultid.setTextColor(Color.BLUE);
                }
            }
        });
    }
}
