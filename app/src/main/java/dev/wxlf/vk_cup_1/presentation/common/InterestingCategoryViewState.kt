package dev.wxlf.vk_cup_1.presentation.common

import dev.wxlf.vk_cup_1.domain.entity.CategoryDisplayableItem

sealed class InterestingCategoryViewState {
    object Loading : InterestingCategoryViewState()
    data class Loaded(val data: List<CategoryDisplayableItem>) : InterestingCategoryViewState()
}