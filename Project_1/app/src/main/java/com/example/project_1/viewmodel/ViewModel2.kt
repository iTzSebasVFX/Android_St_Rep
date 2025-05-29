package com.example.project_1.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// Punto 1 Par Impar
/* class ViewModel3: ViewModel() {
    var contador = mutableStateOf(0)
    fun aumentar(){
        contador.value++
    }
    fun decrementar(){
        contador.value--
    }
} */

// Punto 2: Formulario de inicio de sesión
/* class ViewModel3 : ViewModel() {
    var email by mutableStateOf("")
    var pass by mutableStateOf("")
    var mensaje by mutableStateOf("")
    fun iniciarSesion() {
        mensaje = if (
            email.contains("@") == true &&
            email.contains(".com") == true &&
            pass.length == 6 && pass.isEmpty() == false
        ) {
            "Los datos ingresados: ${email} / ${pass}, Son validos"
        } else {
            "Invalid Email"
        }
    }
} */

// Punto 3: Validación de número de teléfono

// Punto 4: Toggle de tema oscuro / claro con botón
/* class ViewModel3 : ViewModel() {
    var isDarckTheme by mutableStateOf(false)
    val colorScheme by derivedStateOf {
        if (isDarckTheme) darkColorScheme() else lightColorScheme()
    }
} */

// Punto 5: Indicador de fortaleza de contraseña


// Punto 6: Validación de formulario de registro
/* class ViewModel3 : ViewModel() {
    var Nombre by mutableStateOf("")
    var Correo by mutableStateOf("")
    var Contrasena by mutableStateOf("")
    var ValContrasena by mutableStateOf("")
    var validacion by mutableStateOf(true)
    val borderWidht: Dp
        get() = if (validacion == false) 5.dp else 0.dp
    val borderColor: Color
        get() = if (validacion == false) Color.Red else Color.White

    fun ValidarDatos() {
        validacion = if (
            Nombre.isEmpty() == false &&
            Correo.contains("@") &&
            Correo.contains(".") &&
            Contrasena == ValContrasena
        ) {
            true
        } else {
            false
        }
    }
} */

// Punto 7: Lista editable de tareas con estados


// Punto 8: Campo de texto con límite de caracteres
/* class ViewModel3: ViewModel(){
    var texto by mutableStateOf("")
} */

// Punto 9: Campo con validación en tiempo realv


// Punto 10: Botón con carga simulada
/* class ViewModel3 : ViewModel() {
    var mensaje by mutableStateOf("Presionar")

    fun botonConDelay() {
        viewModelScope.launch {
            mensaje = "Espera 2 segundos porfavor..."
            delay(2000)
            mensaje = "¡Accion Completada!"
            delay(800)
            mensaje = "Presionar"
        }
    }
} */