package com.example.androiddotascreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.androiddotascreen.ui.theme.LightGray

@Composable
fun DotaScreen() {

    //val context = LocalContext.current
    val lazyListState = rememberLazyListState()


    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            DotaScreenHeader()
        }
        item {
            Genres()
        }
        item {
            Text(
                text = stringResource(id = R.string.text_screen),
                color = LightGray,
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_regular_font)),
                modifier = Modifier
                    .padding(
                        all = dimensionResource(id = R.dimen.padding_std)
                    )
                    .alpha(0.7f)
            )
        }
        item {
            FeedPhoto()
        }
        item {
            ReviewAndRatings()
        }
        item {
            Comments()
        }
        item {
            ButtonInstall()
        }
    }
}