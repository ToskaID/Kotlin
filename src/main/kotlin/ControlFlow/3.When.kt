package ControlFlow

fun main() {

    val value = 3
    when (value){
        1-> println("value is 1")
        2-> println("value is 2")
        3-> println("value is 3")
    }
    println()

    //when expresion dengan 2 data yang dikembalikan
    val value2 = 6
    val dataValue2 = when(value2){
        4->{
            println("four")
            "value is 4"
        }
        5->{
            println("five")
            "value is 5"
        }
        6->{
            println("six")
            "value is 6"
        }
        else->{
            println("undefined")
            "value cannot be reached"
        }
    }
    println(dataValue2)
    println()

    //memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is
    val data : Any = 100L
    when(data){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a string type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
    println()

    //memeriksa nilai yang terdapat pada sebuah Range atau Collection dengan in & !in
    val nilai = 56
    val range = 0..80
    when(nilai){
        in range-> println("value is in the range")
        !in range-> println("value is outside the range")
        else -> println("value undefined")
    }

}