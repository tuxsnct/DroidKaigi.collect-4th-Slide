package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page8(
    pageSize: Int = 8
) {
    SimpleSlideScaffold(
        title = { SlideTitle("レンダリングの最適化") },
        slidePageIndicator = { SlidePageIndicator(8, pageSize) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        modifier = Modifier.clip(RoundedCornerShape(16.dp)),
                        bitmap = ImageBitmap.imageResource(R.drawable.front_buffer_rendering),
                        contentDescription = "Front Buffer Rendering"
                    )
                    SlideText("Front Buffer Rendering")
                }
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier.clip(RoundedCornerShape(16.dp)),
                        bitmap = ImageBitmap.imageResource(R.drawable.multi_buffer_rendering),
                        contentDescription = "Multi Buffer Rendering"
                    )
                    SlideText("Multi Buffer Rendering")
                }
            }
            SlideText(
                "→ androidx.graphics.lowlatency:graphics-coreで\n" +
                        "\t\t\t描画遅延を改善可能"
            )
        }
    }
}
