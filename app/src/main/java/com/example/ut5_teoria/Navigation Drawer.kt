package com.example.ut5_teoria

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.ut5_teoria.ui.theme.tear
import kotlinx.coroutines.launch

//Esta función genera una lista de 5 elementos
@Composable
fun MyModalDrawer(
    //navController: NavHostController,
    drawerState: DrawerState,
    contenido: @Composable () -> Unit
) {
    val corutina = rememberCoroutineScope()
    val sections = listOf(
        "Bandeja de entrada",
        "Enviados",
        "Archivados",
        "Favoritos",
        "Papelera"
    )
    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = false,
        drawerContent = {
            ModalDrawerSheet(drawerTonalElevation = 100.dp) {
                NavBarHeader()
                sections.forEach { item ->
                    NavigationDrawerItem(
                        label = { Text(item) },
                        selected = false,
                        onClick = {
                            corutina.launch {

                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        }
                    )
                }
            }
        }
    ) {
        contenido()
    }
}

@Composable
fun NavBarHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .height(150.dp)
            .background(tear),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.dragonball),
            contentScale = ContentScale.Crop,
            contentDescription = "Dragon Ball",
            modifier=Modifier
            .fillMaxSize()
            //size(100.dp)
            //.padding(top = 10.dp)

        )
        Text(text = "Nuestro menú lateral")
    }
}
