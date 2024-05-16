package com.example.bookkstore.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bookkstore.BottomBarScreen
import com.example.bookkstore.screens.AddScreen
import com.example.bookkstore.screens.FindScreen
import com.example.bookkstore.screens.HomeScreen
import com.example.bookkstore.screens.ProductScreen

// chức năng điều hướng mở các màn hình
@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController,
        // màn hình nào hiển thị mặc định khi chạy vào ưng dụng
        startDestination = BottomBarScreen.Home.route ){
        // Hiển thị màn hình Home
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        //Hiển thị màn hình Products
        composable(route = BottomBarScreen.Home.route){
            ProductScreen()
        }
        // Hiển thị màn hình Add
        composable(route = BottomBarScreen.Home.route){
            AddScreen()
        }
        //hiển thị màn hình Find
        composable(route = BottomBarScreen.Home.route){
            FindScreen()
        }

    }

}