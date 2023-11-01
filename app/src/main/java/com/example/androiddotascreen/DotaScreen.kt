package com.example.androiddotascreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

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
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game " +
                        "which has two teams of five players compete to collectively " +
                        "destroy a large structure defended by the opposing team known " +
                        "as the \"Ancient\", whilst defending their own.",
                color = Color("#EEF2FB".toColorInt()),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(
                        all = 24.dp
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
            Card(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp, end = 24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color("#F4D144".toColorInt())),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Install",
                        fontSize = 24.sp,
                        modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp)

                    )
                }
            }
        }
    }
}