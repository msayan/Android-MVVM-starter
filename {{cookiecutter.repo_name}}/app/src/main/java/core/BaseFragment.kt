package {{ cookiecutter.package_name }}.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import {{ cookiecutter.package_name }}.BR

abstract class BaseFragment<VM : BaseViewModel, DB : ViewDataBinding>(private val mViewModelClass: Class<VM>) :
    Fragment() {
    lateinit var viewModel: VM
    private var _binding: DB? = null

    val binding get() = _binding

    fun init(inflater: LayoutInflater, container: ViewGroup?) {
        _binding = DataBindingUtil.inflate(inflater, getLayoutRes(), container, false)
        viewModel = getViewM()
        _binding?.setVariable(BR.viewModel, viewModel)
    }

    abstract fun onInit()

    @LayoutRes
    abstract fun getLayoutRes(): Int

    private fun getViewM(): VM = ViewModelProvider(this).get(mViewModelClass)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        init(inflater, container)
        super.onCreateView(inflater, container, savedInstanceState)

        onInit()
        return binding?.root ?: View(activity)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}