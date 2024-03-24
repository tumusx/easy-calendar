package com.github.tumusx.easycalendaralarm.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DateMeetsComponent(
    textDayWeek: String,
    quantityMeets: String,
    messageMeets: String,
) {
    Column (modifier = Modifier.padding(start = 15.dp, top = 10.dp)){
        Text(
            text = textDayWeek,
            color = Color.White,
            modifier = Modifier.padding(bottom = 8.dp, end = 40.dp),
            fontSize = 20.sp,
            textAlign = TextAlign.Left,
            fontFamily = FontFamily.Serif,
        )
        Text(
            text = quantityMeets,
            color = Color.Green,
            modifier = Modifier.padding(bottom = 8.dp, end = 40.dp),
            fontSize = 40.sp,
            textAlign = TextAlign.Left,
            fontFamily = FontFamily.SansSerif,
        )
        Text(
            text = messageMeets,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 8.dp, end = 40.dp),
            fontSize = 20.sp,
            textAlign = TextAlign.Left,
            fontFamily = FontFamily.SansSerif,
        )
    }
}