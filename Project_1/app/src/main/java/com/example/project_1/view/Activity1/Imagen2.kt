package com.example.project_1.view.Activity1

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.R

@Composable
fun Imagen2() {
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
                .offset(y = (-260).dp)
        ) {
            Text(
                "\u00aebibi",
                fontSize = 70.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
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
    }
}