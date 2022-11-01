package PZN

fun main() {

    println("Joko".hello())
    println("Andy muach".sayHello("nurul"))

}

fun String.hello():String = "Hello $this"
fun String.sayHello(nama:String):String = "Hello $nama, nama ane $this"