package mx.tecnm.ittepic.ladm_u1_practica1_layoutmaslayout.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {
    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        (if (it.equals(1)){
            "Para contactarnos use el telefono : 311 123 4235 "
        } else {
            "De momento no tenemos modelos disponibles en esta página \n " +
                    "Para ver el catalogo pulse la camara que aparece abajo"
        }).toString()+"\n\nEl boton de salir esta marcado con la X"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }

    public fun getIndex(){
        _index.value
    }
}