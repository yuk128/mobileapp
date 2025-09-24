package com.example.w03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.w03.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                HomeScreen()
            }
        }
    }
}

@Composable()
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("MGC Coffee",
            style = MaterialTheme.typography.headlineMedium)

        Image(
            painter = painterResource(id = R.drawable.compose),
            contentDescription = "Jetpack Compose 로고",
            modifier = Modifier
                .size(300.dp) // 이미지 크기 지정
                .padding(16.dp)
        )

        Text("위치: 우송대 정문 앞",
            style = MaterialTheme.typography.headlineMedium)

        Row{
            Button(onClick = {/*dd*/}){
                Text(text = "커피주문하기")
            }

            Button(onClick = {/*dd*/}){
                Text(text = "홍차주문하기")
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
