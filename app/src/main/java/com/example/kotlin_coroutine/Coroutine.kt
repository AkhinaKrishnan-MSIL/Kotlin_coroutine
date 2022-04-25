package com.example.kotlin_coroutine

import kotlin.concurrent.thread

fun main ()             //excecute in main thread
{
    println("main program starts: ${Thread.currentThread().name}")
    thread {   //create a background thread (worker thread)
        println("fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1500)
        println("fake work ends: ${Thread.currentThread().name}")
    }

    println("main program ends: ${Thread.currentThread().name}")
}

