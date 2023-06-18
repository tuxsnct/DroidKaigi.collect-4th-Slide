package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.R
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.OverviewSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page1() {
    OverviewSlideScaffold(
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(16.dp)),
                color = MaterialTheme.colorScheme.tertiaryContainer,
                contentColor = contentColorFor(MaterialTheme.colorScheme.tertiaryContainer),
            ) {
                Image(
                    modifier = Modifier.clip(RoundedCornerShape(16.dp)),
                    bitmap = ImageBitmap.imageResource(R.drawable.large_screen_gallery),
                    contentDescription = "Devices",
                )
            }
            SlideTitle("再興する大画面Androidの人気に便乗してみる")
            SlideText("DroidKaigi.collect { #4@Osaka }")
        }
    }
}
