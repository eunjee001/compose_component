package com.kkyoungs.helloworld

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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

class ButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                    ButtonGreeting(onButtonClicked={
                        Toast.makeText(this, "Send Clicked", Toast.LENGTH_SHORT).show()
                    })
            }
        }
    }
}

@Composable
fun ButtonGreeting(onButtonClicked: () ->Unit) {
    // step 1. Toast 출력
//    Button(onClick = onButtonClicked) {
//        Text(text = "Send")
//    }
    // step 2. Icon Text앞에 추가
    // imageVector에는 Icons.Filled.Send를 넣고
    // contentDescription에는 null
//    Button(onClick = onButtonClicked) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Text(text = "Send")
//    }

    // step 3. 아이콘과 텍스트 사이에 spacer넣기
    // modifier에 Modifier.size넣고 사이즈를 Button Defaults.IconSpacing지정.

//    Button(onClick = onButtonClicked) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//}

    // step 4. enabled를 false 로

//    Button(
//        onClick = onButtonClicked
//        , enabled = false
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }
    // step 5. border에 BorderStroke 설정
//    Button(
//        onClick = onButtonClicked
//        , enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }
    // step 6. shape를 CircleShape로 지정
//    Button(
//        onClick = onButtonClicked
//        , enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta),
//        shape = RoundedCornerShape(10.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }
    // step 7. contentPadding에 PaddingValues를 설정
    Button(
        onClick = onButtonClicked
        , enabled = true,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(20.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonGreetingPreview() {
    HelloWorldTheme {
        ButtonGreeting(onButtonClicked={})
    }
}