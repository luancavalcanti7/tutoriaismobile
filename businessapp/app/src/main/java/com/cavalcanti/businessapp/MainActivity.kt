package com.cavalcanti.businessapp

import android.R.attr.background
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cavalcanti.businessapp.ui.theme.BusinessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        title = "Aspas",
                        subtitle = "Best Valorant Player in the world"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier, title: String, subtitle: String) {
    val image = painterResource(R.drawable.aspas)
    Column(
        modifier = modifier
            .background(Color(0xFFbff0f5))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Image(
                    painter = image,
                    contentDescription = "Neymarjr :p ",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .height(200.dp)
                )
            }
            Row {
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 10.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 24.dp, bottom = 8.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
            }
            Row {
                Text(
                    text = subtitle,
                    lineHeight = 5.sp,
                    color = Color(0xFF465759)
                )
            }
        }
        Row (
            modifier = Modifier
                .padding(start = 16.dp, bottom = 50.dp, end = 16.dp, top = 16.dp)
        ){
            Icon(Icons.Rounded.AccountBox,
                contentDescription = "Account Icon",
                tint = Color.Black
            )
            Text(
                text = "@aspaszin",
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessAppTheme {
        Greeting(
            title = "Aspas (Erik Santos)",
            subtitle = "Melhor jogador de valorant do mundo"
        )
    }
}