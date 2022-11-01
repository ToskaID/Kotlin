package Dicoding.KotlinFungsionalPrograming

fun main() {
    //let ada paramater kata kunci it
    //tanpa let
    val siswa1 = Siswa("mamat",89)
    println("=== tanpa let ===")
    println("nama antum ${siswa1.nama}")
    println("umur antum ${siswa1.age}\n")

    //dengan let
    println("=== dengan let ===")
    siswa1.let {
        println("nama ane ${it.nama}")
        println("umur ane ${it.age} \n")
    }

    //let dengan kembalian
    println("=== let dengan kembalian  ===")
    val datasiswa = siswa1.let {
        "nama ane ${it.nama} dan umur ane ${it.age} \n"
    }
    println(datasiswa)




}