package com.sena.entregable_3.ui.cliente

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sena.entregable_3.viewmodel.ClienteViewModel

@Composable
fun listarCliente(navController: NavController, viewModel: ClienteViewModel) {
    val listaClientes = viewModel.allCliente.collectAsState().value

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Listado de Clientes")

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly)
        {
            if (listaClientes.isEmpty()) {
                Text("No hay clientes registrados.")
            } else {
                listaClientes.forEach { cliente ->
                    Text(text = "${cliente.nombre} - ${cliente.correo}")
                Row {
                    /*
                    Button(onClick = {
                        navController.navigate("clientesForm?id=${cliente.id}")
                    }) {
                        Text("✏️")
                    }
                    */

                    Button(onClick = {
                        viewModel.deleteCliente(cliente.id)
                    }) {
                        Text("❌")
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
                Text("Ir a Notas")
            }
        }
    }
}
