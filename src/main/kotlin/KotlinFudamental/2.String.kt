package KotlinFudamental

fun main() {

    val name = "Toska"
    println("=== print string bedasarkan index ===")
    println(name)
    println(name[0])
    println()

    //iterasi pada string
    println("=== iterasi pada string ===")
    for(data in name){
        print("$data ")
    }
    println("\n")

    //escape string(menambhkan tanda "" pada string)
    //val statement = "Kotlin is "Awesome!""
    val statement = "Kotlin is \"Awesome!\""
    println("=== menambhkan tanda \"\" pada string ===")
    println(statement)
    println()


    //multiline
    println("=== Raw String ===")
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(line)

    //trimmargin
    println()
    println("=== Trim Margin ===")
    val lineline = """Line 1
               |Line 2
                    |Line 3
        |Line 4
    """.trimMargin()
    println(lineline)

}