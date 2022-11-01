package Dicoding.KotlinFungsionalPrograming

fun main() {

    val siswa = Siswa("agus",99)
    println(siswa.sayGodBye("joko"))


}

fun Siswa?.sayGodBye(name:String):String{
    return "GoodBye $name, my name is ${this?.nama} "
}