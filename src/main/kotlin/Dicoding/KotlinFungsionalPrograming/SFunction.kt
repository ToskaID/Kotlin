package Dicoding.KotlinFungsionalPrograming

fun main() {

    val siswa1 = Siswa("mamat",89)

    //let
    val datasiswa = siswa1.let {
        "nama ane ${it.nama} dan umur ane ${it.age} \n"
    }
    println(datasiswa)

    //run
    val datasiswa2 = siswa1.run {
        "nama ane ${this.nama} dan umur ane ${this.age} \n"
    }
    println(datasiswa2)

    //apply
    val datasiswa3 = siswa1.apply {
        "nama ane ${this.nama} dan umur ane ${this.age} \n"
    }
    println(datasiswa3)

    //also
    val datasiswa4 = siswa1.also {
        "nama ane ${it.nama} dan umur ane ${it.age} \n"
    }
    println(datasiswa4)

    //with
    val datasiswa5 = with(siswa1) {
        "nama ane ${this.nama} dan umur ane ${this.age} \n"
    }
    println(datasiswa5)



}