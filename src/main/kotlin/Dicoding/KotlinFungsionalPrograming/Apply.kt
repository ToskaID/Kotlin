package Dicoding.KotlinFungsionalPrograming

fun main() {

    //run mirip dengan let tapi tidak ada parameter kata kunci this
    val siswa1 = Siswa("mamat",89)
    val datasiswa = siswa1.apply{
        "nama ane ${this.nama} dan umur ane $age \n"
    }
    println(datasiswa.toString())

    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}