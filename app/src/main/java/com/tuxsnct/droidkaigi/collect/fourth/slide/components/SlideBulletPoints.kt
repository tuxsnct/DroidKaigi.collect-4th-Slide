package com.tuxsnct.droidkaigi.collect.fourth.slide.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun SlideBulletedList(
    modifier: Modifier = Modifier,
    texts: List<String>
) {
    SlideText(
        buildAnnotatedString {
            texts.map { text ->
                withStyle(style = ParagraphStyle(textIndent = TextIndent(restLine = 12.sp))) {
                    append("\u2022")
                    append("\t\t")
                    append(text)
                }
            }
        },
        modifier = modifier
    )
}

@Composable
fun SlideNumberedList(
    modifier: Modifier = Modifier,
    texts: List<String>
) {
    SlideText(
        buildAnnotatedString {
            texts.mapIndexed { index, text ->
                withStyle(style = ParagraphStyle(textIndent = TextIndent(restLine = 12.sp))) {
                    append("${index +1}.")
                    append("\t\t")
                    append(text)
                }
            }
        },
        modifier = modifier
    )
}