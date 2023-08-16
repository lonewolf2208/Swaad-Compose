package com.example.swaad_compose.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.swaad_compose.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun UserLogin(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    var passwordVisibility: Boolean by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.user_login),
            contentDescription = "login_image",
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)

        )
        OutlinedTextField(value = text,
            label = {
                Text(text = "Enter your email")
            },
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp,end=24.dp,top=24.dp),
            shape = RoundedCornerShape(32.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "wmail") }
        )
        OutlinedTextField(value = text,
            label = {
                Text(text = "Enter your email")
            },
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp,end=24.dp,top=16.dp, bottom = 16.dp),
            shape = RoundedCornerShape(32.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lock") })
        Text(text = "Forgot Password ?", modifier = Modifier.padding(start = 24.dp), color = Color.Black)
        Button(
            onClick = { },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#FFD243"))
            )
        ) {
            Text(
                text = "Sign In",
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )
        }
      Text(
            buildAnnotatedString {
                append("New Here ? ")
                withStyle(
                    style = SpanStyle(
                        color = Color(android.graphics.Color.parseColor("#FFD243"))
                    )
                ) {
                    append("Sign Up")
                }
            },
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
                .clickable {
                           navController.navigate("sign_up")
                },
            fontFamily = FontFamily(Font(R.font.poppins_regular))

        )


    }
}