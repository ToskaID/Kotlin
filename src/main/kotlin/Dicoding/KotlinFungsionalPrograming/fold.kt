package Dicoding.KotlinFungsionalPrograming

fun main() {

    val num = listOf(1,2,3)
    val fold = num.fold(10){current,item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println(fold)

    println("================================")
    val num2 = (1..3).toList()
    val fold2 = num2.fold(0){first, second ->
        println("first $first")
        println("second $second")
        println()
       first + second
    }
    println(fold2)

    println("================================")
    val indexx = 2
    val num3 = (1..5).toList()
    val fold3 = num2.foldIndexed(0){indexx,first, second ->
        println("first $first")
        println("second $second")
        println()
        first + second
    }
    println(fold3)

}