package p10_extensionFunctions


/**
 * Checks if the current string matches the pattern of a CPF (Cadastro de Pessoas Físicas),
 * which is the Brazilian individual taxpayer registry identification.
 *
 * A valid CPF number format is represented by XXX.XXX.XXX-XX where X is a digit.
 *
 * @return `true` if the string matches the CPF format, `false` otherwise
 */
fun String.isCpf() = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}\$".toRegex().matches(this)

/**
 * Checks if the string is a valid CNPJ format.
 *
 * The CNPJ (Cadastro Nacional da Pessoa Jurídica) is a Brazilian identification
 * number for companies, and it follows the pattern "00.000.000/0000-00".
 *
 * @return true if the string matches the CNPJ format, false otherwise.
 */
fun String.isCnpj() = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}\$".toRegex().matches(this)

/**
 * Checks if the string matches the pattern of a phone number in the format (XX) XXXX-XXXX or (XX) XXXXX-XXXX.
 *
 * @receiver The string to be checked.
 * @return `true` if the string is a valid phone number, `false` otherwise.
 */
fun String.isPhoneNumber() = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}\$".toRegex().matches(this)

/**
 * Checks if the given string is a valid email address.
 *
 * @return `true` if the string is a valid email address, `false` otherwise.
 */
fun String?.isEmail(): Boolean {
    return this != null && this.isNotEmpty() && "^[A-Za-z0-9+_.-]+@(.+)\$".toRegex().matches(this)
}

fun <T> T?.isNotNullDoMeuJeito(): Boolean = this != null
