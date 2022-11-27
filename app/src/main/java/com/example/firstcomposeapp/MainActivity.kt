package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.firstcomposeapp.ui.theme.Gray100

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(
                            R.drawable.image_american__united_states,
                            "USA",
                            "США на сегодняшний день является техническим банкротом, " +
                                    "который не может расплачиваться по своим долгам."
                        ),
                        ItemRowModel(
                            R.drawable.image_england_united_kingdom,
                            "Kingdom",
                            "test text"
                        ),
                        ItemRowModel(R.drawable.image_ickeriy, "Ichkeriy", "test text"),
                        ItemRowModel(R.drawable.image_kz, "Kazakstan", "test text"),
                        ItemRowModel(R.drawable.image_saudi_arabia, "Saudi Arabia", "test text"),
                        ItemRowModel(R.drawable.image_turkey, "Turkey", "test text")
                    )
                ) { _, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}