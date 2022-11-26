package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Moscow")
                    Text(text = "Piter")
                    Text(text = "Hello!")
                }
                Column(
                    modifier = Modifier
                        .background(Color.Red)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Moscow")
                    Text(text = "Piter")
                    Text(text = "Hello!")
                }
            }
        }
    }
}
