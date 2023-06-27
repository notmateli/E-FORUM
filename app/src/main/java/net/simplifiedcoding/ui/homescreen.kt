@file:OptIn(ExperimentalMaterial3Api::class)

package net.simplifiedcoding.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.simplifiedcoding.R





@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Home() {
    val home = LocalContext.current
    Scaffold(
        topBar = {

            TopAppBar(

                title = {
                    Text( "PROFILE",
                        modifier = Modifier
                            .padding(10.dp),
                        color = (Color.Black),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,




                        )
                },
                navigationIcon = {
                    IconButton(onClick = {}

                    ) {
                        Icon(Icons.Filled.List, "backIcon")
//                            Icon(Icons.Filled.Notifications, "notification")

                    }

                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Red)

            )
        }, content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()


            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.brainstorming3


                    ),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()
                        .fillMaxHeight()


                )
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    LazyColumn {

                        item {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "", color = Color(0xFF40C4FF))

                                LazyRow {

                                    item {

                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally
                                        ) {
//                                            Image(
//                                                painter = painterResource(id = R.drawable.brain1),
//                                                contentDescription = "",
//                                                contentScale = ContentScale.Crop,
//                                                modifier = Modifier
//                                                    .size(100.dp)
//                                                    .padding(5.dp)
//
//                                     Text(text = "")
////                                            )
//                                            val paddingModifier = Modifier.padding(10.dp)
//                                            Card(
////                                                elevation = 10.dp,
//                                                border = BorderStroke(10.dp, Color.Blue),
//                                                modifier = paddingModifier
//
//                                            ) {
//                                                Image(painter = painterResource
//                                                    (id =R.drawable.forum1), contentDescription = null )
//                                            }
                                        }

                                    }

                                }


                            }
                        }
                    }
                }
            }




        })



}

@Composable
fun TopAppBar(title: () -> Unit, navigationIcon: () -> Unit, colors: TopAppBarColors) {
    TODO("Not yet implemented")
}





















