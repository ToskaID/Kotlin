package Dicoding.KotlinFudamental

fun main() {

    //conjungsi  / and (&&) bernilai true jika semua kondisi bernilai true
    val officeOpen = 7
    val officeClose = 16
    val now = 20

    val isOpen  = if(now >= officeOpen && now <= officeClose ){
        true
    }else{
        false
    }
    println("Office is open : $isOpen")

    //jadi sederhana
    val isOpenSederhana = now >= officeOpen && now <= officeClose
    println("Office is open : $isOpenSederhana")

    //disjungsi  / or (||) bernilai true jika salah satu kondisi bernilai true
    val isClose = now < officeOpen || now > officeClose
    println("Office is close : $isClose")

    //negasi / Not (!) kebalikan
    val sekarang  = 10
    val open = sekarang > officeOpen
    if(!open){
        println("Office is closed")
    }else{
        println("Office is open")
    }
}