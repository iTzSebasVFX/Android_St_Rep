package com.example.project_1.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Scrol() {
    LazyColumn {
        // item carga 1 por 1
        // Varios automaticamente
        items(20) { index -> // Index almacena las repeticiones o iteraciones
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(
                        color = if (index % 2 == 0) {
                            Color.Blue
                        } else {
                            Color.Red
                        }
                    )
            ) {
                Text(
                    text = "Azucar pa todos XDDDD ${index}",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}