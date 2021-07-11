package com.droidknights.app2021.schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.droidknights.app2021.navigator.DetailNavigator
import com.droidknights.app2021.ui.core.compose.setThemeContent
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ScheduleFragment : Fragment() {

    @Inject
    lateinit var detailNavigator: DetailNavigator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return setThemeContent {
            ScheduleScreen {
                detailNavigator.openDetail(
                    requireContext(),
                    /** TBD */
                    0
                )
            }
        }
    }
}