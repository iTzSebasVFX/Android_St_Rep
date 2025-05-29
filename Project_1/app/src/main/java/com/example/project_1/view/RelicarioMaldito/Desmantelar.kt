package com.example.project_1.view.RelicarioMaldito

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun orientacion(): Boolean {
    val configuration = LocalConfiguration.current
    val maxwidht = configuration.screenWidthDp
    val maxheight = configuration.screenHeightDp
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            return true
        }

        Configuration.ORIENTATION_PORTRAIT -> {
            return false
        }

        else -> {
            return false
        }
    }
    /* BoxWithConstraints{
        if (maxWidth > 600.dp) {
            print("Es una tablet")
        } else if (maxWidth > 700.dp) {
            print("Es una computador")
        } else {
            print("Es un movil")
        }
    } */
}

@Composable
fun Desmantelar(navController: NavHostController) {
    var data2 by remember { mutableStateOf("") } // con el by accede directamente al valor en el textfield
    var data by rememberSaveable { mutableStateOf("") } // Permite permanencia de los datos aun cuando se recompone o se gira la pantalla
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = if (orientacion() == true) {
                    Color(0xFFFF0000)
                } else {
                    Color(0xFF00BCD4)
                }
            ),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "Boton hacia cleave")
            TextField(
                value = data,// .value, se vuelve innecesario con el by, value es lo que se muestra en pantalla
                onValueChange = { data = it }, // este permite escribir el valor de data
                label = { Text(text = "Nombre") }
            )
            Button(
                onClick = { navController.navigate("cleave/$data") }
            ) {
                Text(
                    text = "ir a cleave",
                    color = if (orientacion() == true) {
                        Color(0xFFFF0000)
                    } else {
                        Color(0xFFFFFFFF)
                    }
                )
            }
        }
    }
}