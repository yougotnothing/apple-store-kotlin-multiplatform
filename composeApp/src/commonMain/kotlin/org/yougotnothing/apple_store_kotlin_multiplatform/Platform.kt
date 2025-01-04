package org.yougotnothing.apple_store_kotlin_multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform