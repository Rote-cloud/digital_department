package com.example.androiddotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun FeedPhoto(
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier= Modifier.fillMaxWidth()
    ) {
        itemsIndexed(
            listOf(
                R.drawable.row1,
                R.drawable.row2,
                R.drawable.row3
            )
        ) { _, item ->
            MyRow(imageId = item)
        }
    }
}

@Composable
fun MyRow(imageId: Int) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp)
        ) {
            Image(painter = painterResource(id = imageId),
                contentDescription = "image",
                modifier = Modifier.fillMaxWidth().size(width = 220.dp, height = 120.dp),
                contentScale = ContentScale.FillBounds,
            )
        }
    }
}