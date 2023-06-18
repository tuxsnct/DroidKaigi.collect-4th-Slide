package com.tuxsnct.droidkaigi.collect.fourth.slide.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SlideScaffold(
    modifier: Modifier = Modifier,
    title: (@Composable RowScope.() -> Unit)? = null,
    slidePageIndicator: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit
) {
    SlideTheme {
        Scaffold(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(12.dp),
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = contentColorFor(MaterialTheme.colorScheme.background)
        ) {
            CompositionLocalProvider(
                LocalMinimumInteractiveComponentEnforcement provides false
            ) {
                Column(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    if (title != null) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            title()
                            slidePageIndicator?.invoke()
                        }
                    }
                    content()
                }
            }
        }
    }
}

@Composable
fun SimpleSlideScaffold(
    modifier: Modifier = Modifier,
    title: (@Composable RowScope.() -> Unit)? = null,
    slidePageIndicator: (@Composable () -> Unit)? = null,
    contentAlignment: Alignment = Alignment.TopStart,
    contentPadding: PaddingValues = PaddingValues(12.dp),
    content: @Composable () -> Unit
) {
    SlideScaffold(
        modifier = modifier,
        title = title,
        slidePageIndicator = slidePageIndicator
    ) {
        SlideSurface(
            contentPadding = contentPadding,
            contentAlignment = contentAlignment
        ) {
            if (title == null) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.TopEnd
                ) {
                    slidePageIndicator?.invoke()
                }
            }
            content()
        }
    }
}

@Composable
fun OverviewSlideScaffold(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    contentPadding: PaddingValues = PaddingValues(12.dp),
    content: @Composable () -> Unit
) {
    SlideScaffold(modifier = modifier) {
        SlideSurface(
            elevation = 3.dp,
            contentPadding = contentPadding,
            contentAlignment = contentAlignment
        ) {
            content()
        }
    }
}

@Composable
fun BentoSlidePageScaffold(
    modifier: Modifier = Modifier,
    title: (@Composable RowScope.() -> Unit)?,
    slidePageIndicator: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit
) {
    SlideScaffold(
        modifier = modifier,
        title = title,
        slidePageIndicator = slidePageIndicator
    ) {
        content()
    }
}

@SlidePreviews
@Composable
fun SlideScaffoldPreview() {
    SlideScaffold(
        title = { SlideTitle(text = "Title") },
        slidePageIndicator = { SlidePageIndicator(1, 1) }
    ) {
        SlideText("Content")
    }
}

@SlidePreviews
@Composable
fun SimpleSlideScaffoldPreview() {
    SimpleSlideScaffold(
        title = { SlideTitle(text = "Title") },
        slidePageIndicator = { SlidePageIndicator(1, 1) }
    ) {
        SlideText("Content")
    }
}

@SlidePreviews
@Composable
fun BentoSlideScaffoldPreview() {
    BentoSlidePageScaffold(
        title = { SlideTitle(text = "Title") },
        slidePageIndicator = { SlidePageIndicator(1, 1) }
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SlideSurface(modifier = Modifier.fillMaxSize().weight(1f)) {
                SlideText("Content")
            }
            SlideSurface(modifier = Modifier.fillMaxSize().weight(1f)) {
                SlideText("Content")
            }
        }
    }
}