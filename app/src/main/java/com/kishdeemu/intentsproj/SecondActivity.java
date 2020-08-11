package com.kishdeemu.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText numb1;
    EditText numb2;
    int num1;
    int num2;
    int answe;
    TextView answer;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        numb1=(EditText) findViewById(R.id.numb1);
        numb2=(EditText) findViewById(R.id.numb2);
        answer = findViewById(R.id.textView3);
        Add = (Button) findViewById(R.id.add);
        Sub = (Button) findViewById(R.id.sub);
        Mul = (Button) findViewById(R.id.mul);
        Div = (Button) findViewById(R.id.div);

        Intent intent = getIntent();
        num1 = intent.getIntExtra("Number1",0);
        num2 = intent.getIntExtra("Number2", 0);

        Log.e("Number1",String.valueOf(num1));
        Log.e("Number2",String.valueOf(num2));

        numb1.setText(""+num1);
        numb2.setText(""+num2);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answe = Integer.parseInt(numb1.getText().toString()) + Integer.parseInt(numb2.getText().toString());
                answer.setText(""+answe);
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answe = Integer.parseInt(numb1.getText().toString()) - Integer.parseInt(numb2.getText().toString());
                answer.setText(""+answe);
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answe = Integer.parseInt(numb1.getText().toString()) * Integer.parseInt(numb2.getText().toString());
                answer.setText(""+answe);
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answe = Integer.parseInt(numb1.getText().toString()) / Integer.parseInt(numb2.getText().toString());
                answer.setText(""+answe);
            }
        });
    }
}