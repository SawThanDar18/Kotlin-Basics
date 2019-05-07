open class Person(age : Int){  //open class can be inherited

    init {
        println("in person $age")
    }
    open fun think(){ //open function can be overridden
        println("Person is thinking something")
    }
}

class Computer(age : Int) : Person(21){

    init {
        println("in computer $age")
    }
    override fun think() {
        println("Computer is calculating something")
    }
}

fun main(args : Array<String>){
    var mark = Computer(21)
    //mark.think()
}