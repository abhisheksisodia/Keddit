package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun Login(navController: NavController) {
    Surface(color = MaterialTheme.colors.background) {
        Image(painterResource(id = R.drawable.welcome), contentDescription = "background")
        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)) {
            Image(painterResource(id = R.drawable.logo), contentDescription = "logo")
            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 8.dp)) {
                Text(text = "Login In")
            }
        }
    }
}