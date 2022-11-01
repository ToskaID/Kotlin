package Dicoding.KotlinFungsionalPrograming

fun main() {

    println("====tanpa lamda =====")
    println(hello())
    println(sayHello("kuproy \n"))

    println("====dengan lamda =====")
    helloLamda
    sayHelloLamda("kuproy2 \n")

    println("====lamda return =====")
    println(helloLamdaReturn("kuproy 3 \n"))

    println("====lamda  2 parameter =====")
    println(sayHello("nurul","andy"))

    println("====lamda dengan fungsi type =====")
    println(sum(2,3))

    println("====method reference =====")
    println(toUppercase("toska d caprio"))

    println("====lamda it =====")
    println(kaliDua(6))

    println(eventNumber)
}

//tanpa lamda

fun hello(){
    println("Hello From lamda")
}
fun sayHello(name:String):String{
    return "Hello $name"
}

//dengan lamda
val helloLamda = { println("Hello From lamda")}

val sayHelloLamda = { name:String -> println("Hello $name")}

//mengembalikan nilai
val helloLamdaReturn = {pesan:String -> "Hello $pesan"}

//mengembalikan nilai 2 parameter
val sayHello = {say : String, name:String -> "Hello $say , Saya $name muach"}

//lamda dengan fungsi type
val sum : (Int, Int) -> Int = {a,b -> a+ b}

//lamda it paramater harus cuman 1
val kaliDua:(Int)->Int ={it*2}

fun toUpper(value:String) : String = value.toUpperCase()
fun bilGenap(num:Int)= num % 2 == 0

//method reference
val toUppercase:(String) -> String = ::toUpper

val number = 1..10
val eventNumber = number.filter(::bilGenap)
