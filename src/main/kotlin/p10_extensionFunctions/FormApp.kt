package p10_extensionFunctions

fun main() {

    val emailValido = "lucasfugisawa@gmail.com".isEmail()
    println(emailValido)

    val phoneNumberValido = "16 91234-5678".isPhoneNumber()
    println(phoneNumberValido)

}