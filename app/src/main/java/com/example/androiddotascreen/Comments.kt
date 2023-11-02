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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddotascreen.ui.theme.DarkGrey3
import com.example.androiddotascreen.ui.theme.Grey
import com.example.androiddotascreen.ui.theme.White

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
                .padding(bottom = dimensionResource(id = R.dimen.padding_std))
        ) {

            MyComment(ItemDataComment(R.drawable.comment1,
                stringResource(id = R.string.userName1),
                stringResource(id = R.string.date),
                stringResource(id = R.string.text_comment)))

            Divider(
                color = DarkGrey3,
                thickness = 1.dp,
                modifier = Modifier
                    .padding(start = dimensionResource(id = R.dimen.padding_big),
                        end = dimensionResource(id = R.dimen.padding_big))
            )

            MyComment(ItemDataComment(R.drawable.comment2,
                stringResource(id = R.string.userName2),
                stringResource(id = R.string.date),
                stringResource(id = R.string.text_comment)))
        }
}

@Composable
fun MyComment(item: ItemDataComment) {
    Column(
        modifier = Modifier.padding(all = dimensionResource(
            id = R.dimen.padding_std)
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
                    .size(dimensionResource(id = R.dimen.padding_big))
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(dimensionResource(
                id = R.dimen.padding_small)))

            Column {
                Text(text = item.userName,
                    style = MaterialTheme.typography.subtitle2,
                    color = White,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(dimensionResource(
                    id = R.dimen.padding_verysmall)))

                Text(text = item.date,
                    style = MaterialTheme.typography.body2,
                    color = White,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .alpha(0.4f))
            }
        }

        Spacer(modifier = Modifier.height(dimensionResource(
            id = R.dimen.padding_small)))

        Text(text = item.text,
            color = Grey,
            fontSize = 12.sp)

    }
}

