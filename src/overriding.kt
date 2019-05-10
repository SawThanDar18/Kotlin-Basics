open class Operations1(){

    open fun sum(n1 : Int, n2 : Int) : Int{
        return n1+n2
    }

    fun div(n1: Int, n2 : Int) : Int{
        return n1/n2
    }
}

class MultiOperations1():Operations(){

    override fun sum(n1 : Int, n2 : Int) : Int{
        return n1+n2*3
    }

    fun sub(n1 : Int, n2 : Int) : Int{
        return n1-n2
    }

    fun mul(n1 : Int, n2 : Int) : Int{
        return n1*n2
    }
}

fun main(args : Array<String>){

    var operation = Operations1()
    var sum = operation.sum(2,3)
    println("sum : $sum")

    var div = operation.div(4,2)
    println("div : $div")

    var operation2 = MultiOperations1()
    var sum1 = operation2.sum(2,3)
    println("sum : " + sum1)
    var sub = operation2.sub(2,3)
    println("sub : $sub")

    var mul = operation2.mul(3,4)
    println("mul : $mul")
}