package com.example.androiddotascreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
                    MainScreen()
        }
    }
}

@Preview
@Composable
fun MainScreen() {
    Image(painter = painterResource(id = R.drawable.background),
        contentDescription = "backgrouond",
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
    Column(
        //color = AppTheme.BgColors.primary,
        modifier = Modifier.fillMaxSize()
    ) {
        DotaScreen()
    }
}