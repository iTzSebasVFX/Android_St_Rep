package com.sena.entregable_3.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sena.entregable_3.data.local.Cliente
import com.sena.entregable_3.repository.ClienteRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ClienteViewModel(private val ClienteRepository: ClienteRepository): ViewModel() {

    val allCliente = ClienteRepository.getAll.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )
    fun addCliente(nombre: String, correo: String){
        val newCliente = Cliente(nombre = nombre, correo = correo)
        viewModelScope.launch {
            ClienteRepository.insert(newCliente)
        }
    }
    fun updateCliente(id: Int, nombre: String, correo: String){
        val updateCliente = Cliente(id = id, nombre = nombre, correo = correo)
        viewModelScope.launch {
            ClienteRepository.update(updateCliente)
        }
    }
    fun deleteCliente(id: Int){
        viewModelScope.launch {
            ClienteRepository.delete(id)
        }
    }

}