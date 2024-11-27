package com.arttt95.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Atributos
    String[] frases = {
            "Seja modesto nas suas expectativas e econômico nas suas necessidades.",
            "O trabalho dignifica o homem.",
            "Viver sem liberdade é pior que a própria morte.",
            "E que alegria seria morrer pelo Brasil!"
    };

    /*
    textResultado, buttonResultado, editResultado
    */


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
    }

    public void gerarFrase(View view) {

        TextView texto = findViewById(R.id.textResultado);

        int numeroAleatorio = new Random().nextInt(4); // 0, 1, 2, 3

        String frase = frases[numeroAleatorio];

        texto.setText( frase );

    }

    public void exibirTodas(View view) {

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";

        for ( String frase : frases ) {
            textoResultado = textoResultado + frase + "\n\n";
        }

        texto.setText( textoResultado );

    }

}