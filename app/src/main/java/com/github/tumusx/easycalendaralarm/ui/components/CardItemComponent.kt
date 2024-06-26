package com.github.tumusx.easycalendaralarm.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardAlarmComponent(
    modifier: Modifier = Modifier,
    colorBackground: Color,
    onClickAction: () -> Unit
) {
    Card(
        onClick = { onClickAction() },
        modifier = modifier
            .padding(top = 5.dp),
        colors = CardDefaults.cardColors(containerColor = colorBackground)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Date Cadance",
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 8.dp, end = 40.dp),
                    fontSize = 30.sp,
                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily.Serif,
                )
                TextCircleComponent(text = "+12", colorBackground = Color.White)
            }
            Text(
                text = "11:30 am - 12:30 pm",
                modifier = Modifier.padding(end = 8.dp),
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.Serif,
                color = Color.White
            )

        }
    }
}