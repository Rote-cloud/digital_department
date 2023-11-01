package com.example.androiddotascreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

@Preview
@Composable
fun Genres(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = Modifier.padding(start = 24.dp, top = 24.dp)
    ) {
        itemsIndexed(
            listOf(
                "MOBA",
                "MULTIPLAYER",
                "STRATEGY"
            )
        ) { _, item ->
            MyGenres(genre = item)
        }
    }
}

@Composable
fun MyGenres(genre: String) {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.padding(end = 12.dp)) {
        Card(
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .padding()
                .alpha(0.24f)
        ) {
            Box(
                modifier = Modifier
                    .background(Color("#44A9F4".toColorInt()))
                    .padding(start = 12.dp, end = 12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = genre,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(top = 4.dp, bottom = 4.dp),
                    color = Color("#44A9F4".toColorInt())
                )
            }
        }

        Text(
            text = genre,
            fontSize = 10.sp,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 4.dp),
            color = Color("#44A9F4".toColorInt())
        )
    }
}