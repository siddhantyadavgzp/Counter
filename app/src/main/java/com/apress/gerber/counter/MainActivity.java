package com.apress.gerber.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button add,sub,clear;
    private TextView value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value=findViewById(R.id.val);
        add=findViewById(R.id.button_addition);
        sub=findViewById(R.id.button_subtraction);
        clear=findViewById(R.id.clear);
        onClickActions();
    }
    void onClickActions()
    {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int curVal=Integer.parseInt(value.getText().toString());
                curVal++;
                value.setText(Integer.toString(curVal));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int curVal=Integer.parseInt(value.getText().toString());
                curVal--;
                value.setText(Integer.toString(curVal));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int curVal=0;
                value.setText(Integer.toString(curVal));
            }
        });
    }
}
