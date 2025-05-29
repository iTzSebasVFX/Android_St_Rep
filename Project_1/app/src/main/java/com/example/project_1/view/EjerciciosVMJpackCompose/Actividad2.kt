package com.example.project_1.view.EjerciciosVMJpackCompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

// Actividad 1, Par Verder, impar rojo
/* @Composable
fun ParImpar(viewmodel3: ViewModel3 = viewModel()) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                if (viewmodel3.contador.value % 2 == 0) Color(0xFF168700) else Color(
                    0xFFFF0000
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "${viewmodel3.contador.value}")
            Button(
                onClick = { viewmodel3.aumentar() }
            ) {
                Text(text = "+")
            }
            Button(
                onClick = { viewmodel3.decrementar() }
            ) {
                Text(text = "-")
            }
        }
    }
} */

// Punto 2: Formulario de inicio de sesión
/* @Composable
fun FormLogin(viewmodel: ViewModel3 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column {
            OutlinedTextField(
                value = viewmodel.email,
                onValueChange = { viewmodel.email = it },
                label = { Text(text = "Email") }
            )
            OutlinedTextField(
                value = viewmodel.pass,
                onValueChange = { viewmodel.pass = it },
                label = { Text(text = "Email") }
            )
            Button(
                onClick = { viewmodel.iniciarSesion() },
                modifier = Modifier.fillMaxWidth(0.5f)
            ){
                Text(text = "Ingresar")
            }
            Text(text = viewmodel.mensaje)
        }
    }
} */

// Punto 3: Validación de número de teléfono


// Punto 4: Toggle de tema oscuro / claro con botón
/* @Composable
fun ToggleDarkLight(viewmodel3: ViewModel3 = viewModel()) {
    // var colorScheme = if (viewmodel3.isDarckTheme) darkColorScheme() else lightColorScheme()
    MaterialTheme(
        colorScheme = viewmodel3.colorScheme
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorScheme.background),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Text(text = "Bienvenidos, Presione el boton.",color = Color(if(viewmodel3.isDarckTheme == true) 0xFFffffff else 0xFF000000))
                Button(
                    modifier = Modifier.background(colorScheme.primary),
                    onClick = { viewmodel3.isDarckTheme = !viewmodel3.isDarckTheme }
                ) {
                    Text(
                        text = "Cambiar tema."
                        )
                }
            }
        }
    }
} */

// Punto 5: Indicador de fortaleza de contraseña


// Punto 6: Validación de formulario de registro
/* @Composable
fun FormValid(viewmodel3: ViewModel3 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            TextField(
                value = viewmodel3.Nombre,
                onValueChange = { viewmodel3.Nombre = it },
                label = {
                    if (viewmodel3.validacion == false) Text(text = "Este campo no puede ir vacio") else Text(
                        text = "Ingrese su nombre"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel3.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel3.borderWidht, viewmodel3.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            TextField(
                value = viewmodel3.Correo,
                onValueChange = { viewmodel3.Correo = it },
                label = {
                    if (viewmodel3.validacion == false) Text(text = "El email de contener un '@' y un '.'") else Text(
                        text = "Ingrese su correo"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel3.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel3.borderWidht, viewmodel3.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            TextField(
                value = viewmodel3.Contrasena,
                onValueChange = { viewmodel3.Contrasena = it },
                label = {
                    if (viewmodel3.validacion == false) Text(text = "Esta contraseña debe coincidir con la siguiente") else Text(
                        text = "Ingrese su contrasena"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel3.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel3.borderWidht, viewmodel3.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            TextField(
                value = viewmodel3.ValContrasena,
                onValueChange = { viewmodel3.ValContrasena = it },
                label = {
                    if (viewmodel3.validacion == false) Text(text = "Esta campo debe ser identico al anterior") else Text(
                        text = "Ingrese su contrasena"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel3.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel3.borderWidht, viewmodel3.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            Button(
                onClick = { viewmodel3.ValidarDatos() },
                modifier = Modifier.fillMaxWidth(0.5f)
            ) {
                Text(text = "Registrar")
            }
        }
    }
} */

// Punto 7: Lista editable de tareas con estados


// Punto 8: Campo de texto con límite de caracteres
/* @Composable
fun CampoConLimite(viewmodel3: ViewModel3 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = viewmodel3.texto,
            onValueChange = { viewmodel3.texto = it },
            label = { Text(
                text = "${viewmodel3.texto.length} / 100",
                color = if (viewmodel3.texto.length > 100) Color.Red else Color.Black
            ) },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = if (viewmodel3.texto.length > 100) Color.Red else Color.Black,
                unfocusedIndicatorColor = if (viewmodel3.texto.length > 100) Color.Red else Color.Black,
                focusedContainerColor = if (viewmodel3.texto.length > 100) Color.Gray else Color.LightGray
            ),
            modifier = Modifier.fillMaxWidth(0.8f)
        )
    }
} */

// Punto 9: Campo con validación en tiempo real


// Punto 10: Botón con carga simulada
/* @Composable
fun BotonCarga(viewmodel3: ViewModel3 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (viewmodel3.mensaje == "Presionar"){
            Button(
                onClick = { viewmodel3.botonConDelay() }
            ) {
                Text(text = viewmodel3.mensaje)
            }
        } else if (viewmodel3.mensaje == "Espera 2 segundos porfavor..."){
            TextButton(
                onClick = { "" }
            ) {
                Text(text = viewmodel3.mensaje)
            }
        } else if (viewmodel3.mensaje == "¡Accion Completada!"){
            TextButton(
                onClick = { "" }
            ) {
                Text(text = viewmodel3.mensaje)
            }
        }
    }
} */