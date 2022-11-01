package PZN

fun main() {

    val finalExam = 'B'
    when(finalExam){
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("not badd")
        else -> println("Lol")
    }

    val exam = 'A'
    when(exam){
        'A'->{
            println("Amazing")
        }
        'B'->{
            println("Good")
        }
        'C'->{
            println("not bad")
        }else->{
        println("Lol")
        }
    }

    //when multiple expresion
    val latihan = 'C'
    when(latihan){
        'A','B','C' ->{
            println("Oke Pass")
        }else->{
        println("not pass")
        }
    }

    //when expresion in
    val quiz = 'E'
    val passValue = arrayOf('A','B','C')
    when(quiz){
        in passValue -> println("Pass")
        !in passValue -> println("Not Pass")
    }

    //when expresion is mengecek
    val nama = "toska"
    when(nama){
        is String -> println("This is string")
        !is String -> println("this is not string")
    }

    //when pengganti if expresion
    val nilai = 91
    when{
        nilai > 90 -> println("Amazing")
        nilai > 80-> println("Good")
        nilai > 70-> println("not badd")
        else -> println("Lol")
    }
}