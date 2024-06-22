package com.app.tunetrove.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NotificationAction(
    val first: String,
    val second: String
    )
