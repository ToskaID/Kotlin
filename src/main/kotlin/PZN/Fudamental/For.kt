package PZN

fun main() {
   val array = arrayOf("Toska","D","Caprio","jhony","fernandes","bambang")

    val ukuranArray = array.size-1
    for (i in 0..ukuranArray){
        println("Index ke $i = ${array.get(i)}")
    }
}