package `Variable Definition`

fun main() {
    //var - Variable definition
    //val - Constant definition

   /*  In Java ,we define a constant through final    */

    //Method One - Point out the type when defining
    val pi = 3.14 // - type can be inferred automatically
    //val pi : Double = 3.14


    var a = 3
    val b = 3.14
    //a = b - This can't work - Different type can't exchange directly

    /*In java , the short type can transform to long type*/

    //SO we need to use the corresponding method to exchange them
    a = b.toInt()
    //b = a.toDouble()






}