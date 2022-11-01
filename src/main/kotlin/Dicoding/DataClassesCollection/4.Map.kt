package Dicoding.DataClassesCollection

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "Paris" to "Francis"
    )

    //cetak value panggil key
    println(capital["Jakarta"])

    //menampilkan semeua key yang ada pada map
    val mapKeys = capital.keys
    println(mapKeys)

    //menampilkan semua value yang ada pada map
    val mapValues = capital.values
    println(mapValues)

    /*
    Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa
     map yang digunakan adalah mutable.
     */

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("tambun","Bekasi")
    println(mutableCapital)

}