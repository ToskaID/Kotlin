package PZN.Fudamental

import Dicoding.KotlinFungsionalPrograming.factorial2

fun main() {

    println(factor(3))
}

fun factor(num:Int):Int{
    return when(num){
        1->1
        else -> num * factor(num-1)
    }
}

//tail func

