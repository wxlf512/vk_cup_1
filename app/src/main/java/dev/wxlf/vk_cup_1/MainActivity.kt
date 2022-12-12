package dev.wxlf.vk_cup_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.wxlf.vk_cup_1.presentation.screens.InterestingCategoriesScreen
import dev.wxlf.vk_cup_1.presentation.viewmodels.InterestingCategoriesViewModel
import dev.wxlf.vk_cup_1.ui.theme.Vk_cup_1Theme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Vk_cup_1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold {
        NavHost(
            modifier = Modifier.padding(it),
            navController = navController,
            startDestination = "vk_cup_1://interesting_categories"
        ) {
            composable("vk_cup_1://interesting_categories") {
                val interestingCategoriesViewModel = hiltViewModel<InterestingCategoriesViewModel>()
                InterestingCategoriesScreen(interestingCategoriesViewModel, navController)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Vk_cup_1Theme {
        MainScreen()
    }
}