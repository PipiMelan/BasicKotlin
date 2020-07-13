package ifCondition

fun main() {

    //The Question Mark expression
    // 2>1?:a:b
    // Null Judgement Expression 判空表达式
    //   a  ?:  b
    var school = "SouthWestern University"
    //var name = MyClass.getName()

    /*We can make the return value as null in Java and use it here*/
    //

    var result = school.length ?: "Empty"
    //var result1 = name ?: "Empty" //->NullPointerException

}

fun Test1(){
    var num = 20

    if (num > 10) {

    } else {

    }

    /* In Kotlin , if else is a Expression - > Result */
    val result = if(num > 10) 20 else "10"


    // The type of final return contents will be the final result of this expression
//    val result = if( num > 10){
//        println("$num > 10")
//        20
//    }else{
//        println("$num < 10 ")
//        “Failure”
//    }

    var temp:Int = 0
    var name:String
    if(1>0){
        temp = 20
    }else{
        name = "name"
    }

}