package jth.com.braincommerce.ui.views.main

import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import jth.com.braincommerce.ui.R
import jth.com.braincommerce.ui.databinding.MainActivityBinding
import jth.com.braincommerce.ui.viewmodels.MainViewModel
import jth.com.braincommerce.ui.views.base.BaseActivity

@AndroidEntryPoint
class MainActivity : BaseActivity<MainActivityBinding>()  {
    private val viewModel: MainViewModel by viewModels()

    override fun getLayoutResId(): Int  = R.layout.main_activity

    override fun initializeViewModel() {
        binding?.viewModel = viewModel
        viewModel.getRecruits()
    }

    override fun initializeUiEvent() {
    }
}