package com.tuxsnct.droidkaigi.collect.fourth.slide.utils

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers

@Preview(
    name = "slide",
    group = "light",
    locale = "ja",
    device = "spec:width=1920px,height=1080px",
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true,
    wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE
)
annotation class LightSlidePreview

@Preview(
    name = "slide",
    group = "dark",
    locale = "ja",
    device = "spec:width=1920px,height=1080px",
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true,
    wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE
)
annotation class DarkSlidePreview

@LightSlidePreview
@DarkSlidePreview
annotation class SlidePreviews