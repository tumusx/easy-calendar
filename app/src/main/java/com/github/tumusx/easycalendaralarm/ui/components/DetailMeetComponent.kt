package com.github.tumusx.easycalendaralarm.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.tumusx.easycalendaralarm.ui.theme.EasyCalendarAlarmTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailMeetComponent(
    detail: String,
    description: String,
    guests: List<String>,
    closeAction: () -> Unit
) {
    val sheetState = rememberModalBottomSheetState()
    ModalBottomSheet(containerColor = Color.DarkGray, onDismissRequest = {
        closeAction()
    }, sheetState = sheetState) {
        Column(modifier = Modifier.padding(start = 20.dp)) {
            Text(text = detail, color = Color.White)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = description, color = Color.White)
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Red
                    ),
                    onClick = {
                        Log.d("Button", "Cancel schedule")
                    },
                    modifier = Modifier
                        .padding(start = 20.dp)
                ) {
                    Text(
                        text = "Cancel schedule",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
            LazyVerticalGridComponent(guests)
        }
    }
}

@Composable
fun LazyVerticalGridComponent(people: List<String>) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(128.dp), contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ), content = {
            items(people.size) { index ->
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = people[index],
                    color = Color.White
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewDetailMeetComponent() {
    EasyCalendarAlarmTheme {
        DetailMeetComponent(
            detail = "Flavio Meets",
            description = "Flavio Meets - How to learning english in two weeks?",
            guests = listOf(
                "Murillo",
                "Raimundo",
                "Cesar",
                "Augusto",
                "Flavio",
                "Pereira",
                "Augusto"
            )
        ) {
            Log.d("Preview Detail Meet Component", "Close")
        }
    }
}