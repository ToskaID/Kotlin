package Dicoding.KotlinFudamental

fun main() {

    val openHours = 7
    val now = 8
    val sekarang = 3
    val office :String
    val toko:String

    if (now > openHours){
        println("Office Already Open")
    }

    //memsukan nilai ke variable wajib pake else
    if (now > openHours){
       office = ("Office Already Open")
    }else{
        office = ("Office is closed")
    }
    println(office)


//  memsukan  ke variable wajib pake else
    toko = if (sekarang > 7) {
        "Office already open"
    } else if (sekarang == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    print(toko)



}