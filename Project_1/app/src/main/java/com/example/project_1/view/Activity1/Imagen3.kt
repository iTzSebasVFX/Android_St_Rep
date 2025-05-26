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
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project_1.BotonesPeques
import com.example.project_1.R
import com.example.project_1.ui.theme.Project_1Theme
import com.example.project_1.view.VacioInfinito.Navegate


@Composable
fun Imagen3(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_postal), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .offset(y = (-100).dp)
                .align(Alignment.Center)
                .size(280.dp)
        )
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-300).dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
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
                .offset(y = (200).dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Get Started",
                fontSize = 50.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(35.dp))
            Button(
                onClick = { },
                colors = ButtonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color.Blue
                ),
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(horizontal = 15.dp)
            ) {
                Text(
                    "Enviar",
                    fontSize = 20.sp
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Already have an account?",
                    color = Color(0xFF2F2E2E),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
                TextButton(
                    onClick = { navController.navigate("login") },
                    modifier = Modifier.fillMaxWidth(0.5f)
                ) {
                    Text(
                        text = "Login",
                        color = Color(0xFFFF5722),
                        fontSize = 20.sp
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (380).dp)
        ) {
            BotonesPeques(2);
        }
    }
}