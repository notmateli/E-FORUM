package com.example.sam

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sam.ui.theme.SamTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greetings()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greetings() {
    val home = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()){
        Image(
                painter = painterResource(id = R.drawable.brain1),
                contentDescription = "abcd",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds

            )






    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        var mail by remember { mutableStateOf(TextFieldValue("")) }
        var pass by remember { mutableStateOf(TextFieldValue("")) }


            Text("REGISTER HERE")

            OutlinedTextField(
                value = text,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "emailIcon"
                    )
                },
                trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                onValueChange = {
                    text = it
                },
                label = { Text(text = "Username") },
                placeholder = { Text(text = "Username") },
                colors = TextFieldDefaults.textFieldColors(placeholderColor = Color.White,
                    disabledPlaceholderColor = Color.DarkGray
                ),

                )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )

            OutlinedTextField(
                value = mail,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "emailIcon"
                    )
                },
                trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                onValueChange = {
                    mail = it
                },
                label = { Text(text = " Enter Your Email") },
                placeholder = { Text(text = "Enter your Email Address") },
                colors = TextFieldDefaults.textFieldColors(placeholderColor = Color.White,
                    disabledPlaceholderColor = Color.DarkGray
                ),


            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )

            OutlinedTextField(
                value = pass,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "emailIcon"
                    )
                },
                trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                onValueChange = {
                    pass = it
                },
                label = { Text(text = " New Password") },
                placeholder = { Text(text = "Enter your new password") },
                colors = TextFieldDefaults.textFieldColors(placeholderColor = Color.White,
                    disabledPlaceholderColor = Color.DarkGray
                ),


            )
            OutlinedTextField(
                value = pass,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "emailIcon"
                    )
                },
                trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                onValueChange = {
                    pass = it
                },
                label = { Text(text = "  Re-enter Password") },
                placeholder = { Text(text = "Repeat your new password") },
                colors = TextFieldDefaults.textFieldColors(placeholderColor = Color.White,
                    disabledPlaceholderColor = Color.DarkGray
                ),


            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )


            Button(
                onClick = { home.startActivity(Intent(home, AboutActivity::class.java)) },
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp
                )
            ) {
                Text(text = "REGISTER"

                )

            }
    }
    }
}



