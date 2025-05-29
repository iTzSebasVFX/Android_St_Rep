package com.example.project_1.view.RelicarioMaldito

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.viewmodel.ViewModel2

@Composable
fun Formulario(viewModel: ViewModel2 = viewModel()) {
    // PrimerView nombre en el composable
    // segundo nombre de la clase
    // tercer nombre general de la clase
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            OutlinedTextField(
                value = viewModel.nombre,
                onValueChange = { viewModel.nombre = it },
                label = { Text(text = "Nombre") }
            )
            OutlinedTextField(
                value = viewModel.edad,
                onValueChange = {viewModel.edad = it},
                label = { Text("Ingrese su edad") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
            OutlinedTextField(
                value = viewModel.pass,
                onValueChange = { viewModel.pass = it },
                label = { Text(text = "Password") },
                singleLine = true, // todo debe ir en una linea y no se permite saltos de linea
                visualTransformation = PasswordVisualTransformation()
            )
            Text(text = "Altura")
            OutlinedTextField(
                value = viewModel.altura.toString(),
                onValueChange = { viewModel.altura = it.toFloat() },
                label = { Text(text = "Altura")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
            /* Slider(
                value = viewModel.altura.toFloat(),
                onValueChange = {viewModel.altura = it.toFloat()},
                valueRange = 0f .. 2.30f,
                steps = 200,
                modifier = Modifier.fillMaxWidth()
            )
            Text(viewModel.altura.toString()) */
            Text("Acepto terminos y condiciones")
            Checkbox(checked = viewModel.terminos,
                onCheckedChange = { viewModel.terminos = it })
            Text("Genero")
            repeat(viewModel.generos.size){
                RadioButton(selected = viewModel.genero == viewModel.generos[it],
                    onClick = { viewModel.genero = viewModel.generos[it]})
                Text(viewModel.generos[it])
            }
            Button(
                onClick = { viewModel.guardar() }
            ) {
                Text(text = "Guardar Datos")
            }
        }
    }
}