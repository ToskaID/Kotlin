package DataClassesCollection

fun main() {

    val numList = listOf(1,2,3,4,5,6,7,8,9,10)
    println(numList)

    //filter()
    val filter = numList.filter { it % 2 == 0 }
    print(filter)
    println()

    //filterNot() mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan
    val filterNot = numList.filterNot { it % 2 ==0 }
    print(filterNot)
    println()

    /*
     Fungsi ini akan membuat collection baru sesuai perubahan yang akan
      kita lakukan dari collection sebelumnya
     */
    val multipliedBy5 = numList.map { it * 5 }
    print(multipliedBy5)
    println()

    //count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.
    println(numList.count())
    //dengan lamda dengan kondisi jumlah item kelipatan 3 yaitu 3,6,9
    println(numList.count(){it % 3 == 0})

    //sum
    val totalNum = numList.sum()
    println(totalNum)


    val num = listOf(3,6,1,4,2,7,5)

    //sorted ascendingSort
    val ascendingSort = num.sorted()
    println(ascendingSort)

    //descandingSort
    val descandingSort = num.sortedDescending()
    println(descandingSort)

}