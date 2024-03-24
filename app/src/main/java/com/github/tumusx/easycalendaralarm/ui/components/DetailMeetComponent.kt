package com.github.tumusx.easycalendaralarm.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun DetailMeetComponent(detail: String, description: String, guests: List<String>) {
    Column {
        Text(text = detail)
        Text(text = description)
        guests.forEach { guest ->
            Text(text = guest)
        }
    }
}