package com.example.exp6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLinear, btnRelative, btnTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnTable = findViewById(R.id.btnTable);

        btnLinear.setOnClickListener(v ->
                startActivity(new Intent(this, LinearLayout.class)));

        btnRelative.setOnClickListener(v ->
                startActivity(new Intent(this, RelativeLayout.class)));

        btnTable.setOnClickListener(v ->
                startActivity(new Intent(this, TableLayout.class)));
    }

}