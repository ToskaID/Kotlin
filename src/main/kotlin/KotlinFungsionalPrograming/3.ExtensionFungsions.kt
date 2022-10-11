package KotlinFungsionalPrograming

fun main() {
    /*Ekstension Fungsion
    menambahkan fungsi pada tipe data yang sudah ada
     */

    10.printInt()
    println(10.plusThree())

    "Toska".hello()
    println("Toska".sayHello())

    val student = Student("Toska",18)
    student.say("Fernandes")

    /*
    extension properti
     */
    println(10.slice)
    println(student.upperName)
    println(student.ageX2)

}

fun Int.printInt(){
    println("value $this")
}

fun String.hello(){
    println("Hello $this")
}



//mengembalikan nilai
fun Int.plusThree():Int{
    return this + 3
}

fun String.sayHello():String{
    return "$this Salah Satu Programer Hebat Indonesia"
}


data class Student(val name:String, val age:Int)
fun Student.say(nama:String){
    println("Hello $nama,my name is ${this.name}, and my age ${this.age}")
}

//extension properti
val Int.slice :Int
    get() = this/2

val Student.upperName : String
    get() = this.name.toUpperCase()

val Student.ageX2:Int
    get() = this.age*2

