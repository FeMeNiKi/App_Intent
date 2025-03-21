package com.example.exemplointent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnAbrirSegunda;
    Button btnAbrirTerceira;
    Button btnAbrirQuarta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnAbrirSegunda = (Button) findViewById(R.id.cmdAbrirSegundaActivity);
        btnAbrirTerceira = (Button) findViewById(R.id.cmdAbrirTerceiraActivity);
        btnAbrirQuarta = (Button) findViewById(R.id.cmdAbrirQuartaActivity);

        btnAbrirSegunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intencao);
            }
        });
        btnAbrirTerceira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, TerceiraActivity.class);
                startActivity(intencao);
            }
        });
        btnAbrirQuarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, QuartaActivity.class);
                startActivity(intencao);
            }
        });
    }
}