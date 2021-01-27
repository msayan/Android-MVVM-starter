package {{ cookiecutter.package_name }}.ui.main

import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.core.BaseActivity
import {{ cookiecutter.package_name }}.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(MainViewModel::class.java) {
    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun onInit() {

    }

}