package KotlinFungsionalPrograming

fun main() {

    mess("Hello Afrika")
    println(messagge("Hello From zimbagwe"))
    println(sayHello("nurul","andy"))
}

val mess = {pesan:String-> println(pesan)}

//mengembalikan nilai
val messagge = {pesan:String -> pesan}

//mengembalikan nilai 2 parameter
val sayHello = {say : String, name:String ->
    val result = "Hello $say , Saya $name muach"
    result
}