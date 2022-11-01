package Dicoding.KotlinFudamental

fun main() {

    val firsName = "Toska"
    val lastName = "D Caprio"
    val age = 17
    println("My Fulname is $firsName $lastName can be called $firsName, my age is $age ")

    /*
    Tidak hanya sampai disitu, Anda juga bisa menyisipkan sebuah expression ke dalam sebuah string template.
    Caranya, sisipkan expression ke dalam curly braces yang diikuti karakter $.
     */
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")

}