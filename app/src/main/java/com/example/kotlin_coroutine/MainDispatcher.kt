package com.example.kotlin_coroutine

import android.util.Log
import kotlinx.coroutines.*

fun main ()
{
    println("main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch(Dispatchers.Default) //IO,Main
    {   //create a background coroutine with background thread
        println("fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1500)
        println("fake work ends: ${Thread.currentThread().name}")
    }
    //block the current main thread and wait coroutine to finish
    Thread.sleep(2500)

    println("main program ends: ${Thread.currentThread().name}")
}







