package com.example.project_1.view.Activity1

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project_1.R
import com.example.project_1.ui.theme.Project_1Theme

@Composable
fun LoginView(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.ic_launcher_imgfonfluid),
                contentScale = ContentScale.FillBounds
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                text = "Login",
                fontSize = 50.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF00BCD4)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.15f),
                horizontalArrangement = Arrangement.Center
            ) {
                var text by remember { mutableStateOf(TextFieldValue("")) }
                TextField(
                    value = text,
                    onValueChange = { newText ->
                        text = newText
                    },
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .border(3.dp, Color(0xFF00FFF7), shape = CircleShape),
                    label = {
                        Text(text = "Enter Email")
                    },
                    placeholder = {
                        Text(text = "Amazing@gmail.com")
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.2f),
                horizontalArrangement = Arrangement.Center
            ) {
                var password by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                TextField(
                    value = password,
                    onValueChange = { newText ->
                        password = newText
                    },
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .border(3.dp, Color(0xFF00FFF7), shape = CircleShape),
                    label = {
                        Text(text = "Enter Password")
                    },
                    placeholder = {
                        Text(text = "itzAmazing213")
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { "" },
                    modifier = Modifier.fillMaxWidth(0.5f),
                    colors = ButtonColors(
                        containerColor = Color.Cyan,
                        contentColor = Color.White,
                        disabledContainerColor = Color.White,
                        disabledContentColor = Color.Cyan
                    )
                ) {
                    Text(
                        text = "Enter",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Don't have a account?",
                )
                TextButton(
                    onClick = {navController.navigate("register")}
                ) {
                    Text(
                        text = "Register",
                        fontSize = 20.sp,
                        color = Color(0xFF00E2FF)
                    )
                }
            }
        }
    }
}