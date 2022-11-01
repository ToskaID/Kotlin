package PZN

fun main() {

    val range = 1..10

    //count mendapatkan total data di range
    println(range.count())
    println()

    //countains mengecek apadakah terdapat value tersebut di range
    println(range.contains(10))
    println(range.contains(11))
    println()

    //first mendapatkkan nilai pertama
    //last mendapat nilai terakhir
    println(range.first)
    println(range.last)
    println()

    ////step mendapat nilai kenaikan
    println(range.step)
    println()

    //range terbalik
    val rangeTerbalik = 10 downTo 0
    for (data in rangeTerbalik){
        print("$data ")
    }


    //range dengan step
    val rangeStepGenap  = 2..10 step 2
    for (genap in rangeStepGenap){
        print("$genap ")
    }
}