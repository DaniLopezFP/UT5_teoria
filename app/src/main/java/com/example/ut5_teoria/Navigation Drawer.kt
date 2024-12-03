package com.example.ut5_teoria

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch

//Esta función genera una lista de 5 elementos
/*@Composable
private fun DrawerContent(closeDrawer: () -> Unit) {
    val sections = listOf(
        "Bandeja de entrada",
        "Enviados",
        "Archivados",
        "Favoritos",
        "Papelera"
    )
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        sections.forEach { section ->
            TextButton(
                onClick =  closeDrawer ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {

                    //val textColor = MaterialTheme.colors.onSurface
                    Text(
                        text = section,
                        //style = MaterialTheme.typography.body2.copy(color = textColor)
                    )
                }
            }
        }
    }
}*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyModalDrawer(
    //navController: NavHostController,
    drawerState: DrawerState,
    //contenido: @Composable() -> Unit
) {

    val corutina = rememberCoroutineScope()
    //val MydrawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
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
                sections.forEach {item->
                    NavigationDrawerItem(
                        label = {Text(item)},
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

    }
}