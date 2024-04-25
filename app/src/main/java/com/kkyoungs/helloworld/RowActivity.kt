package com.kkyoungs.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kkyoungs.helloworld.ui.theme.HelloWorldTheme

class RowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                    Greeting4()
                }
        }
    }
}

@Composable
fun Greeting4() {

    // step 1. 각 Text의 modifier에 Align을 설정
    // Alignment.Top, CenterVertically, Bottom을 지정
//    Row (modifier = Modifier.height(40.dp)){
//        Text(text = "first", modifier = Modifier.align(Alignment.Top))
//        Text(text = "second", modifier = Modifier.align(Alignment.CenterVertically))
//        Text(text = "third", modifier = Modifier.align(Alignment.Bottom))
//    }
    // step 2. Row에 verticalAlignment를 설정
    // Text에 align을 사용 할 때와 쓰이는 값이 같다.
//    Row (verticalAlignment = Alignment.Bottom, modifier = Modifier.height(40.dp)){
//        Text(text = "first", modifier = Modifier.align(Alignment.Top))
//        Text(text = "second")
//        Text(text = "third")
//    }
    // step 3. Row의 height를 200dp 정도로 설정
    // Row에 horizontalArrangement에 Arrangement.Center를 설정.
    // Start, End, SpaceAround, SpaceBetween, SpaceEvenly 설정

    // step 4. horizontalArrangement를 제거하고, 각 Text에 Modifier.weight를 설정. 각항목의 weight 값을 바꾸어 보기
    Row (horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.Bottom, modifier = Modifier
        .height(40.dp)
        .width(300.dp)){
        Text(text = "first", modifier = Modifier
            .align(Alignment.Top)
            .weight(3f))
        Text(text = "second", modifier = Modifier.weight(3f))
        Text(text = "third", modifier = Modifier.weight(3f))
    }

    // step 5. Text 대신 Icon 하나 넣기
    Row (horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.Bottom, modifier = Modifier
        .height(40.dp)
        .width(300.dp)){
        Text(text = "first", modifier = Modifier
            .align(Alignment.Top)
            .weight(3f))
        Text(text = "second", modifier = Modifier.weight(3f))
        Text(text = "third", modifier = Modifier.weight(3f))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    HelloWorldTheme {
        Greeting4()
    }
}