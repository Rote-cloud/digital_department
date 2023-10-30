package com.example.androiddotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import com.example.androiddotascreen.R

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.dota_header),
            //bitmap = ImageBitmap.imageResource(R.drawable.dota_header),
            contentDescription = "dota header",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)

        )
        Box(
            modifier = Modifier
                .padding(start = 24.dp, top = 185.dp, end = 40.dp)
        ) {
            Dota_logo()
        }
    }

}

@Composable
fun Dota_logo() {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
    ) {
        Box(modifier = Modifier
            .background(Color.Black)
            .border(
                width = 1.dp,
                color = Color("#1F2430".toColorInt()),
                shape = RoundedCornerShape(10.dp)
            ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.dota_logo),
                contentDescription = "dota logo",
                modifier = Modifier
                    .padding(12.dp)
                    .size(50.dp)

            )
        }
    }
}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    DotaScreenHeader()
}