open class Operations(){

     public var ProcessName : String? = null
    //protected var ProcessName : String? = null
    //private var ProcessName : String? = null

    open fun sum(n1 : Int, n2 : Int) : Int{
        return n1+n2
    }

    fun div(n1: Int, n2 : Int) : Int{
        return n1/n2
    }
}

class MultiOperations():Operations(){

    fun sub(n1 : Int, n2 : Int) : Int{
        return n1-n2
    }

    fun mul(n1 : Int, n2 : Int) : Int{
        return n1*n2
    }

    fun GetName(){
        super.ProcessName  //super refers to access method of parent class
                           //can call if ProcessName var is public/protected, but not private
    }
}

fun main(args : Array<String>){

    var operation = Operations()
    var sum = operation.sum(2,3)
    println("sum : $sum")

    var div = operation.div(4,2)
    println("div : $div")

    println("operation.ProcessName : " + operation.ProcessName)  //can call bec ProceeName var is public
                                                                 //compile time error if ProcessName var is protected
    var operation2 = MultiOperations()
    var sub = operation2.sub(2,3)
    println("sub : $sub")
     
    var mul = operation2.mul(3,4)
    println("mul : $mul")
}
