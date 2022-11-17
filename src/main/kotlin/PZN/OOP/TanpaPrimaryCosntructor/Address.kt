package PZN.OOP.TanpaPrimaryCosntructor

class Address{

    var dataStreet = ""
    var dataCity = ""
    var dataCountry = ""
    var dataPesan = ""



    constructor(street: String,city: String){
        dataStreet = street
        dataCity = city
    }

    constructor(street:String,city:String,country:String){
        dataStreet = street
        dataCity = city
        dataCountry = country
    }

    constructor(street:String,city:String,country:String,pesan:String)
            :this(street,city,country){
                dataPesan = pesan

    }
}