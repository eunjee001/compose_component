package com.kkyoungs.helloworld

import android.os.Bundle
import androidx.compose.material3.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kkyoungs.helloworld.ui.theme.HelloWorldTheme

class SurfaceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme

                    Greeting2("Android")
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    // step 1. Surface에 Elevation 설정
//    Surface(
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 5.dp
//
//    ){
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }
    // step 2. border의 값 설정
//    Surface(
//        border = BorderStroke(width = 2.dp, color = Color.Magenta),
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 5.dp
//
//    ){
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // step 3. Surface의 shape도 설정
//    Surface(
//        border = BorderStroke(width = 2.dp, color = Color.Magenta),
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 10.dp,
//        shape = CircleShape
//
//    ){
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }
    // step 4. color 지정
    // MaterialTheme.colors 에서 primary, error, background, surface, secondary 등 지정
    // contentColor 자동 선택
    Surface(
        border = BorderStroke(width = 2.dp, color = Color.Magenta),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp,
        shape = CircleShape,
        color = MaterialTheme.colorScheme.primary 

    ){
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    HelloWorldTheme {
        Greeting2("Android")
    }
}