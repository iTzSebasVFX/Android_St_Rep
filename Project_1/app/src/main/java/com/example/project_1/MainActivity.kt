package com.example.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.project_1.ui.theme.Project_1Theme
import com.example.project_1.view.Activity1.Imagen1
import com.example.project_1.view.Activity1.Imagen2
import com.example.project_1.view.Activity1.Imagen3
import com.example.project_1.view.Activity1.LoginView
import com.example.project_1.view.VacioInfinito.Navegate
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Padre de todo nuestro archivo
        setContent {
            Project_1Theme {
                Navegate()
            }
        }
    }
}

@Composable
fun Horizontal(navController: NavHostController) {
    val pagerState = rememberPagerState(pageCount = { 3 })
    LaunchedEffect(Unit) {
        while (true) {
            delay(3000L)
            val nextPage = (pagerState.currentPage + 1) % 3
            pagerState.animateScrollToPage(
                nextPage,
                animationSpec = tween(durationMillis = 600, easing = FastOutSlowInEasing)
            )
        }
    }
    HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> Imagen1()
            1 -> Imagen2()
            2 -> Imagen3(navController)
            else -> Text(text = "No se encontro la pagina")
        }
    }
}

@Composable
fun BotonesPeques(activateIndex: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(3) { i ->
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .padding(horizontal = 2.dp)
                    .background(
                        if (activateIndex == i) Color(0xFF000052) else Color(0xFF333950).copy(
                            alpha = 0.5f
                        ), shape = CircleShape
                    )
            ) {

            }
        }
    }
}

/* @Composable
fun Horizontal (){
    val pagerState = rememberPagerState(pageCount = {3})
    HorizontalPager(state = pagerState) { page ->
        when(page){
            0 -> PrimeraVentana()
            1 -> SegundaVentana()
            2 -> TerceraVentana()
            else -> Text(text = "No se encontro")
        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 60.dp, horizontal = 30.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(3) { i ->
            Box(
                modifier = Modifier
                    .size(15.dp)
                    .padding(horizontal = 4.dp)
                    // En este if se verifica si el indice de la pagina actual es 1 entonces el color de fondo de la box sera negro.
                    .background(if(pagerState.currentPage == i) Color.Black else Color.LightGray.copy(alpha = 0.5f), shape = CircleShape)
            ){

            }
        }
    }
} */

@Composable
fun PrimeraVentana() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF04053B)),
        //contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hola Parceros/Princesas",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun SegundaVentana() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFDCA75B)),
        //contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Aqui en la ventana 2",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun TerceraVentana() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFF0000)),
        //contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Aqui en la 3er ventana",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

/* @Composable
fun Base() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Texto("Hola perros", Modifier.height(30.dp))
            Texto("hola perros", Modifier.height(30.dp))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Texto("holaa")

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Texto("Hola perros", Modifier.height(30.dp))
            Texto("hola perros", Modifier.height(30.dp))
        }
    }


} */

/* @Composable
fun texto(text: String){

    var input by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(54.dp)) {

        Box(){
            TextField(
                value = input,
                onValueChange = {it: String -> input = it }
            )
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                input = "Okey";
            }
        ) {
            Text("Enviar");
        }
        Box(modifier = Modifier.fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(Color.Blue)
        ){
            Text(
                text = input,
                modifier = Modifier.fillMaxSize(),
                textAlign = TextAlign.Center,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )
        }

        Box(modifier = Modifier.fillMaxHeight(1f)) {
            Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Description")
        }
    }
} */

/* @Composable
fun Body() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            // R hace referencia a carpeta res, busca la carpeta drawble y la imagen que agregamos como vector assets.
            painter = painterResource(R.drawable.cardsvg),
            contentDescription = null

        )
    }
} */

/* @Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview2() {
    Project_1Theme {
        Imagen2();
    }
} */
