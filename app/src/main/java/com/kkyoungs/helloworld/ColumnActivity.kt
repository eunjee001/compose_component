package com.kkyoungs.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kkyoungs.helloworld.ui.theme.HelloWorldTheme

class ColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                Greeting5()
            }
        }
    }
}

@Composable
fun Greeting5(){

    // step 1. horizontalAlignment를 Column에 적용
//    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.size(100.dp)) {
//        Text(text = "first")
//        Text(text = "second")
//        Text(text = "third")
//    }
    // step 2. Column에 verticalArrangement 지정
    // SpaceAround, SpaceEvenly, SpaceBetween도 지정
//    Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center, modifier = Modifier.size(100.dp)) {
//        Text(text = "first")
//        Text(text = "second")
//        Text(text = "third")
//    }
    // step 3. Text에 Modifier.align을 사용
    Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center, modifier = Modifier.size(100.dp)) {
        Text(text = "first", modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "second")
        Text(text = "third", modifier = Modifier.align(Alignment.Start))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    HelloWorldTheme {
        Greeting5()
    }
}