package com.github.tumusx.easycalendaralarm

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.tumusx.easycalendaralarm.ui.components.DateMeetsComponent
import com.github.tumusx.easycalendaralarm.ui.components.ListComponent
import com.github.tumusx.easycalendaralarm.ui.theme.EasyCalendarAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyCalendarAlarmTheme {
                ContainerAll()
            }
        }
    }
}

@Composable
fun ContainerAll() {
    Row(modifier = Modifier.fillMaxSize()) {
        Surface(
            color = Color.Black,
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Column(Modifier.padding(start = 8.dp)) {
                Row(verticalAlignment = Alignment.Top) {
                    Image(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .clickable {
                            },
                        painter = painterResource(id = R.drawable.settings_songs),
                        contentDescription = "song configuration",
                    )
                    DateMeetsComponent(
                        textDayWeek = "Saturday, 23 March",
                        quantityMeets = "8 MEETINGS",
                        messageMeets = "Your first meeting starts at 11:30 AM and last meetings at 4:00 PM"
                    )
                }
                ListComponent()
            }
        }
    }
}


@SuppressLint("CoroutineCreationDuringComposition")
@Preview(showBackground = true)
@Composable
fun EasyAlarmFirstScreenListPreview() {
    EasyCalendarAlarmTheme {
        ContainerAll()
    }
}