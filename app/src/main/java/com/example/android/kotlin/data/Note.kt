package com.example.android.kotlin.data

import java.util.Date

class Note {

    //variables needed
    //get set id
    var id = -1
    //get and set text
    var text: String? = null
    //get and set is pinned
    var isPinned = false
    //get and set date
    var createdAt = Date()
    //get and set update date
    var updatedAt: Date? = null
}
