@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package net.simplifiedcoding.ui


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.navigation.ROUTE_INTRODUCTION
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun IntroductionScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.forum1),
            contentDescription = "abcd",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds

        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            LazyColumn {

                item {
                    Text(

                        text = "",
                        color = Color.Black,
                        fontStyle = FontStyle.Normal,



                        modifier = Modifier
                            .padding(20.dp, 10.dp, 0.dp, 0.dp)
                            .size(700.dp)


                    )
                    Column(

                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally,


                        ) {


                        Button(onClick = {},
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            shape = RectangleShape,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)


                        ) {
                            Image(
                                painterResource(id = R.drawable.arrow2),
                                contentDescription ="arrow icon",
                                modifier = Modifier.size(20.dp))
                            Text(
                                "BEGIN YOUR JOURNEY HERE",
                                color = Color.White,
                                fontStyle = FontStyle.Italic,
                                modifier = Modifier
                                    .clickable {
                                        navController.navigate(ROUTE_LOGIN) {
                                            popUpTo(ROUTE_INTRODUCTION) { inclusive = true }
                                        }
                                    },




                                )
                        }
                    }

                }



            }
        }
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun IntroductionScreenPreviewLight() {
    AppTheme {
        net.simplifiedcoding.ui.IntroductionScreen(null, rememberNavController())
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun IntroductionPreviewDark() {
    AppTheme {
        net.simplifiedcoding.ui.IntroductionScreen(null, rememberNavController())
    }
}



