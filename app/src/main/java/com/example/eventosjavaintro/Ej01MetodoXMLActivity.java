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
     * El método recibe como parámetro la View (1) sobre la que se hizo el click (el botón).
     */
    //AGA: android:onClick deprecated? - Consult official docu
    
    public void miMetodoOnClick(View view) {

        // buscamos el objeto con id "textView" autogenerado desde el layout
        TextView tv = findViewById(R.id.textView);

        // Cambiando el texto del TextView con el contenido del EditText
 //AGA: EditText - referencia a EditText? y que linea de código evoca el cambio de texto en el EditText?    
        
        tv.setText("¡Hola mundo!"); // mejor usar la siguiente línea:
        // tv.setText(R.string.hola_mundo);  // (2)
       
//AGA: res/values/strings.xml - se autogeneran por el entorno? en que momento? - consultar lo de (2)
        
    }

}

/*
 * (1) Todos los objetos "visuales" (Layouts, TextViews, botones...) se llaman views (vistas) y heredan
 * de la clase View.
 *
 * (2) No deben hardcodearse strings literales, sino recuperarse del fichero de recursos
 * res/values/strings.xml
 * R es la clase autogenerada en compilación donde se recopilan los recursos definidos en xml.
 * El método setText está sobrecargado y acepta Strings o ints, pero cuando acepta ints es para
 * pasarle referencias a recursos: R.string.hola_mundo es una variable de tipo int que contiene el
 * identificador de un recurso de tipo String, que está en strings.xml y al que accederá.
 *
 * */
