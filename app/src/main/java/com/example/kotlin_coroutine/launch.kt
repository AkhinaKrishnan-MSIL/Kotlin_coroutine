package com.example.kotlin_coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("1. Let's begin")
    runBlocking {
        launch {
            delay(1000)
            println("3. coroutine ONE")
        }

        launch {
            delay(500)
            println("2. coroutine TWO")
        }
    }

    println("4. Only when the children inside runBlocking complete, execution follows on this line")
}