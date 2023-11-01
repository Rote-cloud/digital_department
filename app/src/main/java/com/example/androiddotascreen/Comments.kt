package com.example.androiddotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

data class ItemDataComment(
    val imageId: Int,
    val userName: String,
    val date: String,
    val text: String
)

@Preview
@Composable
fun Comments(
    modifier: Modifier = Modifier
) {
        Column(
            modifier= Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        ) {

            MyComment(ItemDataComment(R.drawable.comment1, "Auguste Conte", "February 14, 2019",
                "“Once you start to learn its secrets, " +
                        "there’s a wild and exciting variety of play here " +
                        "that’s unmatched, even by its peers.”"))

            Divider(
                color = Color("#1A1F29".toColorInt()),
                //color = Color.Blue,
                thickness = 1.dp,
                modifier = Modifier
                    .padding(start = 40.dp, end = 40.dp)
            )

            MyComment(ItemDataComment(R.drawable.comment2, "Jang Marcelino", "February 14, 2019",
                "“Once you start to learn its secrets, " +
                        "there’s a wild and exciting variety of play here " +
                        "that’s unmatched, even by its peers.”"))
        }
}

@Composable
fun MyComment(item: ItemDataComment) {
    Column(
        modifier = Modifier.padding(all = 24.dp
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = item.imageId),
                contentDescription = "imageComm",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = item.userName,
                    style = MaterialTheme.typography.subtitle2,
                    color = Color("#FFFFFF".toColorInt())
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(text = item.date,
                    style = MaterialTheme.typography.body2,
                    color = Color("#FFFFFF".toColorInt()),
                    modifier = Modifier
                        .alpha(0.4f))
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = item.text,
            color = Color("#A8ADB7".toColorInt()),
            fontSize = 12.sp)

    }
}

