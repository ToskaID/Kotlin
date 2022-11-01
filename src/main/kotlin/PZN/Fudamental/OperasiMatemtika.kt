package PZN

fun main() {

    //biar hasilya real decimal salah satu bilanagan harus bertipe float/double
    val bagi = 10f / 3
    println(bagi)

    //kotlin sudah scientific
    val result = 10 + 10 / 2
    println(result)

    //augmented assigment(+=, -=, *=, /=, %=)
    var total = 0

    val barang1 = 100
    total += barang1

    val barang2 =200
    total += barang2
    println(total)

    //unary operator
    total++
    println(total)//total = total + 1
    total--
    println(total) //total = total - 1

    val suhu = -5 //negatif
    println(suhu)

    //boolean kebalikan (NOT / negasi)
    val sehat = true
    println(!sehat)


}