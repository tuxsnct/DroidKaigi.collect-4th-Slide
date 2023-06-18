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
fun Page13(
    pageSize: Int = 13
) {
    SimpleSlideScaffold(
        title = { SlideTitle("まとめ") },
        slidePageIndicator = { SlidePageIndicator(13, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically)
        ) {
            SlideText("手書き入力を扱っている方\n→貴重な知見になったら嬉しい")
            SlideText("手書き入力を扱っていない方\n→興味を持っていただけたら嬉しい")
        }
    }
}
