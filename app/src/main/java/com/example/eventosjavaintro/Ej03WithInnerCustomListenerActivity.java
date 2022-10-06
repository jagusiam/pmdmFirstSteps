package com.example.eventosjavaintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Ej03WithInnerCustomListenerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reutilizado);

        Button b = findViewById(R.id.button);

        /** Creación de clase que implementa el listener. Estilo clásico Java. Es raro hacerlo así ya que no
         tiene mucho sentido tener un clase solo para eso. Generas ficheros innecesariamente.
         Simplemente es importante comprenderlo como paso previo para comprender el uso de clases anónimas (Ej04). */

        /* Se asigna un escuchador de tipo OnClickListener; objeto que contiene el método al que se llamará
        ante el evento de pulsar en el botón. De este modo, el objeto boton tendrá un
        objeto Listener que tiene el método onClick al que se llamará cuando suceda el evento. */
        b.setOnClickListener(new CustomOnClickListener());
        // Se asigna un objeto anónimo de la clase CustomOnClickListener.

    }

    /**
     * Clase interna (inner class) que implementa la interfaz OnClickListener. Igual que en el Ej02 pero
     * ahora tenemos visibilidad a los campos de la clase externa (enclosing class) directamente y no
     * es necesario pasarlos en el constructor.
     */
    private class CustomOnClickListener implements View.OnClickListener {

        TextView tv = findViewById(R.id.textView);

        /**
         * Método que saltará ante el evento de un click sobre el elemento.
         * @param v referencia al objeto de la vista que lanzó el evento (sobre la que se hizo click)
         */
        @Override
        public void onClick(View v) {
            // Cambiando el texto del TextView con el contenido del EditText
            tv.setText("¡Hola mundo!"); // (1)
        }

    }



}