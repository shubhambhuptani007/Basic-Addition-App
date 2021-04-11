package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView T1;
    private TextView T2;
    private EditText n1;
    private EditText n2;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = findViewById(R.id.T1);
        T2 = findViewById(R.id.T2);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                T2.setText("Sum is " + sum);
            }
        });

    }
}