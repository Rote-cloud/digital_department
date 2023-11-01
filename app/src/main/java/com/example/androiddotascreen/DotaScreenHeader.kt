package com.example.androiddotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.androiddotascreen.ui.theme.DarkGrey
import com.example.androiddotascreen.ui.theme.DarkGrey2
import com.example.androiddotascreen.ui.theme.White

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
                .padding(start = 24.dp, top = 180.dp, end = 40.dp)
        ) {
            Dota_logo()
        }
    }

}

@Composable
fun Dota_logo() {
    Row(verticalAlignment = Alignment.Bottom) {
        Card(
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
        ) {
            Box(modifier = Modifier
                .background(Color.Black)
                .border(
                    width = 2.dp,
                    color = DarkGrey,
                    shape = RoundedCornerShape(12.dp)
                ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dota_logo),
                    contentDescription = "dota logo",
                    modifier = Modifier
                        .padding(14.dp)
                        .size(50.dp)

                )
            }
        }
        Column(
            modifier = Modifier.padding(start = 12.dp, bottom = 4.dp)
        ) {
            Text(text = "DoTA 2",
                fontSize = 20.sp,
                color = White
            )
            Row {
                    Image(painter = painterResource(id = R.drawable.header_grade),
                        contentDescription = "header_grade",
                        modifier = Modifier.size(height = 16.dp, width = 70.dp)
                    )
                    Text(text = "70M",
                        fontSize = 12.sp,
                        color = DarkGrey2,
                        modifier = Modifier.padding(start = 12.dp)
                    )
            }
        }
    }
}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    DotaScreenHeader()
}