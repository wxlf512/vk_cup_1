package dev.wxlf.vk_cup_1.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.accompanist.flowlayout.FlowRow
import dev.wxlf.vk_cup_1.domain.entity.CategoryDisplayableItem
import dev.wxlf.vk_cup_1.presentation.common.InterestingCategoryEvent
import dev.wxlf.vk_cup_1.presentation.common.InterestingCategoryViewState
import dev.wxlf.vk_cup_1.presentation.viewmodels.InterestingCategoriesViewModel

@SuppressLint("MutableCollectionMutableState")
@Composable
fun InterestingCategoriesScreen(
    viewModel: InterestingCategoriesViewModel,
    navController: NavHostController
) {
    val uiState by viewModel.uiState.collectAsState()
    val content = remember { mutableStateListOf<CategoryDisplayableItem>() }
    when (uiState) {
        is InterestingCategoryViewState.Loaded -> content.addAll((uiState as InterestingCategoryViewState.Loaded).data)
        InterestingCategoryViewState.Loading -> {}
    }

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
                onClick = { viewModel.obtainEvent(InterestingCategoryEvent.Skip) },
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
                    content.forEachIndexed { index, it ->
                        if (!it.selected) {
                            Button(
                                shape = RoundedCornerShape(12.dp),
                                onClick = {
                                    content[index] = content[index].copy(selected = true)
                                },
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
                                    it.name,
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
                        } else {
                            Button(
                                shape = RoundedCornerShape(12.dp),
                                onClick = {
                                    content[index] = content[index].copy(selected = false)
                                },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFFF5317),
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
                                    it.name,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(590)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(start = 14.dp, end = 8.dp)
                                        .size(width = 1.dp, height = 20.dp)
                                        .background(Color(0xFFFF5317))
                                )
                                Icon(Icons.Default.Done, contentDescription = "Added")
                            }
                        }
                    }
                }
            }
            item {
                var done = false
                content.forEach {
                    if (it.selected) {
                        done = true
                    }
                }
                if (done) {
                    Button(
                        modifier = Modifier.padding(top = 4.dp, bottom = 34.dp),
                        onClick = { viewModel.obtainEvent(InterestingCategoryEvent.Continue(content)) },
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

    LaunchedEffect(key1 = Unit, block = {
        viewModel.obtainEvent(InterestingCategoryEvent.ScreenShown)
    })

}