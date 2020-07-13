fun main() {
    /*for(int i = 10;i <100;i++)*/
    for(i in 1..10){
        println("$i")
    }
    //1-10
    for(i in 1 until 10){
        println("$i")}
    //1-9

    // Use step to change the increment(增量)
    for(i in 1..10 step 2){
        /*Java: for(int i=0;i<10;i+=2){}*/
//    for(i in 1..10 step 3)
//    for(i in 1..10 step 4)
        println("$i")
    }

    /*for(int i=10;i>0;i-=2){}*/
// This doesn't work
//    for(j in 10..1 step 2){
//        println("$j")
//    }
    // Use downTo to decrease progressively(递减)
    for(j in 10 downTo 1 step 2){
        println("$j")
    }

    val names = arrayOf("Jack","Merry","Rose")
    for(i in 0 until names.size){
        //println(names[i])
    }
    for(item in names){
        //println(item)
    }

    // Get the corresponding index value
    for(i in names.indices){
        println(names[i])
    }


    //Get teh index value and corresponding contents
    for((index,item) in names.withIndex()){
        println("$index - $item")
    }
}