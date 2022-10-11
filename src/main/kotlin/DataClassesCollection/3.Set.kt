package DataClassesCollection

fun main() {
    /*
    Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik. Ini akan berguna ketika
     Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection
     */

    val dataSet = setOf(1,3,1,3,4,3,3,4,5,2,'a')
    println(dataSet)

    val dataA = setOf(1,2,3)
    val dataB = setOf(3,2,1)
    val dataC = setOf(3,2,4,5)

    //saat membandingkan set tidak peduli dengan urutan data

    println(dataA == dataB)

    //melakukan pengecekan
    println(6 in dataA)

    //mengetahaui gabungan data(union)
    val union = dataA.union(dataC)
    println(union)

    //mengetahui irisan data(intersect)
    val intersect = dataA.intersect(dataC)
    println(intersect)

    //mutable
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}