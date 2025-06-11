package com.sena.entregable_3.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sena.entregable_3.data.local.AppDatabase
import com.sena.entregable_3.repository.ClienteRepository
import com.sena.entregable_3.repository.NotaRepository
import com.sena.entregable_3.ui.cliente.formCliente
import com.sena.entregable_3.ui.cliente.listarCliente
import com.sena.entregable_3.ui.nota.formNotas
import com.sena.entregable_3.ui.nota.listarNotas
import com.sena.entregable_3.viewmodel.ClienteViewModel
import com.sena.entregable_3.viewmodel.NotaViewModel

@Composable
fun appNavigation() {

    val navController = rememberNavController()
    val context = LocalContext.current

    val database = AppDatabase.getDatabase(context)
    val clienteRepository = remember { ClienteRepository(database.clienteDao()) }
    val notaRepository = remember { NotaRepository(database.notasDao()) }

    val clienteViewModel = remember { ClienteViewModel(clienteRepository) }
    val notaViewModel = remember { NotaViewModel(notaRepository) }

    NavHost(navController, startDestination = "clientesList") {
        composable("clientesList") {
            listarCliente(navController, clienteViewModel)
        }
        composable("clientesForm") {
            formCliente(navController, clienteViewModel)
        }
        composable("notasList") {
            listarNotas(navController, notaViewModel, clienteViewModel)
        }
        composable("notasForm") {
            formNotas(navController, notaViewModel, clienteViewModel)
        }
    }
}

