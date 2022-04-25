package com.example.kotlin_coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main ()
{
    println("main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch{   //thread one
        println("fake work starts: ${Thread.currentThread().name}")
       delay(1500) //coroutine is suspended but thread is working
        println("fake work ends: ${Thread.currentThread().name}")// this will execute thread one or some other thread
    }
    runBlocking {//create a coroutine that block the current main thread
        delay(2000) //waiting for coroutine to finish
    }

    println("main program ends: ${Thread.currentThread().name}")
}