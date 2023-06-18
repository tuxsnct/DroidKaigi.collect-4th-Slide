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
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideBulletedList
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page14(
    pageSize: Int = 14
) {
    SimpleSlideScaffold(
        title = { SlideTitle("Compose for Slide (おまけ)") },
        slidePageIndicator = { SlidePageIndicator(14, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically)
        ) {
            Image(
                modifier = Modifier.weight(1f).clip(RoundedCornerShape(16.dp)),
                bitmap = ImageBitmap.imageResource(R.drawable.compose_for_slide),
                contentDescription = "Compose for Slide"
            )
            SlideBulletedList(
                texts = listOf(
                    "スライド1ページに平均1時間程かかりました",
                    "複雑なことはできない・大変でした",
                    "デスクトップアプリにすればよかった",
                    "終了後にGitHubに公開します"
                )
            )
        }
    }
}