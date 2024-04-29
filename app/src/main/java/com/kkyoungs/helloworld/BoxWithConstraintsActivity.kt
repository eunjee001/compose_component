package com.kkyoungs.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kkyoungs.helloworld.ui.theme.HelloWorldTheme

class BoxWithConstraintsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                    Greeting6()
            }
        }
    }
}

@Composable
fun Greeting6() {
    // step 4 : Column에 width를 지정해서 제한
    Column (modifier = Modifier.width(150.dp)){
        // step 2: Inner의 인자로 Modifier.widthIn(min = 100.dp)를 전달.
        // heightIn도 전달. 각각인자의 max값도 전달
        Inner(modifier= Modifier
            .width(200.dp)
            .height(160.dp))
    }
}
// step 1 : Inner 인자로 modifier를 전달. 기본값을 Modifier로 지정.
// 파라미터로 받은 modifier를 BoxWithConstraint에 전달
// BoxWithConstraint에는 maxWidth, maxHeight, minWidth, minHeight 있음
@Composable
private fun Inner(modifier: Modifier = Modifier){
    BoxWithConstraints(modifier) {
        //step 3. maxHeight 값이 150dp가 넘을 때만, 추가로 텍스트 출력
        if (maxHeight > 150.dp){
            Text(text = "longlonglong", modifier = Modifier.align(Alignment.BottomCenter))
        }
        Text(text = "maxW : $maxWidth maxH : $maxHeight minW : $minWidth minH : $minHeight")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    HelloWorldTheme {
        Greeting6()
    }
}