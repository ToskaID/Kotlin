package KotlinFudamental

fun main() {

    dataUnt("syamsul","dikit lagi")

    println(data("Toska", 22))
    println(data2("udin",44))

}

//fungsi tanpa nilau kembali
fun dataUnt(nama:String,umur:String):Unit{
    println("My Name Is $nama, My Age $umur")
}

//fungsi dengan kemablian
fun data(nama:String,umur:Int):String{
    return "My Name Is $nama, My Age $umur"

}

//expresion body jika haya memiliki satu expresion
fun data2(nama:String,umur:Int) = "My Name Is $nama, My Age $umur"
