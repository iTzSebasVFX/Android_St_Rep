package com.example.project_1.view.Activity1

import android.R.attr.onClick
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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
fun Imagen3() {
    Box(
        modifier = Modifier.fillMaxSize()

    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_postal), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .offset(y = (-100).dp)
                .align(Alignment.Center)
                .size(300.dp)
        )
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-300).dp)
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
        ) {
            Text(
                "Get Started",
                fontSize = 50.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = { },
                colors = ButtonColors(containerColor = Color.Blue, contentColor = Color.White, disabledContentColor = Color.White, disabledContainerColor = Color.Blue),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp, vertical = 10.dp)
            ) {
                Text(
                    "Enviar",
                    fontSize = 20.sp
                    )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Already have an account? ",
                    color = Color(0xFF2F2E2E),
                    fontSize = 20.sp
                )
                Text(
                    "Login",
                    color = Color(0xFFFF5722),
                    fontSize = 20.sp
                )
            }
        }
    }
}
