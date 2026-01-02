package com.example.composerefresher

import android.content.res.Configuration
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composerefresher.ui.theme.ComposeRefresherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeRefresherTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Conversation(
                        messages = arrayListOf(
                            Message(
                                author = "Ben Salcie",
                                message = "You are the new Author"
                            ),
                            Message(
                                author = "Charity Muia",
                                message = "You are the new Boy Friend"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )
                            ,
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            ),
                            Message(
                                author = "Juliana Kenya",
                                message = "You are the new Boy Artist"
                            )



                        )
                    )
                }
            }

        }

    }
}

data class Message(val author: String, val message: String)

@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun MessageCardPreview() {
    ComposeRefresherTheme {
        Surface {
            Conversation(
                messages = arrayListOf(
                    Message(
                        author = "Ben Salcie",
                        message = "You are the new Author"
                    ),
                    Message(
                        author = "Charity Muia",
                        message = "You are the new Boy Friend"
                    ),
                    Message(
                        author = "Juliana Kenya",
                        message = "You are the new Boy Artist"
                    ),
                    Message(
                        author = "Juliana Kenya",
                        message = "You are the new Boy Artist"
                    ),
                    Message(
                        author = "Juliana Kenya",
                        message = "You are the new Boy Artist"
                    ),
                    Message(
                        author = "Juliana Kenya",
                        message = "You are the new Boy Artist"
                    ),
                    Message(
                        author = "Juliana Kenya",
                        message = "You are the new Boy Artist"
                    ),
                    Message(
                        author = "Juliana Kenya",
                        message = "You are the new Boy Artist"
                    ),
                    Message(
                        author = "Juliana Kenya",
                        message = "You are the new Boy Artist"
                    )


                )
            )

//            MessageCard(
//                message = Message(
//                    author = "Ben Salcie",
//                    message = "You are the new Author"
//                )
//            )
        }
    }
}

@Composable
fun MessageCard(message: Message) {
    
    Row(modifier = Modifier.padding(all = 5.dp)) {
        androidx.compose.foundation.Image(
            painter = painterResource(R.drawable.ben),
            contentDescription = "Author Image",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary)

        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(
                text = message.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )
            Spacer(modifier = Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp) {
                Text(
                    text = message.message,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    }
}


@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(
            messages.size,
            itemContent = { index ->
                MessageCard(message = messages[index])
            },
        )
    }


}
