package com.example.swaad_compose.ui.components

import android.graphics.Color.parseColor

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

import com.example.swaad_compose.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(parseColor("#FFD243")))
    ) {
        Image(
            painter = painterResource(id = R.drawable.frame_66),
            contentDescription = "Splash_Screen"
        )
    }
    LaunchedEffect(Unit )
    {
        delay(3000L)
        navController.navigate("login")
    }


}