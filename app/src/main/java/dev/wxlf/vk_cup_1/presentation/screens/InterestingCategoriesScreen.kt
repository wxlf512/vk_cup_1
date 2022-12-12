package dev.wxlf.vk_cup_1.presentation.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.accompanist.flowlayout.FlowRow

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun InterestingCategoriesScreen(navController: NavHostController) {
    val content =
        listOf(
            "Юмор",
            "Еда",
            "Кино",
            "Рестораны",
            "Прогулки",
            "Политика",
            "Новости",
            "Автомобили",
            "Сериалы",
            "Рецепты",
            "Работа",
            "Отдых",
            "Спорт",
            "Политика",
            "Новости",
            "Юмор",
            "Еда",
            "Кино",
            "Рестораны",
            "Прогулки",
            "Политика",
            "Новости",
            "Юмор",
            "Еда",
            "Кино"
        )
    Column() {
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
                contentPadding = PaddingValues(
                    start = 13.dp,
                    top = 9.dp,
                    end = 13.dp,
                    bottom = 11.dp
                )
            ) {
                Text(
                    "Позже",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(590)
                )
            }
        }

        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                FlowRow(
                    modifier = Modifier
                        .padding(16.dp),
                    mainAxisSpacing = 8.dp,
                    crossAxisSpacing = 8.dp
                ) {
                    content.forEach {
                        Button(
                            shape = RoundedCornerShape(12.dp),
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF2B2B2B),
                                contentColor = Color(0xFFFFFFFF)
                            ),
                            contentPadding = PaddingValues(
                                start = 13.dp,
                                top = 9.dp,
                                end = 13.dp,
                                bottom = 11.dp
                            )
                        ) {
                            Text(
                                it,
                                fontSize = 16.sp,
                                fontWeight = FontWeight(590)
                            )
                            Spacer(
                                modifier = Modifier
                                    .padding(start = 14.dp, end = 8.dp)
                                    .size(width = 1.dp, height = 20.dp)
                                    .background(Color(0x45FFFFFF))
                            )
                            Icon(Icons.Default.Add, contentDescription = "Add")
                        }
                    }
                }
            }
            item {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFFFFF),
                        contentColor = Color(0xFF000000)
                    ),
                    contentPadding = PaddingValues(
                        vertical = 29.dp,
                        horizontal = 51.dp
                    )
                ) {
                    Text(
                        "Продолжить",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(500)
                    )
                }
            }
        }
    }
}