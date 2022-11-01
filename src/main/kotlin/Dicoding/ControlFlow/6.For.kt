package Dicoding.ControlFlow

fun main() {

    val num = 1..5
    for(data in num){
        print("$data ")
    }
    println()

    //mengakses indeks untuk setiap elemen yang ada pada Ranges dengan memanfaatkan fungsi withIndex()
    val range = 1..10 step 3
    for((index, value ) in range.withIndex()){
        println("value $value with index $index")
    }
    println()

    //dengan forEach
    val range2 = 11..20 step 3
    range2.forEachIndexed{index, data ->
        println("value $data with index $index")
    }

    println()
    //cuman ambil nilai index doang
    range2.forEachIndexed{index, _ ->
        println("index $index")
    }
}