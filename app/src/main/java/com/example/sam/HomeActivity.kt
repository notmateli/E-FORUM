package com.example.sam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sam.ui.theme.SamTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Home()
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Home() {
    val home = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.brainstorming4),
            contentDescription = "abcd",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
//        Scaffold(
//            topBar = {
//                TopAppBar(
//                    title = {
//                        Text(text = "Top App Bar")
//                    },
//                    navigationIcon = {
//                        IconButton(onClick = {}) {
//                            Icon(Icons.Filled.ArrowBack, "backIcon")
//                        }
//                    },
////                    backgroundColor = MaterialTheme.colors.primary,
////                    contentColor = Color.White,
////                    elevation = 10.dp
//                )
//            },
//            Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(Color(0xff8d6e63)),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally)
//            {
//                    Text(
//                         "Content of the page",
//                        fontSize = 30.sp,
//                        color = Color.White
//                    )
//                )}

//        )
    }
    }


