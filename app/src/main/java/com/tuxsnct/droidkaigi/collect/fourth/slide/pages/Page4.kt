package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SimpleSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideBulletedList
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page4(
    pageSize: Int = 4
) {
    SimpleSlideScaffold(
        title = { SlideTitle("Androidの大画面対応の流れ") },
        slidePageIndicator = { SlidePageIndicator(4, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            SlideBulletedList(
                texts = listOf(
                    "Chrome OSでのAndroidアプリ実行に対応",
                    "国内外でAndroidフォルダブル・タブレットが発売",
                    "50以上のGoogle製アプリがフォルダブル・タブレットに対応"
                )
            )
            SlideText("→ 開発者はどうするべきか?")
        }
    }
}
