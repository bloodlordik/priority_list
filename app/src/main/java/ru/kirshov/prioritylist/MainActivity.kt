package ru.kirshov.prioritylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Text
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import ru.kirshov.prioritylist.domain.AppViewModel
import ru.kirshov.prioritylist.presentation.MainDisplay
import ru.kirshov.prioritylist.ui.theme.PriorityListTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<AppViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PriorityListTheme {
               MainDisplay(viewModel)
            }
        }
    }
}

