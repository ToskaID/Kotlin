package Dicoding.KotlinFungsionalPrograming

fun main() {

    val num = (1..20).toList()

    val list1 = num.slice(1..9)
    println(list1)

    val list2 = num.slice(1..20 step 2)
    println(list2)


    val list3 = num.slice(10 downTo 2 step 2)
    println(list3)

    val index = listOf(2,3,5)
    val list4 = num.slice(index)
    println(list4)
}