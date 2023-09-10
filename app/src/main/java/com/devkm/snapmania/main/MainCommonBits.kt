package com.devkm.snapmania.main

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.devkm.snapmania.SnapManiaViewModel
@Composable
fun NotificationMessage(viemodel: SnapManiaViewModel) {
    val notifState = viemodel.popupNotification.value
    val notifiMessage = notifState?.getContentOrNull()
    if (notifiMessage != null) {
        Toast.makeText(LocalContext.current, notifiMessage, Toast.LENGTH_LONG).show()
    }

}