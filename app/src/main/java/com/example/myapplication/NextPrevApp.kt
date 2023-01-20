package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun NextPrev() {
    var results by remember { mutableStateOf(0) }
    val list = intArrayOf(
        R.drawable.f,
        R.drawable.e,
        R.drawable.c,
        R.drawable.b,
        R.drawable.d,
        R.drawable.a,
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(list[results]),
                contentDescription = results.toString(),
                contentScale = ContentScale.Fit
            )
        }
        Spacer(modifier = Modifier.height(100.dp))
        Row(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(onClick = {
                if (results > 0) {
                    results--
                }
            }) {
                Text(
                    text = "Prev",
                    fontSize = 24.sp
                )
            }
            Button(onClick = {
                if (results + 1 < list.size) {
                    results++
                }
            }) {
                Text(
                    text = "Next",
                    fontSize = 24.sp
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun NextPrevPreview() {
//    MyApplicationTheme {
//        NextPrev()
//    }
//}