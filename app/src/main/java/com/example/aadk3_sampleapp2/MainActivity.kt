package com.example.aadk3_sampleapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aadk3_sampleapp2.ui.theme.AADK3SampleApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AADK3SampleApp2Theme() {
                List()
            }
        }
    }
}

@Composable
fun List() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight()
    ) {
        ListItem(content = "ABC")
        ListItem(content = "EFG")
        ListItem(content = "XYZ")
    }
}

@Composable
fun ListItem(
    content: String
) {
    var isExpanded by remember { mutableStateOf(false) }
    var extraPadding = if (isExpanded) 56.dp else 0.dp
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .padding(extraPadding),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = content)
        Button(onClick = {
        /*Expand this list Item by 56dp*/
            isExpanded = !isExpanded
        }) {
            Text(text = if (isExpanded) "Show Less" else "Show More")
        }
    }
}

//@Composable
//fun WelcomeScreen(backgroundColor : Color) {
//    Column(
//        modifier = Modifier
//            .background(color = backgroundColor)
//            .fillMaxWidth()
//    ) {
//        Text(
//            text = "Hello world"
//        )
//        Text(
//            text = "Geeks for Geeks"
//        )
//    }
//}

@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview() {
    AADK3SampleApp2Theme {
        List()
        // ListItem("Hello")
    }
}

//AADK3SampleApp2Theme {
//    // A surface container using the 'background' color from the theme
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = MaterialTheme.colorScheme.background
//    ) {
//        Greeting("Android")
//    }
//}