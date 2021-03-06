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
    val num : String =jobDeferred.await()
    //jobDeferred.join()
    println("main program ends: ${Thread.currentThread().name}")
}
