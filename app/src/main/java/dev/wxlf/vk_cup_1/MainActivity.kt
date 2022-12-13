package dev.wxlf.vk_cup_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.wxlf.vk_cup_1.presentation.Routes
import dev.wxlf.vk_cup_1.presentation.screens.ContinueScreen
import dev.wxlf.vk_cup_1.presentation.screens.InterestingCategoriesScreen
import dev.wxlf.vk_cup_1.presentation.screens.SkipScreen
import dev.wxlf.vk_cup_1.presentation.viewmodels.InterestingCategoriesViewModel
import dev.wxlf.vk_cup_1.ui.theme.Vk_cup_1Theme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Vk_cup_1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Routes.InterestingCategories.route
                    ) {
                        composable(Routes.InterestingCategories.route) {
                            val interestingCategoriesViewModel = hiltViewModel<InterestingCategoriesViewModel>()
                            InterestingCategoriesScreen(interestingCategoriesViewModel, navController)
                        }
                        composable(Routes.Skip.route) { SkipScreen() }
                        composable(Routes.Continue.route) { ContinueScreen() }
                    }
                }
            }
        }
    }
}