package com.tuxsnct.droidkaigi.collect.fourth.slide.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SlideSurface(
    modifier: Modifier = Modifier,
    elevation: Dp = 6.dp,
    contentPadding: PaddingValues = PaddingValues(12.dp),
    contentAlignment: Alignment = Alignment.TopStart,
    content: @Composable BoxScope.() -> Unit
) {
    Surface(
        modifier = modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(16.dp)),
        tonalElevation = elevation,
        color = MaterialTheme.colorScheme.surface,
        contentColor = contentColorFor(MaterialTheme.colorScheme.surface)
    ) {
        Box(
            modifier = Modifier
                .padding(contentPadding),
            contentAlignment = contentAlignment
        ) {
            content()
        }
    }
}