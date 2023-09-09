package com.devkm.snapmania

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devkm.snapmania.auth.SignUpScreen
import com.devkm.snapmania.ui.theme.SnapManiaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnapManiaTheme {
                // A surface container using the 'background' color from the theme
                SnapManiaApp()
            }
        }
    }
}

@Composable
fun SnapManiaApp() {
    val vm = hiltViewModel<SnapManiaViewModel>()
     val navController= rememberNavController()
    NavHost(
        navController = navController,
        startDestination = DestinationScreen.Signup.route){
        composable(DestinationScreen.Signup.route){
            SignUpScreen(navController = navController, viewModel = vm)
        }
    }
}

sealed class DestinationScreen(val route: String) {
 object Signup:DestinationScreen("signup")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hell i am name $name",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SnapManiaTheme {
        SnapManiaApp()
    }
}