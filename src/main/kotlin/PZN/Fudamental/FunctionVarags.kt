package PZN

fun main() {

    println(hitungTotal(2,3,4,1,5,2))
}

fun hitungTotal(vararg num:Int):Int{
    var total = 0
    for (data in num){
        total += data
    }
    return total
}