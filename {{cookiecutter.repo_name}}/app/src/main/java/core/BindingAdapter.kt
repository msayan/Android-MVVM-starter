package {{ cookiecutter.package_name }}.core

import android.view.View
import androidx.databinding.BindingAdapter

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("visibility")
    fun setVisibility(view: View, isVisible: Boolean) {
        view.visibility = View.GONE
        if (isVisible) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }

    @JvmStatic
    @BindingAdapter("visibilityNot")
    fun setVisibilityNot(view: View, isVisible: Boolean) {
        view.visibility = View.GONE
        if (isVisible.not()) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }

    @JvmStatic
    @BindingAdapter("enabled")
    fun setEnabled(view: View, isEnabled: Boolean) {
        view.isEnabled = isEnabled
    }
}