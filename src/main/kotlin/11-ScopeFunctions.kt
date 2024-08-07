data class Address(
    var street1: String,
    var street2: String,
    var city: String,
    var state: String,
    var postalCode: String
)

fun main() {

    val address: Address = Address("x", "x", "x", "x", "x")

    address.street1 = "9801 Maple Ave"
    address.street2 = "Apartment 255"
    address.city = "Rocksteady"
    address.state = "IN"
    address.postalCode = "12345"
    println(address)

    // regular function, can't chain
    // -> grouping function calls on an object
    var resWith = with(address) {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
        println(this)
    }

    // scope function, can chain.
    // returns the result of the lambda
    // -> object configuration and computing the result
    // -> running statements where an expression is required: non-extension
    var resRun = address.run {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
        println(this)
    }

    // returns the result of the lambda
    // -> executing a lambda on non-null objects
    // -> introducing an expression as a variable in local scope
    var resLet = address?.let {
        it.street1 = "9801 Maple Ave"
        it.street2 = "Apartment 255"
        it.city = "Rocksteady"
        it.state = "IN"
        it.postalCode = "12345"
        println(it)
    }

    // returns the context object
    // -> additional effects
    var resAlso = address.also {
        it.street1 = "9801 Maple Ave"
        it.street2 = "Apartment 255"
        it.city = "Rocksteady"
        it.state = "IN"
        it.postalCode = "12345"
        println(it)
    }

    // returns the context object
    // -> object configuration
    var resApply = address.apply {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
        println(this)
    }

    // takeIf / takeUnless:
    println("takeIf / takeUnless")

    var resTakeIf = address.takeIf { it.state == "IN" }
    println(resTakeIf)

    var takeUnless = address.takeUnless { it.state == "IN" }
    println(takeUnless)

}
