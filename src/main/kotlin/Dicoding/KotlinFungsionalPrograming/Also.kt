package Dicoding.KotlinFungsionalPrograming

fun main() {

    val text = "Hello Kotlin"

    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")

    val siswa1 = Siswa("mamat",89)
    val datasiswa4 = siswa1.also {
        "nama ane ${it.nama} dan umur ane ${it.age} \n"
    }
    println(datasiswa4)
}