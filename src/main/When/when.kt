package When

import com.sun.jdi.IntegerType

fun main() {
    val num = 20

    // More concise than switch sentence
    when(num){
        10 -> println("10")
        20 -> println("20")
        30 -> println("30")
        else -> println("Rests")
    }

    // More flexible
    when(num){
        in 1..10 -> println("z")
        in 11..20 -> println("y")
        in 21..30 -> println("x")
    }

    // More convenient
    val result = when(num){
        10 -> 'A'
        20 ->'B'
        30 ->'C'
        else -> "Rests"
    }
    println("result = $result")

    var temp = "jack"
    when(temp){
        /*in java we use instnceof(temp) to judge its type*/
        is String -> println("It is a character String")
        else -> println("Error")
    }
}