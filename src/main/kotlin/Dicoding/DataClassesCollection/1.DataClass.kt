package Dicoding.DataClassesCollection

fun main() {

    val user = User("Toska",17)
    val dataUser = DataUser("Toska",17)
    val dataUser2 = DataUser("Toska",17)
    val dataUser3 = DataUser("Toska",19)

    println("======Perbedaan class dan dataClass saat print======")
    println(user)
    println(dataUser)
    println()

    //equals dataclass (membandimgkan apa data sama)
    println("======equals dataclass (membandingkan apa data sama)======")
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println()

    //menyalin dan memodifikasi data class
    println("======menyalin dan memodifikasi data class======")
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 22)
    println(dataUser4)
    println(dataUser5)
    println()

    //Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel.
    println("======Destructuring Declaration======")
    val data = DataUser("Toska",17)
    val nama = data.component1()
    val age = data.age
    println("My name is $nama, umur ane $age")
    println()

    //dataClass Fungsi
    println("======Dataclass fungsi======")
    val dataPegawai = DataPegawai("fernandes",24,"Senior Developer")
    dataPegawai.intro()

    val sum = Sum(4,4)
    sum.hitung()


}

class User(val name:String, val age:Int)
data class DataUser(val name:String, val age:Int)
data class DataPegawai(val nama:String, val umur:Int,val jabatan:String){
   fun intro(){
       println("Nama Abdi $nama , umur abdi $umur, dan jabatan abdi $jabatan")
   }
}
data class Sum(val n1:Int,val n2:Int){
    fun hitung(){
        println("hitung $n1 + $n2 =  ${n1+n2}")
    }
}


