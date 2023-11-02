package com.example.androiddotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FeedPhoto(
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier= Modifier
            .fillMaxWidth()
            .padding(start = dimensionResource(id = R.dimen.padding_std),
                bottom = dimensionResource(id = R.dimen.padding_std))
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
            Box(modifier = Modifier.padding(
                end = dimensionResource(id = R.dimen.padding_small))) {
                MyRow(imageId = item)
            }
        }
    }
}

@Composable
fun MyRow(imageId: Int) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Card(
            shape = RoundedCornerShape(dimensionResource(id = R.dimen.rounded_std)),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Image(painter = painterResource(id = imageId),
                contentDescription = "image",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(width = dimensionResource(id = R.dimen.photo_width),
                        height = dimensionResource(id = R.dimen.photo_height)),
                contentScale = ContentScale.FillBounds,
            )
        }
    }
}

@Composable
fun MyVideo(imageId: Int) {
    Box(modifier = Modifier.padding(end = dimensionResource(id = R.dimen.padding_small)),
        contentAlignment = Alignment.Center
    ) {
        MyRow(imageId = imageId)


        Image(painter = painterResource(id = R.drawable.icon_video),
            contentDescription = "icon_video",
            modifier = Modifier.size(dimensionResource(id = R.dimen.padding_big)))

    }
}