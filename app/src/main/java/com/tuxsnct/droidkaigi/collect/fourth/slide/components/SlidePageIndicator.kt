package com.tuxsnct.droidkaigi.collect.fourth.slide.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SlidePageIndicator(
    pageIndex: Int,
    pageSize: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = contentColorFor(MaterialTheme.colorScheme.tertiary)
            )
        ) {
            SlideSmallText("$pageIndex / $pageSize")
        }
    }
}