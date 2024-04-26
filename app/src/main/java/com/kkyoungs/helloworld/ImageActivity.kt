package com.kkyoungs.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kkyoungs.helloworld.ui.theme.HelloWorldTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                    Greeting7()
            }
        }
    }
}

@Composable
fun Greeting7() {
   Column{
        // Step 1. Image 만들기.
       // painter 항목에 painterResource(id = R.drawable.baseline_breakfast_dining)
       // contentDescription에 엔텔로프 캐년이라고 넣자.

       Image(
           painter = painterResource(id = R.drawable.baseline_breakfast_dining_24),
           contentDescription = "엔텔로프 캐년"
       )
       //Image

       // step2. 두번째 Image를 만들어 보세.
       // imageVectordp Icons.Filled.Setting 설정
       Image(
           imageVector = Icons.Filled.Settings,
           contentDescription = "setting"
       )

       //Image
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview7() {
    HelloWorldTheme {
        Greeting7()
    }
}