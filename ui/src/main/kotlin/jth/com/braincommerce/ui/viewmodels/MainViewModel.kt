package jth.com.braincommerce.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import jth.com.braincommerce.domain.model.Recruit
import jth.com.braincommerce.domain.usecase.GetCellsUseCase
import jth.com.braincommerce.domain.usecase.GetRecruitsUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getRecruitsUseCase: GetRecruitsUseCase,
    private val getCellsUseCase: GetCellsUseCase
) : BaseViewModel() {

    private var _recruitData = MutableLiveData<List<Recruit>>()
    val recruitLiveData : LiveData<List<Recruit>> = _recruitData

    fun getRecruits() {
        viewModelScope.launch {
            _recruitData.value = getRecruitsUseCase.invoke()
        }
    }
}