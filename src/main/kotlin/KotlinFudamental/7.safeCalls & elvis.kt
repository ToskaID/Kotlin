package KotlinFudamental

fun main() {

    //nullable type
    val text:String? = null

    //safe call
    println(text?.length)

    //elvis operator memberi nilai default jika data null
    println(text?.length ?: 77)
}