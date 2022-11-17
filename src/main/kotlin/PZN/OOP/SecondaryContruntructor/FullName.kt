package PZN.OOP.SecondaryContruntructor

class FullName(val firstName: String,  val middleName:String, val lastName:String ) {


    fun getFullname():String{
        return "$firstName $middleName $lastName"
    }

    var angka = 0
    //untuk menulis kode program apapun
    init {
        println("pala bapak kau lah")
    }





    constructor(firstName: String,  middleName: String) : this(firstName,middleName,""){


    }

    constructor(fisrtName:String,angka:Int):this(fisrtName,""){


    }

}