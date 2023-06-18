package com.tuxsnct.droidkaigi.collect.fourth.slide

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page1
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page10
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page11
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page12
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page13
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page14
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page2
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page3
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page4
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page5
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page6
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page7
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page8
import com.tuxsnct.droidkaigi.collect.fourth.slide.pages.Page9
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.LightSlidePreview

class SlidePagesProvider :  PreviewParameterProvider<@Composable () -> Unit> {
    override val values: Sequence<@Composable () -> Unit>
        get() = sequenceOf(
            { Page1() },
            { Page2(14) },
            { Page3(14) },
            { Page4(14) },
            { Page5(14) },
            { Page6(14) },
            { Page7(14) },
            { Page8(14) },
            { Page9() },
            { Page10() },
            { Page11(14) },
            { Page12(14) },
            { Page13(14) },
            { Page14(14) },
        )
}

@LightSlidePreview
@Composable
fun Slide(
    @PreviewParameter(SlidePagesProvider::class) page: @Composable () -> Unit
) {
    page()
}
