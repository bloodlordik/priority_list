@file:OptIn(ExperimentalMaterialApi::class)

package ru.kirshov.prioritylist.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import ru.kirshov.prioritylist.domain.AppViewModel


@Composable
fun MainDisplay(viewModel: AppViewModel) {
    val bottomState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    ModalBottomSheetLayout(
        sheetContent = {
                       Text(text = "Modal sheet")
        },
        modifier = Modifier.fillMaxSize(),
        sheetState = bottomState
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            scaffoldState = scaffoldState,
            bottomBar = { AppBottomBar() }
        ) { paddingValues ->
            Box(modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Main Content")
            }
        }
    }
}