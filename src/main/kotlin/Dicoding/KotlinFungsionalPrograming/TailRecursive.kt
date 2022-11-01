package Dicoding.KotlinFungsionalPrograming

fun main() {

    fun display(n :Int) {
        println("Rekursive $n")
        if(n > 0){
            display(n-1)
        }
    }
    display(5)
    println()

    println(factorialTail(5))
}

tailrec fun factorialTail(n:Int,total:Int = 1):Int{
    return when(n){
        1->total
        else-> factorialTail(n-1,total * n)
    }
}

