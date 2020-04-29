fun main() {
    numericTypeDemo()
    booleanTypeDemo()
    characterTypeDemo()
    stringTypeDemo()
}

fun numericTypeDemo() {
    val inferredInt = 10;
    println("inferredInt $inferredInt")

    val explicitInt: Int = 10;
    println("explicitInt $explicitInt")

    val longNumber = 10L; // just add L after the number
    println("longNumber $longNumber")

    val oneMillionWithUnderscores = 1_000_000
    println("oneMillionWithUnderscores $oneMillionWithUnderscores")

    val explicitByte: Byte = 127;
    println("explicitByte $explicitByte")

    val explicitShort: Short = 32767
    println("explicitShort $explicitShort")

    val inferredDouble = 123.10;
    println("inferredDouble $inferredDouble")

    val explicitFloat = 123.10F;
    println("explicitFloat $explicitFloat")
}

fun booleanTypeDemo() {
    val n1 = 10
    val n2 = 5

    val trueResult = n1 > n2
    val falseResult = n2 < n2

    println("trueResult: $trueResult")
    println("falseResult: $falseResult")
    println("trueResult OR falseResult: ${trueResult || falseResult}") //true
    println("trueResult AND falseResult: ${trueResult && falseResult}") //false
    println("falseResult OR falseResult: ${falseResult || falseResult}") //false
    println("falseResult AND falseResult: ${falseResult && falseResult}") //false
}

fun characterTypeDemo() {
    val letter: Char = 'a'
    println("letter 'a': $letter")

    val dollarSign = '\$'
    println("dollarSign '\\$': $dollarSign")

    val infinitySign = '\u221E'
    println("infinitySign '\\u221E': $infinitySign")
}

fun stringTypeDemo() {
    val userName: String = "Aline"
    println("userName: $userName")

    val interpolatedString = "Welcome $userName"
    println("interpolatedString (\"Welcome $userName\"): $interpolatedString")

    val userNameLength: Int = userName.length
    println("userNameLength (.length): $userNameLength")

    val userNameSubSequence = userName.subSequence(0, 2)
    println("userNameSubSequence (.subSequence(0, 2)): $userNameSubSequence")

    val rawString = """
    |I can have special characters $&%#
    |New lines
    
    
    |And so on...
    """
    println("rawString: $rawString")
}
