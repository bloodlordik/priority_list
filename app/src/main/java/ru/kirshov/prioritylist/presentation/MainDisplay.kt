@file:OptIn(ExperimentalMaterialApi::class)

package ru.kirshov.prioritylist.presentation

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import ru.kirshov.prioritylist.domain.AppViewModel


@Composable
fun MainDisplay(viewModel: AppViewModel) {
    val bottomState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scaffoldState = rememberScaffoldState()
    val modalState by viewModel.modalState.collectAsState()
    LaunchedEffect(key1 = modalState){
        if (modalState){
            bottomState.show()
            //loh pidr
        }

    }
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
            bottomBar = { AppBottomBar(
                showAddMenu = viewModel::showAddMenu,
                showEditPageMenu = viewModel::showEditMenu,
                showPageListMenu = viewModel::showListPageMenu,
                showSortMenu = viewModel::showSortMenu
            ) }
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