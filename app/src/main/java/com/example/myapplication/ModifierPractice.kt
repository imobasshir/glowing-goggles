package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun  PracticeModifier(text: String) {
    Row(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            modifier = Modifier.padding(8.dp)
                .requiredSize(36.dp)
        )
        Text(
            text = text,
            Modifier
                .clickable(onClick = {})
                .background(color = Color.Magenta)
                .padding(16.dp),
            color = Color.White,
        )
    }
}

//@Preview
//@Composable
//fun PreviewModifierEg() {
//    MyApplicationTheme {
//        PracticeModifier(text = "Hello, Android Compose")
//    }
//}