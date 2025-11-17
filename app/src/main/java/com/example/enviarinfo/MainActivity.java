package com.example.enviarinfo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtApellido, txtEdad, txtCorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtCorreo);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(v -> {
            // Crear objeto Persona
            Persona p = new Persona(
                    txtNombre.getText().toString(),
                    txtApellido.getText().toString(),
                    Integer.parseInt(txtEdad.getText().toString()),
                    txtCorreo.getText().toString()
            );

            // Enviar mediante Intent
            Intent intent = new Intent(MainActivity.this, activity_segunda.class);
            intent.putExtra("nombre", p.getNombre());
            intent.putExtra("apellido", p.getApellido());
            intent.putExtra("edad", p.getEdad());
            intent.putExtra("correo", p.getCorreo());

            startActivity(intent);
        });
    }
}
