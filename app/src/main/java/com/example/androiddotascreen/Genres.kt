package com.example.androiddotascreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddotascreen.ui.theme.Blue

@Preview
@Composable
fun Genres(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = Modifier.padding(start = dimensionResource(id = R.dimen.padding_std),
            top = dimensionResource(id = R.dimen.padding_std))
    ) {
        itemsIndexed(
            listOf(
                R.string.genres_MOBA,
                R.string.genres_MULTIPLAYER,
                R.string.genres_STRATEGY
            )
        ) { _, item ->
            MyGenres(genre = item)
        }
    }
}

@Composable
fun MyGenres(genre: Int) {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.padding(
            end = dimensionResource(id = R.dimen.padding_small))) {
        Card(
            shape = RoundedCornerShape(
                dimensionResource(id = R.dimen.rounded_big)),
            modifier = Modifier
                .alpha(0.24f)
        ) {
            Box(
                modifier = Modifier
                    .background(Blue)
                    .padding(start = dimensionResource(id = R.dimen.padding_small),
                        end = dimensionResource(id = R.dimen.padding_small)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(id = genre),
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(top = dimensionResource(id = R.dimen.padding_veryverysmall),
                            bottom = dimensionResource(id = R.dimen.padding_veryverysmall)),
                    color = Blue
                )
            }
        }

        Text(
            text = stringResource(id = genre),
            fontSize = 10.sp,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 4.dp),
            color = Blue
        )
    }
}