package net.simplifiedcoding.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.navigation.ROUTE_CONTRIBUTE
import net.simplifiedcoding.navigation.ROUTE_INFORMATION
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme

@Composable
fun InfoScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()

           
        
    ){

        item {
            Box() {
//                Image(
//                    painter = painterResource(R.drawable.forum221),
//                    contentDescription = null, // Provide a description if needed
//                    modifier = Modifier.fillMaxSize(),
//                    contentScale = ContentScale.FillBounds
//                )

                Column {


                    Text(
                        text = "Global Football Connect",
                        color = Color.Green,
                        textDecoration = TextDecoration.Underline,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = " Global Football Connect is an innovative mobile application designed to connect football coaches in Kenya with coaches from around the world. The app aims to foster collaboration, knowledge sharing, and skill development among coaches, ultimately enhancing the quality of football coaching in Kenya.",
                        color = Color.Black,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Image(
                    painter = painterResource(R.drawable.forum221),
                    contentDescription = null, // Provide a description if needed
//                    modifier = Modifier.fillMaxSize(),
//                    contentScale = ContentScale.FillBounds
                )
                    Spacer(modifier = Modifier.height(10.dp))


                    Text(
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ROUTE_CONTRIBUTE) {
                                    popUpTo(ROUTE_INFORMATION) { inclusive = true }
                                }
                            },
                        text = "Something to add or contribute?Click here to add more info",
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Left,
                        color = Color.Green
                    )





                }

            }
            
            
            
            
            
        }
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun InfoScreenPreviewLight() {
    AppTheme {
        InfoScreen(null, rememberNavController())
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun InfoScreenPreviewDark() {
    AppTheme {
        InfoScreen(null, rememberNavController())
    }
}


