package Dicoding.KotlinFungsionalPrograming

fun main() {

    val char = ('A'..'Z').toList()

    println(char.take(3))
    println(char.takeLast(3))
    println(char.takeWhile { it < 'F' })
    println(char.takeLastWhile { it > 'W' })
    println()
    println(char.drop(23))//menghapus 23 element di awal / depan
    println(char.dropLast(23))//menghapus 23 element di akhir/belakang jadi
    println(char.dropWhile { it <  'X' })//menghapus element dari awal sampai > x
    println(char.dropLastWhile { it > 'C' })//menghapus element dari akhir sampai > c


}