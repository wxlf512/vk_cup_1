package dev.wxlf.vk_cup_1.presentation

sealed class Routes(val route: String) {
    object InterestingCategories : Routes("vk_cup_1://interesting_categories")
    object Skip : Routes("vk_cup_1://skip")
    object Continue : Routes("vk_cup_1://continue")
}
