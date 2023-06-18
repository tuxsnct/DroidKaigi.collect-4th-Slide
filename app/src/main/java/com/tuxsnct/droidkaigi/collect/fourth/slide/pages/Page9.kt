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
fun Page9() {
    SimpleSlideScaffold(
        title = { SlideSmallText("graphics-core v1.0.0-alpha03以前 → OpenGL ESしんどい") },
        contentAlignment = Alignment.Center
    ) {
        SlideMonospacedText(
            "class FastRenderer() : GLFrontBufferedRenderer.Callback<Segment> {\n" +
            "  private var frontBufferRenderer: GLFrontBufferedRenderer<Segment>? = null\n" +
            "  private var lineRenderer: LineRenderer = LineRenderer() // GLES20のProgramやShaderなどを扱う自作クラス\n" +
            "\n" +
            "  fun attachSurfaceView(surfaceView: SurfaceView) { frontBufferRenderer = GLFrontBufferedRenderer(surfaceView, this) }\n" +
            " \n" +
            "  override fun onDrawFrontBufferedLayer(eglManager: EGLManager, bufferInfo: BufferInfo, transform: FloatArray, param: Segment) { lineRenderer.drawLine(projection, listOf(param), Color.GRAY.toColor()) }\n" +
            "\n" +
            "  override fun onDrawDoubleBufferedLayer(eglManager: EGLManager, bufferInfo: BufferInfo, transform: FloatArray, params: Collection<Segment>) { for (line in viewModel.openGlLines) { lineRenderer.drawLine(projection, line, Color.GRAY.toColor()) } }\n" +
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
