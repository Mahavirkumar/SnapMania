package com.devkm.snapmania.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.devkm.snapmania.DestinationScreen
import com.devkm.snapmania.SnapManiaViewModel
import com.devkm.snapmania.main.navigateTo

@Composable
fun LoginScreen(navController: NavController,viewModel: SnapManiaViewModel){
    Text(
        text = "New here? Go to signup",
        color = Color.Blue,
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                navigateTo(navController, DestinationScreen.Signup)
            }
    )
}