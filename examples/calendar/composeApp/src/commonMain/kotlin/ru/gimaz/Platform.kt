package ru.gimaz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform