package PZN

fun main() {

    //petik 2 hanya satu baris
    val toska = "TOSKA"
    println(toska)
    println()

    //petik 3 bisa lebih dari 1 baris
    val personal = """
        |My name is toska
        |umur ane 23 tahun
        |hoby ane bulu tangkis and renang
    """.trimMargin()
    println(personal)
    println()

    //string template
    val firstName = "Tos"
    val lastName = "Ka"
    val fulName = "$firstName $lastName"
    val des= "$firstName $lastName lenght ${fulName.length}" //lenght spasi di itung
    println(fulName)
    println(des)


}