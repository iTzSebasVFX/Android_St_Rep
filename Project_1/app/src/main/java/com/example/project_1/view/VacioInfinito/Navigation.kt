package com.example.project_1.view.VacioInfinito

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.project_1.Horizontal
import com.example.project_1.view.Activity1.LoginView
import com.example.project_1.view.Activity1.RegisterView
import com.example.project_1.view.RelicarioMaldito.Cleave
import com.example.project_1.view.RelicarioMaldito.Desmantelar

@Composable
fun Navegate() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "horizontal", // ruta que va a cargar principalmente
        /* enterTransition = {
            slideInHorizontally(
                animationSpec = tween(800)
            )
        }, */
        enterTransition = {
            slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(800)
            )
        },
        /* enterTransition = {
            slideInHorizontally(
                initialOffsetX = { it },
            ) + fadeIn(
                animationSpec = tween(800)
            )
        } */
    ) {
        composable("desmantelar") { // arguments predeterminado viene como una lista
            Desmantelar(navController = navController)
        }

        composable(route = "cleave/{nombre}",
            arguments = listOf(navArgument ("nombre"){
                type = NavType.StringType
            })) { data ->
            val nombre = data.arguments?.getString("nombre")
            Cleave(navController = navController, nombre)
        }

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