package net.simplifiedcoding.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_INFORMATION
import net.simplifiedcoding.ui.animate.managerAnimation
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme
import net.simplifiedcoding.ui.theme.spacing

@Composable
fun HomeScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(Color.LightGray),


        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        item {




                Row(
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.End,
                )
                {
                    Text(
                        "Want to share your ideas?",
                        modifier = Modifier,
//                            .padding(10.dp),
                        color = (Color.Red),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Left
                    )
                    Spacer(modifier = Modifier.width(50.dp))

                    Image(
                        painter = painterResource(
                            id = R.drawable.forums
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(spacing.extraSmall)
                            .width(120.dp)
                            .height(120.dp)
                            .border(1.dp, Color.Transparent, CircleShape)
                            .fillMaxWidth()

                    )

                }
                Spacer(modifier = Modifier.height(20.dp))

                Column() {
                    Text(
                        text = "I am creating a  community platform that connects individuals with similar interests and facilitates discussions on various topics.",
                        modifier = Modifier,
                        color = (Color.Black),
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Left


                    )


                }
                Spacer(modifier = Modifier.height(40.dp))


                Column() {
                    Row(
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.End,
                    ) {


                        Text(
                            "Some Users",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.Underline,
                            modifier = Modifier
                                .padding(10.dp)
                        )

                        Spacer(modifier = Modifier.width(200.dp))

                        Text(
                            "View All",
                            color = Color.Red,

                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_INFORMATION) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },

                            )
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))


                Column() {


                    Row (
                        modifier = Modifier
//                            .padding(10.dp)
                            ){


                        Card(
                            shape = RoundedCornerShape(10.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp,
                            ),
                            modifier = Modifier
                                .padding(10.dp)
//
                        ) {

                            Image(
                                painter = painterResource(
                                    id = R.drawable.profiles22
                                ),
                                contentDescription = "",
                                modifier = Modifier
//                                    .padding(spacing.extraSmall)
                                    .width(170.dp)
                                    .height(120.dp)
                                    .border(1.dp, Color.Transparent, RectangleShape)
                                    .fillMaxWidth()
                            )
                            Text(

                                text = "Mohammed ",
                                style = MaterialTheme.typography.bodyLarge,
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface
                            )



                            Text(
                                text = "View my idea",
                                color = Color.Green,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .clickable {
                                        navController.navigate(ROUTE_INFORMATION) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    },

                                )

                        }


                        //profile 2


                        val paddingModifier = Modifier
                            .padding(10.dp)
                        Card(
                            shape = RoundedCornerShape(10.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp,
                            ),
                            modifier = Modifier
                                .padding(10.dp)
//
                        ) {

                            Image(
                                painter = painterResource(
                                    id = R.drawable.profile34
                                ),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(spacing.extraSmall)
                                    .width(170.dp)
                                    .height(120.dp)
                                    .border(1.dp, Color.Transparent, RectangleShape)
                                    .fillMaxWidth()
                            )
                            Text(

                                text = "Jessica ",
                                style = MaterialTheme.typography.bodyLarge,
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface
                            )



                            Text(
                                text = "View my idea",
                                color = Color.Green,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .clickable {
                                        navController.navigate(ROUTE_INFORMATION) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    },

                        )
                        }


                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

                Column() {

managerAnimation(height = 200)
                }
            }


        }
    }





















//
//
//
    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
    @Composable
    fun HomeScreenPreviewLight() {
        AppTheme {
            HomeScreen(null, rememberNavController())
        }
    }

    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun HomeScreenPreviewDark() {
        AppTheme {
            HomeScreen(null, rememberNavController())
        }
    }

