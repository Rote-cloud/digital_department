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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.androiddotascreen.ui.theme.DarkWhite
import com.example.androiddotascreen.ui.theme.White
import com.example.androiddotascreen.ui.theme.White2

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
            text = stringResource(id = R.string.review_ratings),
            fontSize = 16.sp,
            color = White2,
            modifier = Modifier.padding(bottom = 12.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(id = R.string.rating),
                fontSize = 48.sp,
                color = White,
                modifier = Modifier.padding(end = 24.dp)
            )

            Column(

            ) {
                Image(
                    painter = painterResource(id = R.drawable.grade),
                    contentDescription = "grade_ratings",
                    modifier = Modifier.size(width = 75.dp, height = 20.dp)
                )

                Text(text = stringResource(id = R.string.review70M),
                    fontSize = 12.sp,
                    color = DarkWhite
                )
            }
        }
    }
}