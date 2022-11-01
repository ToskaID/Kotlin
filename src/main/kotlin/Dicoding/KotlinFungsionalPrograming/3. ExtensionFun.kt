package Dicoding.KotlinFungsionalPrograming

fun main() {

//extesnsion fungsion yaitu menambahakan fungsi baru didalam sebuah tipe data / objkek
// tanpa harus membuat objek baru

    //menambahakan fungsi print umur dari tipe data integer
    println(10.umurAntum())

    //menambahakan fungsi sayHello dari objek student
    val student = Siswa("fernandes",18)
    println(student.sayHello("Abdul"))


}

fun Int.umurAntum():String{
    return "umur antum $this abad"
}

//Extension fungsion bukanlah function di dalam class(helper function)
//data tidak bisa diakses jika private atau protect(contoh nama || age ya di private / protec jadi gbisa)

class Siswa(val nama:String,   val age:Int)

fun Siswa.sayHello(name:String):String{
    return "Hello $name, my name is ${this.nama} dan umur ane ${this.age} bulan"
}
