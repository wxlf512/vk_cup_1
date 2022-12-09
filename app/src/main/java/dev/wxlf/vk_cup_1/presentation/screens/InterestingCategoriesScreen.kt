package dev.wxlf.vk_cup_1.presentation.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun InterestingCategoriesScreen(navController: NavHostController) {
    Row(
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 8.dp)
            .height(64.dp)
    ) {
        Text(
            "Отметьте то, что вам интерсно,\nчтобы настроить Дзен",
            modifier = Modifier
                .padding(end = 12.dp),
            color = Color(0x7AFFFFFF),
            fontSize = 16.sp
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1C1C1C),
                contentColor = Color(0xFFFFFFFF)
            ),
            contentPadding = PaddingValues(start = 13.dp, top = 9.dp, end = 13.dp, bottom = 11.dp)
        ) {
            Text(
                "Позже",
                fontSize = 16.sp,
                fontWeight = FontWeight(590)
            )
        }
    }
}