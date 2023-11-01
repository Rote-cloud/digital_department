package com.example.androiddotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

@Preview
@Composable
fun ReviewAndRatings(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(start = 24.dp)
    ) {
        Text(
            text = "Review & Ratings",
            fontSize = 16.sp,
            color = Color("#EEF2FB".toColorInt()),
            modifier = Modifier.padding(bottom = 12.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "4.9",
                fontSize = 48.sp,
                color = Color("#FFFFFF".toColorInt()),
                modifier = Modifier.padding(end = 24.dp)
            )

            Column(

            ) {
                Image(
                    painter = painterResource(id = R.drawable.grade),
                    contentDescription = "grade_ratings",
                    modifier = Modifier.size(width = 75.dp, height = 20.dp)
                        //.padding(bottom = 8.dp)
                )

                Text(text = "70M Reviews",
                    fontSize = 12.sp,
                    color = Color("#A8ADB7".toColorInt()))
            }
        }
    }
}