package PZN

fun main() {
    println(sKaliDua(4))
    sHello("mamat")

}

//fungsi biasa
fun kaliDua(num:Int):Int{
    return num*2
}

fun hello(nama:String){
    println("Hello $nama")
}

//single expresion
fun sKaliDua(num:Int) = num * 2

fun sHello(nama:String) = println("Hello $nama")