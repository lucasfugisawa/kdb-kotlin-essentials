package p10_extensionFunctions

fun String.isEmail() = "^[A-Za-z0-9+_.-]+@(.+)\$".toRegex().matches(this)

fun String.isCpf() = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}\$".toRegex().matches(this)

fun String.isCnpj() = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}\$".toRegex().matches(this)

fun String.isPhoneNumber() = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}\$".toRegex().matches(this)
