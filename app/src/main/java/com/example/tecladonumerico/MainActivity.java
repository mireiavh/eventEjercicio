package com.example.tecladonumerico;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setupButtonListeners();
    }

    private void setupButtonListeners() {
        int[] buttonIds = {
                R.id.buttonBloq, R.id.buttonSlash, R.id.buttonDot, R.id.buttonMinun,
                R.id.buttonSeven, R.id.buttonEigth, R.id.buttoNine, R.id.buttonPlus,
                R.id.buttoFour, R.id.buttoFive, R.id.buttoSix, R.id.buttoOne,
                R.id.buttoTwo, R.id.buttoThree, R.id.buttoIntro, R.id.buttoCero,
                R.id.buttoSpru
        };

        for (int id : buttonIds) {
            Button button = findViewById(id);
            button.setOnClickListener(view -> {
                String buttonText = button.getText().toString();
                Log.i("EJEMPLO", buttonText);
                Toast.makeText(this, "Botón: " + buttonText, Toast.LENGTH_SHORT).show();
            });
        }
    }
}