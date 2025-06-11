package com.sena.entregable_3.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sena.entregable_3.data.local.Notas
import com.sena.entregable_3.repository.NotaRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class NotaViewModel(private val notaRepository: NotaRepository) : ViewModel() {

    val allNotas = notaRepository.getNotas.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun addNota(idCliente: Int, contenido: String) {
        val fechaActual = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
        val nuevaNota = Notas(contenido = contenido, fecha = fechaActual, idCliente = idCliente)
        viewModelScope.launch {
            notaRepository.insertar(nuevaNota)
        }
    }

    fun updateNota(id: Int, contenido: String, idCliente: Int) {
        val fechaActualizada = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
        val notaActualizada = Notas(id = id, contenido = contenido, fecha = fechaActualizada, idCliente = idCliente)
        viewModelScope.launch {
            notaRepository.update(notaActualizada)
        }
    }

    fun deleteNota(nota: Notas) {
        viewModelScope.launch {
            notaRepository.deleteNota(nota)
        }
    }
}

