package Dicoding.ControlFlow

/*
While dan Do While sendiri tidak dapat digunakan untuk melakukan perulangan pada rentan angka.
Untuk melakukannya kita bisa menggunakan For Loop
 */

fun main() {

    /*
    While bersifat Entry Controlled Loop. Artinya, kondisi yang diberikan akan dievaluasi terlebih dahulu.
    Jika kondisi tersebut terpenuhi maka proses perulangan akan dijalankan.Jika kondisi yang diberikan tidak terpenuhi
    sejak awal maka proses perulangan tidak akan dijalankan.contoh jika counter = 8
     */

    var counter = 1
    while(counter <= 7){
        println("Hello Toska")
        counter++
    }
    println()

    /*
    do while Berbeda dengan While, Do While bersifat Exit Controlled Loop di mana proses perulangan
    akan langsung dijalankan di awal. Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.
     */
   var count= 1
    do{
        println("Hello Fernandes")
        count++
    }while(count <= 7)
}