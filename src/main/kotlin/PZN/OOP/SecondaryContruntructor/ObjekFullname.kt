package PZN.OOP.SecondaryContruntructor

fun main() {

    val fullName1 = FullName("Toska ","D ","Caprio")
    println(fullName1.firstName)
    println(fullName1.middleName)
    println(fullName1.lastName)
    println(fullName1.getFullname())

    val fullName2 = FullName("Asep ","Kurap ")
    print(fullName2.firstName)
    println(fullName2.middleName)

    val fullName3 = FullName("Fernandes",1999)
    println(fullName3.firstName)
}