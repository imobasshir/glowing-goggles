package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun Card() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Column(
            Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(all = 48.dp)
        ) {
            Row {
                val androidImg = painterResource(R.drawable.android_logo)
                Image(
                    painter = androidImg,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(all = 16.dp)
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .size(50.dp)
                )
            }
            Row {
                Text(
                    text = "Mobasshir Imam",
                    fontSize = 24.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .padding(start = 16.dp, end = 16.dp),
                    color = Color.White
                )
            }
            Row {
                Text(
                    text = "Android Developer",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .padding(start = 16.dp, end = 16.dp),
                    color = Color(0xFF3ddc84)
                )
            }
        }

        Spacer(modifier = Modifier.height(100.dp))

        Column(
            modifier = Modifier
                .wrapContentHeight(Alignment.Top)
        ) {
            Divider()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            ) {
                Icon(
                    Icons.Rounded.Call,
                    contentDescription = "Phone_No",
                    modifier = Modifier
                        .padding(all = 4.dp)
                        .size(24.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    tint = Color(0xFF3ddc84)
                )
                Text(
                    text = "+91 8802522030",
                    modifier = Modifier.padding(all = 4.dp),
                    color = Color.White
                )
            }
            Divider()
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            ) {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = "Social",
                    modifier = Modifier
                        .padding(all = 4.dp)
                        .size(24.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    tint = Color(0xFF3ddc84)
                )
                Text(
                    text = "@mobasshirstwt",
                    modifier = Modifier.padding(all = 4.dp),
                    color = Color.White
                )
            }
            Divider()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            ) {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = "Email_Id",
                    modifier = Modifier
                        .padding(all = 4.dp)
                        .size(24.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    tint = Color(0xFF3ddc84)
                )
                Text(
                    text = "imobasshirimam@gmail.com",
                    modifier = Modifier.padding(all = 4.dp),
                    color = Color.White
                )
            }
            Divider()
        }
    }
}

//@Preview(showBackground = false)
//@Composable
//fun CardPreview() {
//    MyApplicationTheme {
//        Card()
//    }
//}