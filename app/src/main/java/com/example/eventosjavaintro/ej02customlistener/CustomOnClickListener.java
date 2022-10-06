package com.example.eventosjavaintro.ej02customlistener;

import android.view.View;
import android.widget.TextView;

import com.example.eventosjavaintro.R;

public class CustomOnClickListener implements View.OnClickListener {
    TextView tv;

    /**
     * El constructor tiene que recibir la referencia al TextView ya que pertenece a la
     * activity (está en su contexto), y necesitamos acceso a él para las acciones a realizar en
     * el método onClick.
     */
    public CustomOnClickListener(TextView tv) {
        this.tv=tv;
    }


    /**
     * Método que saltará ante el evento de un click sobre el elemento.
     */
    @Override
    public void onClick(View vista) {
        // Cambiando el texto del TextView con el contenido del EditText
        tv.setText("¡Hola mundo!");
    }

}
