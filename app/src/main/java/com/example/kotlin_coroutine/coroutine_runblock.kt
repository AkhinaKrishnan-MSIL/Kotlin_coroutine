package com.example.kotlin_coroutine
import kotlinx.coroutines.*

fun main()= runBlocking {
    println("main program starts: ${Thread.currentThread().name}")

    val jobDeferred: Deferred<String> =async{
        println("fake work starts: ${Thread.currentThread().name}")
        delay(1500)
        println("fake work ends: ${Thread.currentThread().name}")
        "Akhina Krishnan"
    }
    println("main program ends: ${Thread.currentThread().name}")
}
suspend fun myownsuspendfunction()
{
    delay(1000)
}
