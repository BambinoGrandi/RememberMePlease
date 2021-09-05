package ru.grandi.bambino.remembermeplease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import ru.grandi.bambino.remembermeplease.data.MockObject
import ru.grandi.bambino.remembermeplease.ui.impl.ListUsers
import ru.grandi.bambino.remembermeplease.ui.theme.RememberMePleaseTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RememberMePleaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ListUsers(users = MockObject.mockUsers(), itemClick = { id -> click(id) }, null)
                }
            }
        }
    }

    fun click(id: Int) {

    }
}
