package com.example.premierleaguefixturecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.premierleaguefixturecompose.ui.theme.PremierLeagueFixtureComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChangeTheWord()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChangeTheWord () {

        val number = remember {
            mutableStateOf("zero")
        }
        val one = "one"
        val two = "two"
        val zero = "zero"

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "${number.value}",
                fontSize = 40.sp
            )
            Button(
                onClick = {
                    when (number.value) {
                        "zero" -> number.value = one
                        "one" -> number.value = two
                        "two" -> number.value = zero
                    }
                },
                modifier = Modifier
                    .width(300.dp)
                    .height(80.dp)
            ) {
                Text(text = stringResource(id = R.string.change_word), fontSize = 30.sp)
            }

        }
    }