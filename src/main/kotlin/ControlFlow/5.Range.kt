package ControlFlow

fun main() {

    val range = 1..10
    for(data in range){
        print("$data ")
    }
    println()

    //down to
    val downto = 20.downTo(1) step 2
    downto.forEach {
        print("$it ")
    }
    println()

    //memeriksa apakah suatu nilai ada pada cakupan nilai Range.dengan in
    val oneToTen = 1.rangeTo(10)
    if(7 in oneToTen){
        println("Value 7 available")
    }

    /*
    memeriksa apakah suatu nilai tidak ada pada nilai cakupan Range tersebut.
    Kita bisa menggunakan kata kunci !in
     */
    if(11 !in oneToTen){
        println("No value 11 in range")
    }

    //bisa juga untuk tope data char
    val rangeChar = 'A'.rangeTo('Y') step 2
    rangeChar.forEach{
        print("$it ")
    }
}