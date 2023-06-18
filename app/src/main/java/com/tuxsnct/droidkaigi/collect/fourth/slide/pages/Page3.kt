package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SimpleSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideNumberedList
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page3(
    pageSize: Int = 3
) {
    SimpleSlideScaffold(
        title = { SlideTitle("本日話すこと") },
        slidePageIndicator = { SlidePageIndicator(3, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            SlideNumberedList(
                texts = listOf(
                    "Androidの大画面対応",
                    "ノートアプリを作ろう",
                    "Compose for Slide (おまけ)"
                )
            )
        }
    }
}
