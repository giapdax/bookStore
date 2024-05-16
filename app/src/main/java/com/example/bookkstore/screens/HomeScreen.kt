package com.example.bookkstore.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.bookkstore.R

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.TopCenter
    ) {
        Column {
            AuthorSection()
            DetailSection()
            ImageSection()
        }
    }
}

@Composable
fun AuthorSection() {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Row {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "")
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = stringResource(id = R.string.author),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )
                Spacer(modifier = Modifier.height(2.dp))
                Icon(imageVector = Icons.Filled.Email, contentDescription = "")
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = stringResource(id = R.string.email),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Blue
                )
                Spacer(modifier = Modifier.height(2.dp))
                Icon(imageVector = Icons.Filled.Phone, contentDescription = "")
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = stringResource(id = R.string.phone),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Blue
                )
                Spacer(modifier = Modifier.height(2.dp))
            }
        }
    }
}

@Composable
fun DetailSection() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "")
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = stringResource(id = R.string.app_title),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Spacer(modifier = Modifier.height(2.dp))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(imageVector = Icons.Filled.AccountBox, contentDescription = "")
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = stringResource(id = R.string.showallbook),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Spacer(modifier = Modifier.height(2.dp))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = stringResource(id = R.string.findbook),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Spacer(modifier = Modifier.height(2.dp))
            }
        }
    }
}

@Composable
fun ImageSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(240.dp)
                .clip(CircleShape)
                .border(3.dp, Color.Red, CircleShape),
            painter = painterResource(id = R.drawable.book), contentDescription = ""
        )
    }
}

@Preview
@Composable
fun Homess() {
    HomeScreen()

}
