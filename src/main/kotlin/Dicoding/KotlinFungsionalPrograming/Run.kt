package Dicoding.KotlinFungsionalPrograming

fun main() {

    val siswa1 = Siswa("mamat",89)
    val datasiswa = siswa1.run {
        "nama ane ${this.nama} dan umur ane ${this.age} \n"
    }
    println(datasiswa)
}