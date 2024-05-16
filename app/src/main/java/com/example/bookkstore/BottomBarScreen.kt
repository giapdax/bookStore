package com.example.bookkstore

import android.media.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
  object Home: BottomBarScreen(
      route = "home",
      title = "home",
      icon = Icons.Default.Home
  )
    object Products: BottomBarScreen(
      route = "products",
      title = "products",
      icon = Icons.Default.AccountBox
  )
    object AddBook: BottomBarScreen(
        route = "add",
        title = "Add",
        icon = Icons.Default.Add
    )
    object Find: BottomBarScreen(
        route = "find",
        title = "Find",
        icon = Icons.Default.Search
    )
}
