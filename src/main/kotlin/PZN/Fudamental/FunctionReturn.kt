package PZN

fun main() {

    println(genapGanjil(2))
    println(ifGanjilGenap(3))
}

fun genapGanjil(num:Int):String{
  when{
      num % 2 == 0 -> return "$num adalah bilangan genap"
      num % 2 == 1 -> return "$num adalah bilangan ganjil"
      else -> return ""
  }
}

fun ifGanjilGenap(num:Int):String{
    if (num % 2 == 0 ){
        return "$num adalah bilangan genap"
    }
    else if(num % 2 == 1){
        return  "$num adalah bilangan ganjil"
    }
    else return ""
}