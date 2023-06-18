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
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideMonospacedText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlidePageIndicator
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideTitle
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page7(
    pageSize: Int = 7
) {
    SimpleSlideScaffold(
        title = { SlideTitle("スタイラスのモーションイベント") },
        slidePageIndicator = { SlidePageIndicator(7, pageSize) },
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
                        bitmap = ImageBitmap.imageResource(R.drawable.stylus_pressure),
                        contentDescription = "Stylus Pressure"
                    )
                    SlideText("圧力")
                    SlideMonospacedText("AXIS_PRESSURE")
                }
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier.clip(RoundedCornerShape(16.dp)),
                        bitmap = ImageBitmap.imageResource(R.drawable.stylus_orientation),
                        contentDescription = "Stylus Orientation"
                    )
                    SlideText("傾斜")
                    SlideMonospacedText("AXIS_ORIENTATION")
                }
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier.clip(RoundedCornerShape(16.dp)),
                        bitmap = ImageBitmap.imageResource(R.drawable.stylus_tilt),
                        contentDescription = "Stylus Tilt"
                    )
                    SlideText("方向")
                    SlideMonospacedText("AXIS_TILT")
                }
            }
            SlideText(
                "筆圧や傾きによる線の太さの変化などが可能"
            )
        }
    }
}
