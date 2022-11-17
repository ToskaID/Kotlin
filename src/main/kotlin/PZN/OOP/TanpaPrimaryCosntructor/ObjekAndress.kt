package PZN.OOP.TanpaPrimaryCosntructor

fun main() {

    val address1 = Address("Jl Ampass, ","kota bangol, ","neagara koli")
    val address2 = Address("JL Rusak Ampas, ","kota Tambun")
    val address3 = Address("JL Rusak Ampas, ","kota Tambun","neagara koli","Beneren donk")



    print(address1.dataStreet)
    print(address1.dataCity)
    println(address1.dataCountry)

    print(address2.dataStreet)
    println(address2.dataCity)

    println(address3.dataPesan)
}