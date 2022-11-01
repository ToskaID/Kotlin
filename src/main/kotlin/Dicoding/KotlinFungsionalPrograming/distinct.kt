package Dicoding.KotlinFungsionalPrograming

fun main() {

    //untuk menyaring item yang sama

    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()
    println(distinct)

    //Misal kita ingin menyaring item yang memiliki panjang sama
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy {
        it.length
    }

    println(distinct2)
}