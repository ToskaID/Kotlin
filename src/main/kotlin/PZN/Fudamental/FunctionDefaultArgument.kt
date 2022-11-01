package PZN

fun main() {

    hello("Toska"," DCaprio")
    hello("Joko")
    hello()
}

fun hello(firstName:String = "si paling gapunya nama",lastName:String? = null){
    when{
        lastName == null -> println("Hello $firstName")
        else -> println("Hello $firstName $lastName")
    }
}