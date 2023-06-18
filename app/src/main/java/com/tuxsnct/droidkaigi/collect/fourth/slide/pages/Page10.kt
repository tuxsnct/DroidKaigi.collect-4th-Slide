package com.tuxsnct.droidkaigi.collect.fourth.slide.pages

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SimpleSlideScaffold
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideMonospacedText
import com.tuxsnct.droidkaigi.collect.fourth.slide.components.SlideSmallText
import com.tuxsnct.droidkaigi.collect.fourth.slide.utils.SlidePreviews

@SlidePreviews
@Composable
fun Page10() {
    SimpleSlideScaffold(
        title = { SlideSmallText("graphics-core v1.0.0-alpha04以降 → Canvasにより簡単に綺麗なレンダリングができる") },
        contentAlignment = Alignment.Center
    ) {
        SlideMonospacedText(
            "class FastRenderer() : CanvasFrontBufferedRenderer.Callback<Segment> {\n" +
            "  private var frontBufferRenderer: CanvasFrontBufferedRenderer<Segment>? = null\n" +
            "\n" +
            "  fun attachSurfaceView(surfaceView: SurfaceView) { frontBufferRenderer = CanvasFrontBufferedRenderer(surfaceView, this) }\n" +
            " \n" +
            "  override fun onDrawFrontBufferedLayer(canvas: Canvas, bufferInfo: BufferInfo, transform: FloatArray, param: Segment) { canvas.drawLine(param.x1, param.y1, param.x2, param.y2, Paint()) }\n" +
            "\n" +
            "  override fun onDrawDoubleBufferedLayer(canvas: Canvas, bufferInfo: BufferInfo, transform: FloatArray, params: Collection<Segment>) { for (line in viewModel.canvasLines) { canvas.drawLine(line.x1, line.y1, line.x2, line.y2, Paint()) } }\n" +
            "\n" +
            "  val onTouchListener = View.OnTouchListener { view, event ->\n" +
            "    when (event?.action) {\n" +
            "      MotionEvent.ACTION_DOWN -> { frontBufferRenderer?.renderFrontBufferedLayer(segment) }\n" +
            "      MotionEvent.ACTION_MOVE -> { frontBufferRenderer?.renderFrontBufferedLayer(segment) }\n" +
            "      MotionEvent.ACTION_UP -> { frontBufferRenderer?.commit() }\n" +
            "    }\n" +
            "    true\n" +
            "  }\n" +
            "}",
            textStyle = MaterialTheme.typography.bodySmall.copy(fontSize = 8.sp)
        )
    }
}
