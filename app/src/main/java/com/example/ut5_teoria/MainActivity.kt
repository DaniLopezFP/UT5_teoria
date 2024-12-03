package com.example.ut5_teoria

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ut5_teoria.ui.theme.UT5_teoriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UT5_teoriaTheme {
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
                CustomScaffold()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UT5_teoriaTheme {
        Greeting("Android")
    }
}

@Composable
fun CustomScaffold() {
    Scaffold(
        // Barra superior
        topBar = {
            //MyTopAppBar()
            MyTopAppBarCenter()
            // MyTopAppBarSmall()
            //MyTopAppBarMedium()
            //MyTopAppBarLarge()
        },

        // Barra inferior
        bottomBar = { },

        // Botón flotante personalizado
        floatingActionButton = { },

        // Contenido principal
        content = { paddingValues ->
            Column(Modifier.padding(paddingValues)) {
                Greeting(name = "Hola")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar() {
    TopAppBar(
        // Título de la barra superior
        title = { Text(text = "TopAppBar") },
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBarCenter() {
    val contextForToast = LocalContext.current.applicationContext
    CenterAlignedTopAppBar(// Título de la barra superior

        title = {
            Row(Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.dragonball),
                    contentDescription = "Dragon Ball",
                    Modifier.size(100.dp)
                )
                Text(text = "TopAppBar")
            }
        },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Nav Icon Click", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Add Click", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Items")
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBarSmall() {
    TopAppBar(
        // Título de la barra superior
        title = {

            Text(text = "TopAppBar")
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBarMedium() {
    val contextForToast = LocalContext.current.applicationContext
    MediumTopAppBar(// Título de la barra superior
        title = {

            Text(text = "TopAppBar")
        },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Nav Icon Click", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Add Click", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Items")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Favorito")
            }
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBarLarge() {
    val contextForToast = LocalContext.current.applicationContext
    LargeTopAppBar(
        // Título de la barra superior
        title = {

            Text(text = "TopAppBar")
        },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Nav Icon Click", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Add Click", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Items")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Favorito")
            }
        },
        colors = TopAppBarDefaults.largeTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    )
}


