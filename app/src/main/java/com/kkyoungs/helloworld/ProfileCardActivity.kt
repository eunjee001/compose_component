package com.kkyoungs.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.kkyoungs.helloworld.ui.theme.HelloWorldTheme

class ProfileCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting9(cardData)
                    Greeting9(cardData)

                }
            }
        }
    }
companion object{
    val cardData = CardData(
        imageUri = "https://naver.com",
        imageDescription = "naver",
        author = "naver",
        description = "걍 해"
    )
}
}

@Composable
fun Greeting9(cardData: CardData) {
    val placeHolderColor = Color(0x33000000)

    Card(
        modifier = Modifier.padding(4.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ){
            // 'AsyncImage', 'spacer', 'column', 'Text',로 레이아웃 만들기
//            AsyncImage(model = cardData.imageUri, contentDescription = cardData.imageDescription, modifier = Modifier.size(32.dp))
//            Spacer(modifier = Modifier.size(8.dp))
//            Column {
//                Text(text = cardData.author)
//                Spacer(modifier = Modifier.size(4.dp))
//                Text(text = cardData.description )
//
//            }

            // 'AsyncImage'에는 'placeHolder'지정
            //contentScale을 ContentScale.Crop으로 설정
            // 'clip'로 둥근 외양 만들기
//            AsyncImage(model = cardData.imageUri, contentScale = ContentScale.Crop, contentDescription = cardData.imageDescription, placeholder = ColorPainter(placeHolderColor), modifier = Modifier.size(32.dp).clip(
//                CircleShape))
//            Spacer(modifier = Modifier.size(8.dp))
//            Column {
//                Text(text = cardData.author)
//                Spacer(modifier = Modifier.size(4.dp))
//                Text(text = cardData.description )
//
//            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview9() {
    HelloWorldTheme {
        Row {

        }
        Greeting9(ProfileCardActivity.cardData)
    }
}
data class CardData(
    val imageUri : String,
    val imageDescription : String,
    val author : String,
    val description:String
    )