package Dicoding.KotlinFungsionalPrograming

fun main() {
    println(2.kaliDua)

    val susan = Siswa(nama = "Susan",44)
    println(susan.tenYearsAgo)
    println(susan.upperName)


}

val Int.kaliDua:Int
    get() = this * 2

val Siswa.tenYearsAgo:String
    get() = "10 tahun lagi umur ane ${this.age+10}"

val Siswa.upperName:String
    get() = this.nama.toUpperCase()