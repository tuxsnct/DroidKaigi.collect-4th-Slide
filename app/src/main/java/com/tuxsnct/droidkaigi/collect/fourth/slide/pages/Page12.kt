package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SimpleSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideBulletedList
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page12(
    pageSize: Int = 12
) {
    SimpleSlideScaffold(
        title = { SlideTitle("他にもまだある") },
        slidePageIndicator = { SlidePageIndicator(12, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically)
        ) {
            SlideBulletedList(
                texts = listOf(
                    "ChromeOS, AndroidにCREATE_NOTEインテントが追加",
                    "MLKitを用いた文字認識 (Gboardの手書きと同じ?)",
                    "MLKitを用いたジェスチャー認識",
                    "スタイラスボタンのサポートが改善 (Android 14から?)"
                )
            )
        }
    }
}
