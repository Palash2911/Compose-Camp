package com.godspeed.unit_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.godspeed.unit_2.ui.theme.Unit_2Theme
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center),
                    color = Color.White
                ) {
//                    Greeting("Android")
                    DiceWithButtonAndImage()
//                    TipTimeScreen()
                }
            }
        }
    }
}

@Composable
fun DiceWithButtonAndImage() {
    var result by remember { mutableStateOf(1) }
    val imageResource = when(result) {
        1 -> painterResource(id = R.drawable.dice_1)
        2 -> painterResource(id = R.drawable.dice_2)
        3 -> painterResource(id = R.drawable.dice_3)
        4 -> painterResource(id = R.drawable.dice_4)
        5 -> painterResource(id = R.drawable.dice_5)
        else -> painterResource(id = R.drawable.dice_6)
    }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = imageResource, contentDescription = "Dice 1")
        Button(onClick = {
            result = (1..6).random()
        }) {
            Text(text = "Roll It !", fontSize=20.sp)
        }
    }
}

@Preview
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage()
}

