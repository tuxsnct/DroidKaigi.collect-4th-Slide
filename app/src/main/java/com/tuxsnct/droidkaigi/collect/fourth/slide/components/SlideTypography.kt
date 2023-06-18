package com.tuxsnct.droidkaigi.collect.fourth.slide.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SlideTitle(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineLarge,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}
@Composable
fun SlideTitle(text: AnnotatedString, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineLarge,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun SlideSubtitle(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}
@Composable
fun SlideSubtitle(text: AnnotatedString, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun SlideText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge
    )
}
@Composable
fun SlideText(text: AnnotatedString, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun SlideSmallText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge
    )
}
@Composable
fun SlideSmallText(text: AnnotatedString, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge
    )
}

@Composable
fun SlideMonospacedText(text: String, modifier: Modifier = Modifier, textStyle: TextStyle = MaterialTheme.typography.titleMedium) {
    Surface(
        modifier = Modifier.clip(RoundedCornerShape(8.dp)),
        color = MaterialTheme.colorScheme.secondary,
        contentColor = contentColorFor(MaterialTheme.colorScheme.secondary)
    ) {
        Text(
            text = text,
            modifier = modifier.padding(2.dp),
            style = textStyle.copy(fontFamily = FontFamily.Monospace)
        )
    }
}
@Composable
fun SlideMonospacedText(text: AnnotatedString, modifier: Modifier = Modifier, textStyle: TextStyle = MaterialTheme.typography.titleMedium) {
    Surface(
        modifier = Modifier.padding(1.dp).clip(RoundedCornerShape(16.dp)),
        color = MaterialTheme.colorScheme.secondary,
        contentColor = contentColorFor(MaterialTheme.colorScheme.secondary)
    ) {
        Text(
            text = text,
            modifier = modifier.padding(1.dp),
            style = textStyle.copy(fontFamily = FontFamily.Monospace)
        )
    }
}

@Preview
@Composable
fun SlideTitlePreview() {
    SlideTitle("Text")
    SlideTitle(buildAnnotatedString { append("Text") })
}

@Preview
@Composable
fun SlideSubtitlePreview() {
    SlideSubtitle("Text")
    SlideSubtitle(buildAnnotatedString { append("Text") })
}

@Preview
@Composable
fun SlideTextPreview() {
    SlideText("Text")
    SlideText(buildAnnotatedString { append("Text") })
}

@Preview
@Composable
fun SlideSmallTextPreview() {
    SlideSmallText("Text")
    SlideSmallText(buildAnnotatedString { append("Text") })
}

@Preview
@Composable
fun SlideMonospacedTextPreview() {
    SlideMonospacedText("Text")
    SlideMonospacedText(buildAnnotatedString { append("Text") })
}