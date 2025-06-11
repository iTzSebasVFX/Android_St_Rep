package com.sena.entregable_3.ui.nota

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.sena.entregable_3.viewmodel.ClienteViewModel
import com.sena.entregable_3.viewmodel.NotaViewModel

@Composable
fun listarNotas(
    navController: NavController,
    notaViewModel: NotaViewModel = viewModel(),
    clienteViewModel: ClienteViewModel = viewModel()
) {
    val notas = notaViewModel.allNotas.collectAsState().value
    val clientes = clienteViewModel.allCliente.collectAsState().value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Text("Lista de Notas", modifier = Modifier.padding(bottom = 16.dp))

        LazyColumn(modifier = Modifier.fillMaxSize(0.5f)) {
            items(notas) { nota ->
                val clienteNombre = clientes.find { it.id == nota.idCliente }?.nombre ?: "Desconocido"

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text("Id: ${nota.id}")
                        Text("Cliente: $clienteNombre")
                        Text("Contenido: ${nota.contenido}")
                        Text("Fecha: ${nota.fecha}")
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Button(onClick = {
                                notaViewModel.deleteNota(nota)
                            }) {
                                Text("❌")
                            }
                            Spacer(modifier = Modifier.width(4.dp))
                            Button(onClick = {
                                navController.navigate("notasForm/${nota.id}")
                            }) {
                                Text("🖋️")
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { navController.navigate("notasForm") }) {
                Text("Agregar Nota")
            }
            Button(onClick = { navController.navigate("clientesList") }) {
                Text("Ir a Clientes")
            }
        }
    }
}
