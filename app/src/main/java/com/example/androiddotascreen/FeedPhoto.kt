package com.example.androiddotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt

@Preview
@Composable
fun FeedPhoto(
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier= Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, bottom = 24.dp)
    ) {
        item {
            MyVideo(imageId = R.drawable.row1)
        }
        itemsIndexed(
            listOf(
                R.drawable.row2,
                R.drawable.row3
            )
        ) { _, item ->
            Box(modifier = Modifier.padding(end = 12.dp)) {
                MyRow(imageId = item)
            }
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
                .padding()
        ) {
            Image(painter = painterResource(id = imageId),
                contentDescription = "image",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(width = 220.dp, height = 120.dp),
                contentScale = ContentScale.FillBounds,
            )
        }
    }
}

@Composable
fun MyVideo(imageId: Int) {
    Box(modifier = Modifier.padding(end = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        MyRow(imageId = imageId)


        Image(painter = painterResource(id = R.drawable.icon_video),
            contentDescription = "icon_video",
            modifier = Modifier.size(40.dp))

    }
}