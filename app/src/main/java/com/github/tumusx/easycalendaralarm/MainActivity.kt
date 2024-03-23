package com.github.tumusx.easycalendaralarm

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.github.tumusx.easycalendaralarm.ui.components.ListComponent
import com.github.tumusx.easycalendaralarm.ui.theme.EasyCalendarAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyCalendarAlarmTheme {
                Box(contentAlignment = Alignment.Center) {
                    Surface(
                        color = MaterialTheme.colorScheme.background
                    ) {
                        ListComponent()
                    }
                }
            }
        }
    }
}


@SuppressLint("CoroutineCreationDuringComposition")
@Preview(showBackground = true)
@Composable
fun EasyAlarmFirstScreenListPreview() {
    EasyCalendarAlarmTheme {
        ListComponent()
    }
}