package com.underwater.underwaterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    Button btnGoTrain, btnGoTournament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnGoTrain = findViewById(R.id.button_train);
        btnGoTournament = findViewById(R.id.button_tournament);

        btnGoTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, Train.class);
                startActivity(intent);
            }
        });

        btnGoTournament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, Tournament.class);
                startActivity(intent);
            }
        });
    }
}