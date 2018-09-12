package com.example.lwaw.mis_lugares;

import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PreferenciasFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);//aqui referenciamos
    }
    /*La clase PreferenceFragment permite crear un fragment que contiene una ventana con las opciones
    de preferencias definidas en un recurso XML. Un fragment es
    un elemento que puede ser incrustado dentro de una actividad. El uso de fragment se estudia con más detalle en la última unidad del curso.*/
}
