package PZN.Fudamental

fun main() {

    println(tailFactor(3))
    display(3)
}

tailrec fun display(num:Int){
    println(num)
    if(num > 0){
        display(num-1)
    }
}

tailrec fun tailFactor(num:Int,total:Int = 1):Int{
    return when(num){
        1->total
        else -> tailFactor(num-1, total * num)
    }
}