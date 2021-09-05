package ru.grandi.bambino.remembermeplease.ui.impl

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.grandi.bambino.remembermeplease.data.MockObject
import ru.grandi.bambino.remembermeplease.data.model.User

@ExperimentalFoundationApi
@Composable
fun ListUsers(
    users: List<User>,
    itemClick: (Int) -> Unit,
    state: LazyListState?
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        stickyHeader(null) {
            Text(text = "Их вскоре нужно поздравить")
        }
        items(users) { user ->
            ItemUser(user = user, itemClick = itemClick)
        }
    }
}

@Composable
fun ItemUser(
    user: User,
    itemClick: (Int) -> Unit
) {
    Column(
        modifier = Modifier.padding(
            horizontal = 12.dp,
            vertical = 8.dp
        )
    ) {
        Row(modifier = Modifier.padding(bottom = 8.dp)) {
            Text(text = user.name, Modifier.padding(end = 8.dp))
            Text(text = user.surname)
        }
        Text(text = user.dataBirthday.toString())
    }
}



@ExperimentalFoundationApi
@Preview
@Composable
fun ListUserPreview() {
    ListUsers(MockObject.mockUsers(), state = null, itemClick = { id -> click(id) })
}

fun click(id: Int) {

}
