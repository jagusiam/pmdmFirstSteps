package com.example.eventosjavaintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ej01MetodoXMLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej01_metodo_xmlactivity);
    }

    /**
     * Método asociado al TextView a través del atributo android:onClick en res/layout/activity_metodo_xml.xml
     * DEPRECATED (Obsoleto): https://developer.android.com/reference/android/R.attr#onClick
     * <p>
     * El método recibe como parámetro la vista (view) sobre la que se hizo el click (el botón). (1)
     */
    public void miMetodoOnClick(View view) {

        // buscamos el objeto con id "textView" autogenerado desde el layout
        TextView tv = findViewById(R.id.textView);

        // Cambiando el texto del TextView con el contenido del EditText
        tv.setText("¡Hola mundo!");

    }

}

/* (1) Todos los objetos "visuales" (Layouts, TextViews, botones...) se llaman vistas y heredan
 * de la clase View. */