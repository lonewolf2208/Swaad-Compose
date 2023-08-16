package com.example.swaad_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.swaad_compose.ui.components.SignUp
import com.example.swaad_compose.ui.components.SplashScreen
import com.example.swaad_compose.ui.components.UserLogin
import com.example.swaad_compose.ui.theme.Swaad_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Swaad_ComposeTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "splash_screen"){
                    composable("splash_screen"){ SplashScreen(navController)}
                    composable("login"){ UserLogin(navController)}
                    composable("sign_up"){ SignUp()}
                    composable("home"){}
                }
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


@Composable
fun GreetingPreview() {
    Swaad_ComposeTheme {
        Greeting("Android")
    }
}