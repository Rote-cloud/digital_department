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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
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
            .padding(start = dimensionResource(id = R.dimen.padding_std))
    ) {
        Text(
            text = stringResource(id = R.string.review_ratings),
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist_bold_font)),
            color = White2,
            modifier = Modifier.padding(
                bottom = dimensionResource(id = R.dimen.padding_small))
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(id = R.string.rating),
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold_font)),
                color = White,
                modifier = Modifier.padding(
                    end = dimensionResource(id = R.dimen.padding_std))
            )

            Column(

            ) {
                Image(
                    painter = painterResource(id = R.drawable.grade),
                    contentDescription = "grade_ratings",
                    modifier = Modifier.size(width = dimensionResource(id = R.dimen.dota_review_stars_width),
                        height = dimensionResource(id = R.dimen.dota_review_stars_height))
                )

                Text(text = stringResource(id = R.string.review70M),
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular_font)),
                    color = DarkWhite
                )
            }
        }
    }
}