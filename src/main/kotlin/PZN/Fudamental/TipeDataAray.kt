package PZN

fun main() {

    //array cuman bisa RU (read dan update)

    val arrayString :Array<String> = arrayOf("Toska","Fernandes","jony")
    val arrayInt :Array<Int> = arrayOf(1,6,7,9)
    val arrayCampuran:Array<Any> = arrayOf("Jony", 3 ,true)

    //mendapakatkan panjang array
    println(arrayCampuran.size)
    println()

    //mengambil data bedasarkan index
    println(arrayString[0])
    println(arrayInt.get(3))
    println()

    //mengubah data bedasarkan index
    arrayString.set(1,"Bambang")
    arrayInt[0] = 9
    println(arrayString[1])
    println(arrayInt[0])
    println()

    //array nullable
    val name:Array<String?> = arrayOfNulls(5)
    name.set(0,"Toska")
    name.set(1,null)
    name.set(2,"D")
    name.set(3,null)
    name.set(4,"Caprio")
    name.set(5, null)

}