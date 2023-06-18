package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SimpleSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page6(
    pageSize: Int = 6
) {
    SimpleSlideScaffold(
        slidePageIndicator = { SlidePageIndicator(6, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            SlideTitle("そうだ、ノートアプリ作ろう")
            SlideText("※ かなりニッチな内容が多めです")
            SlideText("ターゲット: ノート・ペイント・電子署名アプリの開発者くらい?")
        }
    }
}
