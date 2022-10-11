package KotlinFungsionalPrograming

import ControlFlow.sum

fun main() {
    /*
    Dengan  vararg sebuah fungsi dapat memiliki jumlah parameter berdasarkan jumlah
     argumen yang kita masukkan ketika fungsi tersebut dipanggil..syarat hanya memiliki 1 parameter
     */

    val number1 = sumNum(20,90,12,31,41,55,66)
    val number2 = sumNum(1,2)
    println(number1)
    println(number2)

    val number3 = sizeNum(20,90,12,31,41,55,66)
    val number4 = sizeNum(1,2)
    println(number3)
    println(number4)

    //vararg ditmabah parameter biasa, posisi vararg harus berada di paling akhir jika
    //tidak harus menggunakan named argument
    val data = age("toska",2,4,5,1,3,12,3)
    println(data)


}

fun sumNum(vararg num:Int):Int{
    return num.sum()
}
fun sizeNum(vararg num:Int):Int{
    return num.size
}

fun age(name:String, vararg num:Int):String{
    return "$name, ${num.sum()}"
}