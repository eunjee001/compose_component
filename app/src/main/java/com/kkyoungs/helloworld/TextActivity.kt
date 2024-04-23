package com.kkyoungs.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkyoungs.helloworld.ui.theme.HelloWorldTheme

class TextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                    Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
//      step 1. Red 지정
//    Text(color = Color.Red, text = "AHello $name!")
//      step 2. 해쉬값으로 색상 전달
//    Text(color = Color(0xffff9944), text = "AHello $name!")
    // step 3. fontSize파라미터에 30.sp 전달
//    Text(color = Color.Red, text = "Hello $name", fontSize = 30.sp)
// step 4. fontWeight에 Bold
//    Text(color = Color.Red, text = "Hello $name", fontSize = 30.sp, fontWeight = FontWeight.Bold)
    // step 5. fontFamily에 Cursive 전달
//    Text(color = Color.Red, text = "Hello $name", fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)
    // step 6. letterSpacing에 2.sp 전달/
//    Text(color = Color.Red, text = "Hello $name", fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace, letterSpacing = 2.sp)
    // step 7. maxLines 2지정
//    Text(color = Color.Red, text = "Hello $name\nHello $name\nHello $name\n", fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, letterSpacing = 2.sp, maxLines = 2)
    // step 8. TextDecoration에 Underline 추가
//    Text(color = Color.Red, text = "Hello $name\nHello $name\nHello $name\n", fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, letterSpacing = 2.sp, maxLines = 2, textDecoration = TextDecoration.Underline)

    // step 9. textAlign을 TextAlign.Center로 지정
    // 충분히 넓히기
    Text(modifier = Modifier.size( 300.dp), color = Color.Red, text = "Hello $name\nHello $name\nHello $name\n", fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, letterSpacing = 2.sp, maxLines = 2, textDecoration = TextDecoration.Underline, textAlign = TextAlign.Center)



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting("Android")
    }
}