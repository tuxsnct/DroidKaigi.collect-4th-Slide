package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.R
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SimpleSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideBulletedList
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page2(
    pageSize: Int = 2
) {
    SimpleSlideScaffold(
        title = { SlideTitle("誰?") },
        slidePageIndicator = { SlidePageIndicator(2, pageSize) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 48.dp)
                    .clip(CircleShape),
                bitmap = ImageBitmap.imageResource(R.drawable.tuxsnct),
                contentDescription = "tuxsnct"
            )
            SlideBulletedList(
                texts = listOf(
                    "Hideki Tanaka",
                    "@tuxsnct (Twitter, GitHub)",
                    "鈴鹿高専 電子情報工学科 4年 (25卒)",
                    "Material 3が大好き",
                    "DroidKaigiのイベント初参加"
                )
            )
        }
    }
}
