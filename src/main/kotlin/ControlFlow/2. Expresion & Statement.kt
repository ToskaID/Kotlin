package ControlFlow

/*
statement tidak mengembembaliakan nilai
contoh lain dari statement inisiasi variable contoh val a = 2
expresion menegembalikan nilai
 */
fun main() {

    //contoh if statemrnt
    val openOffice = 7
    val now = 8

    if(now > openOffice)
        println("Office already open")
    else
        println("office close")

    //contoh if expresion karena if akan mengembalikan nilai kedalem variable office
    val office = if(now > openOffice) "Office already open" else "office close"
    println(office)

    //expresion dalam expresion
    //expresion 1 (value1 + value2)
    //expresion 2 (4*2)
    println(sum(2,4*2))

}

fun sum(value1 : Int, value2:Int) = value1 + value2