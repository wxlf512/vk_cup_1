package dev.wxlf.vk_cup_1.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun SkipScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("Skip", modifier = Modifier.align(Alignment.Center), fontSize = 32.sp)
    }
}