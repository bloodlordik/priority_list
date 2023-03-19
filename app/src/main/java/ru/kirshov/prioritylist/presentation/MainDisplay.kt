@file:OptIn(ExperimentalMaterialApi::class)

package ru.kirshov.prioritylist.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.kirshov.prioritylist.domain.AppViewModel


@Composable
fun MainDisplay(viewModel: AppViewModel){
    BottomSheetScaffold(sheetContent = {}, modifier = Modifier.fillMaxSize()) { paddingValues ->
        Box(modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()){
            Text(text = viewModel.title())
        }        
        
    }
}