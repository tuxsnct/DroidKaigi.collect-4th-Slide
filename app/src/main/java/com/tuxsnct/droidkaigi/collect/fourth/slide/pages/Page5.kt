package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.R
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SimpleSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideNumberedList
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page5(
    pageSize: Int = 5
) {
    SimpleSlideScaffold(
        slidePageIndicator = { SlidePageIndicator(5, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Image(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(16.dp)),
                bitmap = ImageBitmap.imageResource(R.drawable.chrome),
                contentDescription = "Chrome"
            )
            SlideNumberedList(
                texts = listOf(
                    "適切なレイアウトにしているか (必要性の問題)",
                    "大画面を生かした機能があるか (付加価値) ←本日のメイン",
                )
            )
        }
    }
}
