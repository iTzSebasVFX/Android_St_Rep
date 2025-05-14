package com.example.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.project_1.ui.theme.Project_1Theme
import com.example.project_1.view.Activity1.Imagen1
import com.example.project_1.view.Activity1.Imagen2
import com.example.project_1.view.Activity1.Imagen3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                Imagen3();
            }
        }
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



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview1() {
    Project_1Theme {
        Imagen1();
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview2() {
    Project_1Theme {
        Imagen2();
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview3() {
    Project_1Theme {
        Imagen3();
    }
}