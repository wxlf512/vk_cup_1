package dev.wxlf.vk_cup_1.domain.usecases

import dev.wxlf.vk_cup_1.domain.entity.CategoryDisplayableItem
import kotlinx.coroutines.delay

class FetchInterestingCategoryUseCase {

    suspend fun execute() : List<CategoryDisplayableItem> {
        delay(1000L)
        return listOf(
            CategoryDisplayableItem(1, "Юмор", false),
            CategoryDisplayableItem(2, "Еда", false),
            CategoryDisplayableItem(3, "Кино", false),
            CategoryDisplayableItem(4, "Рестораны", false),
            CategoryDisplayableItem(5, "Прогулки", false),
            CategoryDisplayableItem(6, "Политика", false),
            CategoryDisplayableItem(7, "Новости", false),
            CategoryDisplayableItem(8, "Автомобили", false),
            CategoryDisplayableItem(9, "Сериалы", false),
            CategoryDisplayableItem(10, "Рецепты", false),
            CategoryDisplayableItem(11, "Работа", false),
            CategoryDisplayableItem(12, "Отдых", false),
            CategoryDisplayableItem(13, "Спорт", false),
            CategoryDisplayableItem(14, "Политика", false),
            CategoryDisplayableItem(15, "Новости", false),
            CategoryDisplayableItem(16, "Юмор", false),
            CategoryDisplayableItem(17, "Еда", false),
            CategoryDisplayableItem(18, "Кино", false),
            CategoryDisplayableItem(19, "Рестораны", false),
            CategoryDisplayableItem(20, "Прогулки", false),
            CategoryDisplayableItem(21, "Политика", false),
            CategoryDisplayableItem(22, "Новости", false),
            CategoryDisplayableItem(23, "Юмор", false),
            CategoryDisplayableItem(24, "Еда", false),
            CategoryDisplayableItem(25, "Кино", false)
        )
    }
}

/*
CategoryDisplayableItem(1, "Юмор", false),
CategoryDisplayableItem(2, "Еда", false),
CategoryDisplayableItem(3, "Кино", false),
CategoryDisplayableItem(4, "Рестораны", false),
CategoryDisplayableItem(5, "Прогулки", false),
CategoryDisplayableItem(6, "Политика", false),
CategoryDisplayableItem(7, "Новости", false),
CategoryDisplayableItem(8, "Автомобили", false),
CategoryDisplayableItem(9, "Сериалы", false),
CategoryDisplayableItem(10, "Рецепты", false),
CategoryDisplayableItem(11, "Работа", false),
CategoryDisplayableItem(12, "Отдых", false),
CategoryDisplayableItem(13, "Спорт", false),
CategoryDisplayableItem(14, "Политика", false),
CategoryDisplayableItem(15, "Новости", false),
CategoryDisplayableItem(16, "Юмор", false),
CategoryDisplayableItem(17, "Еда", false),
CategoryDisplayableItem(18, "Кино", false),
CategoryDisplayableItem(19, "Рестораны", false),
CategoryDisplayableItem(20, "Прогулки", false),
CategoryDisplayableItem(21, "Политика", false),
CategoryDisplayableItem(22, "Новости", false),
CategoryDisplayableItem(23, "Юмор", false),
CategoryDisplayableItem(24, "Еда", false),
CategoryDisplayableItem(25, "Кино", false)
 */