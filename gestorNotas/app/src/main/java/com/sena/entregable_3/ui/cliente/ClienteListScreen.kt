package com.sena.entregable_3.ui.cliente

import android.graphics.Paint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.sena.entregable_3.viewmodel.ClienteViewModel

@Composable
fun listarCliente(navController: NavController, viewModel: ClienteViewModel) {
    val listaClientes = viewModel.allCliente.collectAsState().value

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "Listado de Clientes",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            )
            {
                if (listaClientes.isEmpty()) {
                    Text("No hay clientes registrados.")
                } else {
                    Column (modifier = Modifier.fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally) {
                        listaClientes.forEach { cliente ->
                            Text(text = "${cliente.id} - ${viewModel.acortarTexto(cliente.nombre)} - ${viewModel.acortarTexto(cliente.correo)}")
                            Row {
                                Button(onClick = {
                                    navController.navigate("clientesForm/${cliente.id}")
                                }) {
                                    Text("✏️")
                                }
                                Button(onClick = {
                                    viewModel.deleteCliente(cliente.id)
                                }) {
                                    Text("❌")
                                }
                            }
                        }
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { navController.navigate("clientesForm") }) {
                    Text("Agregar Cliente")
                }
                Button(onClick = { navController.navigate("notasList") }) {
                    Text("Ver Notas")
                }
            }
        }
    }
}