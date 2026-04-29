package com.example.exp8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

    EditText inputTemp;
    TextView resultText;
    Button toFahrenheitBtn, toCelsiusBtn, clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTemp = findViewById(R.id.inputTemp);
        resultText = findViewById(R.id.resultText);
        toFahrenheitBtn = findViewById(R.id.toFahrenheitBtn);
        toCelsiusBtn = findViewById(R.id.toCelsiusBtn);
        clearBtn = findViewById(R.id.clearBtn);

        toFahrenheitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = inputTemp.getText().toString();

                if (!value.isEmpty()) {
                    double c = Double.parseDouble(value);
                    double f = (c * 9/5) + 32;
                    resultText.setText("Fahrenheit: " + f);
                } else {
                    resultText.setText("Enter temperature");
                }
            }
        });

        toCelsiusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = inputTemp.getText().toString();

                if (!value.isEmpty()) {
                    double f = Double.parseDouble(value);
                    double c = (f - 32) * 5/9;
                    resultText.setText("Celsius: " + c);
                } else {
                    resultText.setText("Enter temperature");
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTemp.setText("");
                resultText.setText("Result cleared");
            }
        });
    }
}