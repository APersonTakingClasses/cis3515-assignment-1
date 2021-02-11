package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import andriod.widget.Button;
import andriod.widget.TextView;
import andriod.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textV);
        textV.setText("Click This");

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                    textV.setText("I have been clicked!");

            }
        });
    }
}