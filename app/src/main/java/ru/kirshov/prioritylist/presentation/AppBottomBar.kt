package ru.kirshov.prioritylist.presentation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppBottomBar(){
        BottomAppBar(modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Open shhet")
            }
        }
}