package com.ymt.sqlitedemoch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
    }

    public void onClick(View view) {
        Intent miIntent = null;
        switch (view.getId()) {
            case R.id.btnOpcionRegistro:
                miIntent = new Intent(getApplicationContext(), RegistroUsuariosActivity.class);
                break;
            case R.id.btnRegistroMascota:
                miIntent = new Intent(getApplicationContext(), RegistroMascotaActivity.class);
                break;
            case R.id.btnConsultaIndividual:
                miIntent = new Intent(getApplicationContext(), ConsultarUsuariosActivity.class);
                break;
            case R.id.btnConsultaSpinner:
                miIntent = new Intent(getApplicationContext(), ConsultaComboActivity.class);
                break;
            case R.id.btnConsultaLista:
                miIntent = new Intent(getApplicationContext(), ConsultarListaListViewActivity.class);
                break;
            case R.id.btnConsultaListaMascota:
                miIntent = new Intent(getApplicationContext(), ListaMascotasActivity.class);
                break;
            case R.id.btnConsultaListaPersonasRecycler:
                miIntent = new Intent(getApplicationContext(), ListaPersonasRecycler.class);
                break;
        }
        if (miIntent != null) {
            startActivity(miIntent);
        }
    }
}
