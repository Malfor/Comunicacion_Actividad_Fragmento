package com.example.rodolfo.comunicacionactafrag;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMensaje = findViewById(R.id.edit_mensaje);

    }

    public void onClickEnviarMensaje(View view){
        String mensaje = editMensaje != null ? editMensaje.getText().toString() : "No hay mensaje";

        Fragment fragment = getFragmentManager().findFragmentById(R.id.fragment_mensaje);
        //Fragment fragment = getFragmentManager().findFragmentByTag("tagFragmentoMensaje");


        if (fragment instanceof MensajeFragment){
            MensajeFragment mensajeFragment = (MensajeFragment) fragment;
            mensajeFragment.getTxtMensaje().setText(mensaje);
        }
    }

}
