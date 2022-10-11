package KotlinFungsionalPrograming

fun main() {

    /*Named Argument
   Dengan cara seperti di atas, kita tidak perlu lagi menghafal posisi dari parameter jika
   ingin melampirkan sebuah argumen. Cukup hafalkan nama dari parameter tersebut.
    */
    println("====== Named Argument ======")
    val profile = getProfile(first = "Toska", last =  "D Caprio", age = 17 )
    val profile2 = getProfile(age = 17, last = "D Caprio", first = "Toska" )
    println(profile)
    println(profile2)
    println()

    /*DefaultArgument
    menentukan nilai default dari sebuah parameter. Jika kita melewatkan argumen untuk dilampirkan,
     maka nilai default tersebut lah yang akan digunakan.
     */
    println("====== Default Argument ======")
    val fullName = getFullname()
    val fullName2 = getFullname("Toska")
    println(fullName)
    println(fullName2)


}

fun getProfile(first:String, last:String, age:Int):String{
    return "$first $last $age"
}

fun getFullname(first: String = "Kotlin", middle:String = "Is", last: String = "Awesome"):String{
    return "$first $middle $last"
}