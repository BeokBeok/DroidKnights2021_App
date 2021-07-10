package com.droidknights.app2020.schedule

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.droidknights.app2020.ui.core.compose.util.color

@Composable
fun ScheduleScreen() {
    LazyColumn {
        items(20) {
            Session()
            Divider(
                modifier = Modifier.padding(horizontal = 24.dp),
                color = "#EFEFEF".color
            )
        }
    }
}