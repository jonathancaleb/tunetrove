package com.example.tunetrove

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform