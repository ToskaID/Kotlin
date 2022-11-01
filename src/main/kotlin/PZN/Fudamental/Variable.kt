package PZN

//variable constant -> imutable data yang bisa di akses secara global/darimanapun
//biasya menggunakan UPPERCASE
const val NAMA = "Joni"
const val  AGE = "17"

fun main() {

    //nullable
    var say:String? = null
    println(say)

    say = "dataya ada"
    println(say)

    //nullable dengan elvis
    val name:String? = null ?: "dataya nul bos"
    println(name)

    //consval
    println("My name is $NAMA, my Umur is $AGE")
}