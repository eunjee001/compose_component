package com.kkyoungs.helloworld

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
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

class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                 ModifierGreeting()
            }
        }
    }
}

@Composable
fun ModifierGreeting() {

    // step 1. Modifier에 Modifier.fillMaxSize() 사용
//    Button(
//        onClick = {},
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 2. fillMaxSize대신 Modifier.height설정
//    Button(
//        onClick = {},
//        modifier = Modifier.height(100.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 3. modifier에 height와 width를 같이 설정
//    Button(
//        onClick = {},
//        modifier = Modifier.height(100.dp).width(200.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 4. size 에 width와 height를 인자로 넣는다
//    Button(
//        onClick = {},
//        modifier = Modifier.size(200.dp, 100.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 5. background를 설정(버튼에서는 되지 않음)

    // button에 되지 않으면 Text나 Icon에 지정

    // step 6. colors 파라미터에 ButtonDefaults.containerColor 넣어보기
    // containerColor 와 contentColor 프로퍼티를 설정
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            contentColor = Color.Cyan,
//            containerColor = Color.Red
//        ),
//        onClick = {},
//        modifier = Modifier.size(200.dp),
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 7. Button의 modifier에 padding 추가
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            contentColor = Color.Cyan,
//            containerColor = Color.Red
//        ),
//        onClick = {},
//        modifier = Modifier.size(200.dp).padding(30.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 8. Modifier에 버튼 clickable 추가
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            contentColor = Color.Cyan,
//            containerColor = Color.Red
//        ),
//        enabled = false,
//        onClick = {},
//        modifier = Modifier.size(200.dp).padding(30.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search", modifier = Modifier.clickable {  })
//    }
    // step 9. Text의 modifier에 offset 설정하고 x 파라미터 설정
        Button(
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Cyan,
            containerColor = Color.Red
        ),
        onClick = {},
        modifier = Modifier.size(200.dp).padding(30.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Search", modifier = Modifier.offset(x = 5.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ModifierGreetingPreview() {
    HelloWorldTheme {
        ModifierGreeting()
    }
}