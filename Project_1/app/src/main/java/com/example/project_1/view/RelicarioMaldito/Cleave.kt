package com.example.project_1.view.RelicarioMaldito

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Cleave(navController: NavHostController, nombre: String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Bienvenido ${nombre}")
        Text(text = "Boton hacia desmantelar")
        Button(
            onClick = { navController.navigate("desmantelar") }
        ) {
            Text(text = "ir")
        }
    }
}