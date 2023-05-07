package com.dox.friends

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dox.friends.data.Datasource
import com.dox.friends.model.Friend
import com.dox.friends.ui.theme.FriendsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FriendsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FriendApp()
                }
            }
        }
    }
}


@Composable
fun FriendApp(){
    FriendsTheme{
        FriendList(friendList = Datasource().loadFriends())
    }
}

@Composable
fun FriendList(friendList: List<Friend>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(friendList) { friend ->
            FriendCard(friend)
        }
    }
}


@Composable
fun FriendCard(friend: Friend, modifier: Modifier = Modifier){
    Card(modifier = Modifier.padding(8.dp),
    elevation = 4.dp) {

        Column {
            Image(
                painter = painterResource(id = friend.imageResourceId),
                contentDescription = stringResource(
                    id = friend.stingResourceId
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = friend.stingResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6
            )

        }
    }
}


@Preview
@Composable
private fun FriendCardPreview() {
    FriendCard(Friend(R.string.friend1, R.drawable.image1))
}