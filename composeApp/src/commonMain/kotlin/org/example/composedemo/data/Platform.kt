package org.example.composedemo.data

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform