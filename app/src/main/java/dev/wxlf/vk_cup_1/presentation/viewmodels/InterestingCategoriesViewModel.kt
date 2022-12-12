package dev.wxlf.vk_cup_1.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.wxlf.vk_cup_1.domain.usecases.FetchInterestingCategoryUseCase
import dev.wxlf.vk_cup_1.presentation.common.InterestingCategoryEvent
import dev.wxlf.vk_cup_1.presentation.common.InterestingCategoryViewState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InterestingCategoriesViewModel @Inject constructor(
    private val fetchInterestingCategoryUseCase: FetchInterestingCategoryUseCase
) : ViewModel() {
    private val _uiState =
        MutableStateFlow<InterestingCategoryViewState>(InterestingCategoryViewState.Loading)
    val uiState: StateFlow<InterestingCategoryViewState> = _uiState

    fun obtainEvent(event: InterestingCategoryEvent) {
        when(event) {
            is InterestingCategoryEvent.Continue -> Log.e("DATA", event.data.toString())
            InterestingCategoryEvent.ScreenShown -> {
                _uiState.value = InterestingCategoryViewState.Loading
                viewModelScope.launch {
                    val data = fetchInterestingCategoryUseCase.execute()
                    _uiState.emit(InterestingCategoryViewState.Loaded(data))
                }
            }
            InterestingCategoryEvent.Skip -> Log.e("SKIP", "SKIP")
        }
    }
}