package com.example.androiddotascreen

import android.view.MotionEvent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddotascreen.ui.theme.Yellow
import kotlinx.coroutines.delay

@OptIn(ExperimentalComposeUiApi::class)
@Preview
@Composable
fun ButtonInstall(
    modifier: Modifier = Modifier
) {
    var isButtonPressed by remember { mutableStateOf(false) }

    Button(
        onClick = { isButtonPressed = true },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Yellow),
        modifier = Modifier
            .padding(start = 24.dp, end = 24.dp, bottom = 24.dp)
            .scale(if (isButtonPressed) 0.9f else 1f)
            .pointerInteropFilter {
                isButtonPressed = it.action == MotionEvent.ACTION_DOWN
                true
            }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(id = R.string.install),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)

            )
        }
    }

    LaunchedEffect(isButtonPressed) {
        if (isButtonPressed) {
            delay(1000)
            isButtonPressed = false
        }
    }
}