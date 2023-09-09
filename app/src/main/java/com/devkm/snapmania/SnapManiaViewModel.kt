package com.devkm.snapmania

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SnapManiaViewModel @Inject constructor(
    val firebaseAuth: FirebaseAuth,
    val firebaseFirestore: FirebaseFirestore,
    val firebaseStorage: FirebaseStorage
) : ViewModel() {
}