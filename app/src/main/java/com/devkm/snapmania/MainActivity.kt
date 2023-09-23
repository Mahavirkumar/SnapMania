package com.devkm.snapmania

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.os.BundleCompat.getParcelable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devkm.snapmania.main.FeedScreen
import com.devkm.snapmania.auth.LoginScreen
import com.devkm.snapmania.auth.ProfileScreen
import com.devkm.snapmania.auth.SignUpScreen
import com.devkm.snapmania.data.PostData
import com.devkm.snapmania.main.MyPostsScreen
import com.devkm.snapmania.main.NewPostScreen
import com.devkm.snapmania.main.NotificationMessage
import com.devkm.snapmania.main.SearchScreen
import com.devkm.snapmania.main.SinglePostScreen
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
    val navController = rememberNavController()

    NotificationMessage(viemodel = vm)

    NavHost(
        navController = navController,
        startDestination = DestinationScreen.Signup.route
    ) {
        composable(DestinationScreen.Signup.route) {
            SignUpScreen(navController = navController, viewModel = vm)
        }
        composable(DestinationScreen.Login.route) {
            LoginScreen(navController = navController, viewModel = vm)
        }
        composable(DestinationScreen.Feed.route) {
            FeedScreen(navController = navController, viewModel = vm)
        }
        composable(DestinationScreen.Search.route) {
            SearchScreen(navController = navController, vm = vm)
        }
        composable(DestinationScreen.MyPosts.route) {
            MyPostsScreen(navController = navController, viewModel = vm)
        }
        composable(DestinationScreen.Profile.route) {
            ProfileScreen(navController = navController, viewModel = vm)
        }
        composable(DestinationScreen.NewPost.route) { navbackStackEntry ->
            val imageUri = navbackStackEntry.arguments?.getString("imageUri")
            imageUri?.let {
                NewPostScreen(navController = navController, viewModel = vm, encodedUri = it)
            }

        }
        composable(DestinationScreen.SinglePost.route) {
            val postData =
                navController.previousBackStackEntry
                    ?.arguments?.getParcelable<PostData>("post")
            postData?.let {
                SinglePostScreen(
                    navController = navController,
                    vm = vm, post = postData
                )
            }
        }

    }
}

sealed class DestinationScreen(val route: String) {
    object Signup : DestinationScreen("signup")
    object Login : DestinationScreen("login")
    object Feed : DestinationScreen("feed")
    object Search : DestinationScreen("search")
    object MyPosts : DestinationScreen("myposts")
    object Profile : DestinationScreen("profile")
    object NewPost : DestinationScreen("newpost/{imageUri}") {
        fun createRoute(uri: String) = "newpost/$uri"
    }

    object SinglePost : DestinationScreen("singlepost")
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