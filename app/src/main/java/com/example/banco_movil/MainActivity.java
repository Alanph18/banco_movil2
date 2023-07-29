package com.example.banco_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.animation.ObjectAnimator;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        // Desplazamiento horizontal de 100 píxeles hacia la derecha
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "translationY", 3000f, 0f);
        animator.setDuration(1000); // Duración de la animación en milisegundos (en este caso, 1 segundo)
        animator.start();


        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 2000);

    }
}