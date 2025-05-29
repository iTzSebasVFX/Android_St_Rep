package com.example.project_1.view.Activity1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.BotonesPeques
import com.example.project_1.R
import com.example.project_1.Titulo
import com.example.project_1.view.RelicarioMaldito.orientacion

@Composable
fun Imagen2() {
    if (orientacion() == true) {
        LazyColumn {
            item {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row {
                            Titulo()
                        }
                        Image(
                            painter = painterResource(R.drawable.ic_launcher_stripe),
                            contentDescription = null,
                            modifier = Modifier.size(200.dp)
                        )
                        Spacer(modifier = Modifier.height(40.dp))
                        Text(
                            "For cabin crew who want to train students",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(40.dp))
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "Share your knowledge with students, recruit students and earn money on it",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(0.8f),
                                textAlign = TextAlign.Center,
                                color = Color.Gray
                            )
                        }
                        Spacer(modifier = Modifier.height(40.dp))
                        BotonesPeques(0);
                    }
                }
            }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize()

    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_stripe), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .offset(y = (-30).dp)
                .align(Alignment.Center)
                .size(200.dp)
        )
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-300).dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "\u00ae"
                )
                Text(
                    "bibi",
                    fontSize = 70.sp,
                    textAlign = TextAlign.Left
                )
            }
        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (200).dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "For cabin crew who want to train students",
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(0.9f),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                "Share your knowledge with students, recruit students and earn money on it",
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth(0.8f),
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (380).dp)
        ) {
            BotonesPeques(1);
        }
    }
}