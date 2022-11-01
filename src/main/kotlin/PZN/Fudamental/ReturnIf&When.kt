package PZN.Fudamental

fun main() {
    println(helloCok())
    println(helloCok("budi"))

}

fun helloCok(nama:String= ""):String{
    return if(nama == ""){
        "Hello Bro"
    }else{
        "Hello $nama"
    }
}

fun helloCok2(nama:String= ""):String{
    return when(nama){
      "" ->  "Hello Bro"
     else->"Hello $nama"
    }
}