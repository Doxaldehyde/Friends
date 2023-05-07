package com.dox.friends.data

import com.dox.friends.R
import com.dox.friends.model.Friend

/**
 * [Datasource] generates a list of [Friend]
 */

class Datasource() {
    fun loadFriends(): List<Friend>{
        return listOf<Friend>(
            Friend(R.string.friend1, R.drawable.image1),
            Friend(R.string.friend2, R.drawable.image2),
            Friend(R.string.friend3, R.drawable.image3),
            Friend(R.string.friend4, R.drawable.image4),
            Friend(R.string.friend5, R.drawable.image5),
            Friend(R.string.friend6, R.drawable.image6),
            Friend(R.string.friend7, R.drawable.image7_),
            Friend(R.string.friend8, R.drawable.image8),
            Friend(R.string.friend9, R.drawable.image9),
            Friend(R.string.friend10, R.drawable.image10),
           // Friend(R.string.friend11, R.drawable.image11),
          //  Friend(R.string.friend12, R.drawable.image12),
          //  Friend(R.string.friend13, R.drawable.image13),
          //  Friend(R.string.friend14, R.drawable.image14),
          //  Friend(R.string.friend15, R.drawable.image15),
           // Friend(R.string.friend16, R.drawable.image16),
           // Friend(R.string.friend17, R.drawable.image17),
            //Friend(R.string.friend18, R.drawable.image18),
           // Friend(R.string.friend19, R.drawable.image19),
          //  Friend(R.string.friend20, R.drawable.image20),
          //  Friend(R.string.friend21, R.drawable.image21),
          //  Friend(R.string.friend22, R.drawable.image22),
          //  Friend(R.string.friend23, R.drawable.image23),
        //    Friend(R.string.friend24, R.drawable.image24))
        ) }
}