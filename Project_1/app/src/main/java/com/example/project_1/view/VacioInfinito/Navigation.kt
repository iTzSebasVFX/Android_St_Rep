package com.example.project_1.view.VacioInfinito

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project_1.Horizontal
import com.example.project_1.view.Activity1.Imagen3
import com.example.project_1.view.Activity1.LoginView
import com.example.project_1.view.Activity1.RegisterView

@Composable
fun Navegate(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "horizontal", // ruta que va a cargar principalmente
        ){
        composable("horizontal") {
            Horizontal(navController = navController)
        }
        composable("login") {
            LoginView(navController = navController)
        }
        composable("register") {
            RegisterView(navController = navController)
        }
    }
}