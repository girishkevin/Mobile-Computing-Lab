package com.example.exp4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnAdd, btnReset;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnAdd = findViewById(R.id.btnAdd);
        btnReset = findViewById(R.id.btnReset);
        result = findViewById(R.id.result);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                double number1 = Double.parseDouble(s1);
                double number2 = Double.parseDouble(s2);
                double sum = number1 + number2;

                result.setText("Result: " + sum);
            }
        });
        
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("Result: ");
                num1.requestFocus();
            }
        });
    }
}
