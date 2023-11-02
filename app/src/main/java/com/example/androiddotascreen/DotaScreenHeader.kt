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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            contentDescription = "dota header",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(dimensionResource(id = R.dimen.dota_header_height))

        )
        Box(
            modifier = Modifier
                .padding(start = dimensionResource(id = R.dimen.padding_std),
                    top = dimensionResource(id = R.dimen.dota_logo_top),
                    end = dimensionResource(id = R.dimen.padding_big))
        ) {
            Dota_logo()
        }
    }

}

@Composable
fun Dota_logo() {
    Row(verticalAlignment = Alignment.Bottom) {
        Card(
            shape = RoundedCornerShape(dimensionResource(id = R.dimen.rounded_std)),
            modifier = Modifier
        ) {
            Box(modifier = Modifier
                .background(Color.Black)
                .border(
                    width = 2.dp,
                    color = DarkGrey,
                    shape = RoundedCornerShape(dimensionResource(id = R.dimen.rounded_std))
                ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dota_logo),
                    contentDescription = "dota logo",
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.padding_dota_logo))
                        .size(dimensionResource(id = R.dimen.dota_logo_size))

                )
            }
        }
        Column(
            modifier = Modifier.padding(
                start = dimensionResource(id = R.dimen.padding_small),
                bottom = dimensionResource(id = R.dimen.padding_veryverysmall))
        ) {
            Text(text = stringResource(R.string.dota2_name),
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold_font)),
                color = White
            )
            Row {
                Image(painter = painterResource(id = R.drawable.header_grade),
                    contentDescription = "header_grade",
                    modifier = Modifier.size(
                        height = dimensionResource(id = R.dimen.dota_logo_stars_height),
                        width = dimensionResource(id = R.dimen.dota_logo_stars_width))
                )
                Text(text = stringResource(id = R.string.count_review),
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular_font)),
                    color = DarkGrey2,
                    modifier = Modifier.padding(
                        start = dimensionResource(id = R.dimen.padding_small))
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