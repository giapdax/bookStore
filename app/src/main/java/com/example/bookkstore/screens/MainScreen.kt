package com.example.bookkstore.screens

import android.accounts.AuthenticatorDescription
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.bookkstore.BottomBarScreen

@Composable
fun MainScreen() {
    
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Products,
        BottomBarScreen.AddBook,
        BottomBarScreen.Find
    )

}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDescription: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = {
                Text(text = screen.title)
        },
        icon = {
               Icon(imageVector = screen.icon, contentDescription = "")
        },
        selected = currentDescription?.hierarchy?.any{it.route == screen.route
        }== true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route){
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        })

    }