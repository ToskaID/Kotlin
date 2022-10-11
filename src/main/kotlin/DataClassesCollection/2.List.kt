package DataClassesCollection

fun main() {


    //List  bersifat immutable alias jumlah dataya tidak bisa diubah.
    val number = listOf(1, 2, 3, 4)


    //mutable list jumlah dataya bisa berubah
    val any = mutableListOf(1, "dua", 3.0, null, true)

    //menambah item di akhir list
    any.add('t')
    //menambah item pada index ke 1
    any.add(1,"satu setengah")
    //mengubah nilai item pada index ke-5
    any[5] = false
    //mengahapus item pada index ke-4
    any.removeAt(4)

    for(data in any){
        print("$data, ")
    }

}