package com.ymt.sqlitedemoch;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ymt.sqlitedemoch.utilidades.Utilidades;

public class RegistroUsuariosActivity extends AppCompatActivity {

    EditText campoId, campoNombre, campoTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        campoId = (EditText) findViewById(R.id.campoId);
        campoNombre = (EditText) findViewById(R.id.campoNombre);
        campoTelefono = (EditText) findViewById(R.id.campoTelefono);
    }

    public void onClick(View view) {
        registrarUsuarios();
       // registrarUsuariosSql();
    }

    private void registrarUsuariosSql() {
        //Defino cual es la base de datos
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);

        //abro la base de datos para poder editarlo
        SQLiteDatabase db = conn.getWritableDatabase();

        String insert="INSERT INTO " + Utilidades.TABLA_USUARIO+" ( "+Utilidades.CAMPO_ID+","
                +Utilidades.CAMPO_NOMBRE+"," + Utilidades.CAMPO_TELEFONO+")" + "VALUES ("+campoId.getText().toString()+",'"+campoNombre.getText().toString()+
                "','"+campoTelefono.getText().toString()+"')";

        db.execSQL(insert);

        db.close();
    }

    private void registrarUsuarios() {

        //Defino cual es la base de datos
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);

        //abro la base de datos para poder editarlo
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_ID, campoId.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE, campoNombre.getText().toString());
        values.put(Utilidades.CAMPO_TELEFONO, campoTelefono.getText().toString());

        Long idResultante = db.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_ID, values);

        Toast.makeText(getApplicationContext(), "Id Registro " + idResultante, Toast.LENGTH_SHORT).show();
        db.close();
    }
}
