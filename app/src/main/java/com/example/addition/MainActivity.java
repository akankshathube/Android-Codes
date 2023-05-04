package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private Button b1;
    private TextView t1;
    Double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText) findViewById(R.id.num1);
        n2=(EditText) findViewById(R.id.num2);
        b1=(Button) findViewById(R.id.add);
        t1=(TextView) findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(n1.getText().toString());
                b=Double.parseDouble(n2.getText().toString());
                c=a+b;
                t1.setText("sum="+c);
            }
        });
    }
}
