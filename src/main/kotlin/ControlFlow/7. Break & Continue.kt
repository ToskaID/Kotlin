package ControlFlow

/*
Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya.
Sementara itu, Break digunakan untuk menghentikan proses iterasi.
 */

fun main() {

    //continue
    val list = listOf(1,2,3,null,5,null,7)
    for(i in list){
        if (i == null)
            continue
            print("$i ")
    }
    println()

    //break
    for(i in list){
        if(i == null)
            break
        print("$i ")
    }


}