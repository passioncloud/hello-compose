package net.passioncloud.democompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.passioncloud.democompose.ui.theme.DemoComposeTheme


class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          //  Text("Hello world today here !!!!")
//            Messenger("Welcome to my world")
            PreviewMessenger()
        }
    }
}


data class Message(
    val writer: String,
    val body: String
)

@Preview
@Composable
fun PreviewMessenger() {
    Messenger(msg=Message("Rooney", "Scored hat-trick"))
}



@Composable
fun Messenger(msg: Message) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.paula),
            contentDescription = "Paula profile image",
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .clip(CircleShape)
        )
        // horizontal space
        Spacer(modifier = Modifier.width(18.dp))
        Column {
            Text(text = msg.writer)
            Spacer(modifier=Modifier.height(8.dp))
            Text(text = msg.body)
        }
    }

}


//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            DemoComposeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    DemoComposeTheme {
//        Greeting("Android")
//    }
//}