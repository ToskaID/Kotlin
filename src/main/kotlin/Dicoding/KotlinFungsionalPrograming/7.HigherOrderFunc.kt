package Dicoding.KotlinFungsionalPrograming

fun main() {


    //langsung
    println(aritmatika(10,{ num: Int -> num + num }))

    //Dibikin varible lamda dlu
    val kali:(Int)-> Int = {num -> num * num}
    println(aritmatika(10,kali))

    //trailing lamda
    println(aritmatika(10){num:Int -> num - num})

    val pembagian = aritmatika(10) {num -> num / num}
    println(pembagian)

}

fun aritmatika(num : Int, hitung :(Int)-> Int): Int{
    val result = hitung(num)
    return result
}