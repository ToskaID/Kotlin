package PZN.OOP.Init



class Motor(val merk:String, val tahun:Int) {

    //initializer blok adalah kode yang akan dieksekusi
    //ketika konstruktor di panggil
    init {
        println("Motor $merk keluaran tahun $tahun")
    }
}