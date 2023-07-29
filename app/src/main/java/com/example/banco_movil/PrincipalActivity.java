package com.example.banco_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import android.widget.TextView;
import java.util.Calendar;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_avtivity);

        TextView textViewSaludo = findViewById(R.id.Saludo);
        // Obtener la hora actual
        Calendar cal = Calendar.getInstance();
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        // Determinar si es de día o de tarde
        if (hora >= 0 && hora <= 11) {
            textViewSaludo.setText("¡Buenos días!");
        } else if (hora >= 12 && hora <= 17) {
            textViewSaludo.setText("¡Buenos tardes!");
        } else {
            textViewSaludo.setText("¡Buenas noches!");
        }
        Button btnRegistro = findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(v -> {
            // Mostrar el diálogo de alerta
            showAlertDialog("INGRESÓ", "¡Bienvenido!");
        });
    }
    // Función para mostrar el diálogo de alerta
    private void showAlertDialog(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("Aceptar", null);
        // Mostrar el diálogo
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}