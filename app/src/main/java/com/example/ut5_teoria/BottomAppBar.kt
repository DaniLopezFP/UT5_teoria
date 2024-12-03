package com.example.ut5_teoria

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun MyBottomAppBar() {
    BottomAppBar(
        actions = {
            IconButton(onClick = { /* do something */ }, modifier = Modifier.weight(1f)) {
                Column {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Boton Home"
                    )
                    Text(text = "Play", fontSize = 10.sp)
                }
            }

            IconButton(onClick = { /* do something */ }, modifier = Modifier.weight(1f)) {
                Column {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Boton Play",
                    )
                    Text(text = "Play", fontSize = 10.sp)
                }

            }
            IconButton(onClick = { /* do something */ }, modifier = Modifier.weight(1f)) {
                Column(verticalArrangement = Arrangement.Center) {
                    Icon(
                        Icons.Filled.Email,
                        contentDescription = "Botón email",
                    )
                    Text(text = "E-mail", fontSize = 10.sp)
                }

            }
            IconButton(onClick = { /* do something */ }, modifier = Modifier.weight(1f)) {
                Column {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Botón usuario",
                    )
                    Text(text = "User", fontSize = 10.sp)
                }
            }
            IconButton(onClick = { /* do something */ }, modifier = Modifier.weight(1f)) {
                Column {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "Settings",
                    )
                    Text(text = "Settings", fontSize = 10.sp)
                }
            }
        },
        containerColor = Color.Red
    )
}

@Composable
fun MyFAB(){
    FloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Filled.Add, contentDescription ="Add" )
    }
}

@Composable
fun MySmallFAB() {
    SmallFloatingActionButton(
        onClick = { /*TODO*/  },
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary,
        shape = RoundedCornerShape(50)
    ) {
        Icon(Icons.Filled.Add, "Small floating action button.")
    }
}

@Composable
fun MyLargeAB() {
    LargeFloatingActionButton(
        onClick = { /*TODO*/  },
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary,
        shape = RoundedCornerShape(50)
    ) {
        Icon(Icons.Filled.Add, "Small floating action button.")
    }
}

@Composable
fun MyExtendedFAB() {
    ExtendedFloatingActionButton(
        onClick = { /*TODO*/ },
        icon = { Icon(Icons.Filled.Edit, "Extended floating action button.") },
        text = { Text(text = "Extended FAB") },
    )
}

