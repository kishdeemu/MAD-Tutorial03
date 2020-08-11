package com.kishdeemu.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button okBtn;
    EditText numb1;
    EditText numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        okBtn =(Button) findViewById(R.id.okBtn);
        numb1 = (EditText) findViewById(R.id.numb1);
        numb2 = (EditText) findViewById(R.id.numb2);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("Number1",Integer.parseInt(numb1.getText().toString()));
                intent.putExtra("Number2",Integer.parseInt(numb2.getText().toString()));

                //toast massage
                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();

                startActivity(intent);
            }
        });

    }
}