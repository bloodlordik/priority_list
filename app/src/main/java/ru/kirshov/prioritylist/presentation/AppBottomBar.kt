package ru.kirshov.prioritylist.presentation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppBottomBar(
    showAddMenu: () -> Unit = {},
    showPageListMenu: () -> Unit = {},
    showSortMenu: () -> Unit = {},
    showEditPageMenu: () -> Unit = {}
) {
    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp),
        backgroundColor = Color.LightGray

    ) {
        IconButton(onClick = showPageListMenu) {
            Icon(
                Icons.Filled.List,
                contentDescription = null
            )
        }
        IconButton(onClick = showSortMenu) {
            Icon(
                Icons.Filled.MoreVert,
                contentDescription = null
            )
        }
        IconButton(onClick = showEditPageMenu) {
            Icon(
                Icons.Filled.KeyboardArrowUp,
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = showAddMenu) {
            Icon(
                Icons.Filled.Add,
                contentDescription = null
            )
        }
    }
}