package com.example.avg_power;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t1 = (EditText) findViewById(R.id.num1);
        EditText t2 = (EditText) findViewById(R.id.num2);
        //EditText t3 = (EditText) findViewById(R.id.num3);
        TextView tv = (TextView) findViewById(R.id.textView1);
        TextView Result = (TextView) findViewById(R.id.textView2);
        Button B1 = (Button) findViewById(R.id.btn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(t1.getText().toString().trim());
                int n2 = Integer.parseInt(t2.getText().toString().trim());
                //int n3 = Integer.parseInt(t3.getText().toString().trim());
                if(n1 > 10 && n2 > 10)
                {
                    Result.setText("Number is rejected please enter new number\nBoth number are greater than 10");
            }
                else
                {//"Number is rejected please enter new number"
                    Result.setText("Given number is "+n1+" and "+n2);
                }
                //Result.setText("SUM of "+n1+" "+n2+" "+n3+" :: " + res);
              //  Toast.makeText(MainActivity.this, "Square is " + res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}