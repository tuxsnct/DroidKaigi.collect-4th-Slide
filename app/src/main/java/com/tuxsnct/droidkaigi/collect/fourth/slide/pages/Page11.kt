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
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideMonospacedText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page11(
    pageSize: Int = 11
) {
    SimpleSlideScaffold(
        title = { SlideTitle("モーション予測") },
        slidePageIndicator = { SlidePageIndicator(11, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Image(
                modifier = Modifier.weight(1f).clip(RoundedCornerShape(16.dp)),
                bitmap = ImageBitmap.imageResource(R.drawable.stylus_reduced_latency),
                contentDescription = "Motion Prediction"
            )
            SlideMonospacedText("androidx.input:input-motionprediction")
            SlideText("カルマンフィルタを用いたモーション予測による描画の高速化")
            SlideText("(予測した線の削除が上手くできずに現状不採用, 恩恵小さい?)")
        }
    }
}
