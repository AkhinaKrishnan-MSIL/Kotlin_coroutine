package com.example.kotlin_coroutine


import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main()= runBlocking {
    println("main program starts: ${Thread.currentThread().name}")

    val job: Job =async(){   //create a background thread (worker thread)
        println("fake work starts: ${Thread.currentThread().name}")
        delay(1500)
        println("fake work ends: ${Thread.currentThread().name}")
    }
    job.join()
    println("main program ends: ${Thread.currentThread().name}")

}
