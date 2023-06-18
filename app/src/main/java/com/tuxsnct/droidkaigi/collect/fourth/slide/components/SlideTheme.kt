package com.tuxsnct.droidkaigi.collect.fourth.slide.components

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.core.view.WindowCompat
import com.tuxsnct.droidkaigi.collect.fourth.slide.R

@Composable
fun SlideTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when (darkTheme) {
        true -> dynamicDarkColorScheme(LocalContext.current)
        false -> dynamicLightColorScheme(LocalContext.current)
    }
    val view = LocalView.current

    if (!view.isInEditMode) {
        val currentWindow = (view.context as? Activity)?.window
            ?: throw Exception("Not in an activity - unable to get Window reference")

        SideEffect {
            currentWindow.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(currentWindow, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    val interFontFamily = FontFamily(Font(R.font.inter))
    val typography = Typography(
        displayLarge = MaterialTheme.typography.displayLarge.copy(fontFamily = interFontFamily),
        displayMedium = MaterialTheme.typography.displayMedium.copy(fontFamily = interFontFamily),
        displaySmall = MaterialTheme.typography.displaySmall.copy(fontFamily = interFontFamily),

        headlineLarge = MaterialTheme.typography.headlineLarge.copy(fontFamily = interFontFamily),
        headlineMedium = MaterialTheme.typography.headlineMedium.copy(fontFamily = interFontFamily),
        headlineSmall = MaterialTheme.typography.headlineSmall.copy(fontFamily = interFontFamily),

        titleLarge = MaterialTheme.typography.titleLarge.copy(fontFamily = interFontFamily),
        titleMedium = MaterialTheme.typography.titleMedium.copy(fontFamily = interFontFamily),
        titleSmall = MaterialTheme.typography.titleSmall.copy(fontFamily = interFontFamily),

        bodyLarge = MaterialTheme.typography.bodyLarge.copy(fontFamily = interFontFamily),
        bodyMedium = MaterialTheme.typography.bodyMedium.copy(fontFamily = interFontFamily),
        bodySmall = MaterialTheme.typography.bodySmall.copy(fontFamily = interFontFamily),

        labelLarge = MaterialTheme.typography.labelLarge.copy(fontFamily = interFontFamily),
        labelMedium = MaterialTheme.typography.labelMedium.copy(fontFamily = interFontFamily),
        labelSmall = MaterialTheme.typography.labelSmall.copy(fontFamily = interFontFamily)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )
}