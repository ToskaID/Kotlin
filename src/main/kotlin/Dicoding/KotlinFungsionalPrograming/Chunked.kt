package Dicoding.KotlinFungsionalPrograming

fun main() {
    //memotong collection menjadi beberapa colection
    val number = (1..20).toList()

    val list1 = number.chunked(5)
    println(list1)

    val list2 = number.chunked(5){values ->
        var total = 0
        for (value in values){
            total += value
        }
        total
    }
    println(list2)
}