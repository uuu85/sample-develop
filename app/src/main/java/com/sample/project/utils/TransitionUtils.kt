package com.sample.project.utils

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.FragmentActivity
import com.sample.project.R
import com.sample.project.activity.base.BaseDataBindingActivity
import com.sample.project.fragment.PlaneFragment
import com.sample.project.fragment.base.BaseDataBindingFragment

object TransitionUtils {
    fun fragmentTransition(
        fragment: BaseDataBindingFragment<*,*>,
        @IdRes id: Int,
        args: Bundle? = null,
        activity: FragmentActivity?,
    ) {
        val fm = activity?.supportFragmentManager
        fm?.let {
            args?.let {
                fragment.arguments = args
            }
            fm.beginTransaction()
                .add(id, fragment, fragment.javaClass.name)
                .addToBackStack(fragment.javaClass.name)
                .commit()
        }
    }
}