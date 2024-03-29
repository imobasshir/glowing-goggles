package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MaterialDesignUse()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    MyApplicationTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Mobasshir!", from = " - from Ibrahim")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CardPreview() {
    MyApplicationTheme {
        Card()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DiceRollerAppPreview() {
    MyApplicationTheme {
        DiceWithButtonAndImage()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NextPrevPreview() {
    MyApplicationTheme {
        NextPrev()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewModifierEg() {
    MyApplicationTheme {
        PracticeModifier(text = "Hello, Android Compose")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantComposePreview() {
    MyApplicationTheme {
        QuadrantCompose()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TipTimeScreenPreview() {
    MyApplicationTheme {
        TipTimeScreen()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AffirmationPreview() {
    MyApplicationTheme {
        AffirmationApp()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TpcPreview() {
    MyApplicationTheme {
        TopicGrid()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun MaterialDesignUsePreviewMain() {
    MyApplicationTheme {
        MaterialDesignUse()
    }
}