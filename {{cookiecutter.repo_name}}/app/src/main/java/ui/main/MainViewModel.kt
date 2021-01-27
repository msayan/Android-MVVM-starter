package {{ cookiecutter.package_name }}.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import {{ cookiecutter.package_name }}.core.BaseViewModel
import {{ cookiecutter.package_name }}.db.AppDatabase


class MainViewModel @ViewModelInject constructor(
    private val db: AppDatabase
) : BaseViewModel() {

}