package dev.wxlf.vk_cup_1.presentation.common

import dev.wxlf.vk_cup_1.domain.entity.CategoryDisplayableItem

sealed class InterestingCategoryEvent {
    object ScreenShown : InterestingCategoryEvent()
    object Skip : InterestingCategoryEvent()
    data class Continue(val data: List<CategoryDisplayableItem>) : InterestingCategoryEvent()
}