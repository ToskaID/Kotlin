package Dicoding.KotlinFungsionalPrograming

fun main() {

    println(factorial(4))
    println(factorial2(4))
}

fun factorial(n:Int):Int{
    return if (n==1){
        n
    } else{
        n * factorial(n-1)
    }
}

fun factorial2(n:Int):Int{
    return when(n){
        1->1
        else -> n * factorial2(n-1)
    }
}

