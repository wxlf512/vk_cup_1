package dev.wxlf.vk_cup_1.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.wxlf.vk_cup_1.domain.usecases.FetchInterestingCategoryUseCase

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideFetchInterestingCategoriesUseCase() : FetchInterestingCategoryUseCase =
        FetchInterestingCategoryUseCase()
}