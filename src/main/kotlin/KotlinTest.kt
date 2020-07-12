fun main() {
    val java = JavaTest()
    val name:String? = java.name
    //null pointer security is supported
    print(name?.length)

    val a = 20
    val b = 20.5f
    val c = 20.5

   /* // Method One
    loadData(Imp())*/

    // Method Two
    loadData(object:KotlinReq{
        override fun onSuccess() {
            println("loaded successfully")
        }

    })
    load{
        println("$it")
    }
}

        //higher-order function 高阶函数
fun load(req:(String)->Unit){

}



fun loadData(req : KotlinReq){
    req.onSuccess()
}
interface KotlinReq {
    fun onSuccess();
}
        //Method One
class Imp : KotlinReq{
    override fun onSuccess() {
        println("loaded successfully")
    }

}

class KotlinClass(val name:String){
    fun show(){
        println("name is $name")
    }
}