package com.github.tumusx.easycalendaralarm.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextCircleComponent(colorBackground: Color = Color.Black, text: String) {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .drawBehind {
                drawCircle(color = colorBackground, radius = 60f)
            }, contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp,
            color = Color.Gray
        )
    }
}
