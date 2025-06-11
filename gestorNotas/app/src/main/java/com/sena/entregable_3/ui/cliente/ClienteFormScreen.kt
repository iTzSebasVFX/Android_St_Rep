package com.sena.entregable_3.ui.cliente

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sena.entregable_3.viewmodel.ClienteViewModel

@Composable
fun formCliente(navController: NavController, viewModel: ClienteViewModel) {
    var nombre by rememberSaveable { mutableStateOf("") }
    var correo by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Registro de clientes",
            modifier = Modifier.padding(vertical = 30.dp),
            fontSize = 30.sp
        )

        OutlinedTextField(
            label = { Text(text = "Nombre del cliente") },
            value = nombre,
            onValueChange = { nombre = it }
        )

        OutlinedTextField(
            label = { Text(text = "Correo del cliente") },
            value = correo,
            onValueChange = { correo = it }
        )

        Button(
            onClick = {
                viewModel.addCliente(nombre, correo)
                nombre = ""
                correo = ""
                navController.popBackStack()
            },
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text(text = "Guardar")
        }
    }
}
