fun main(args : Array<String>){
    val student = Student("Saw", 21, 101)
    println(student.id)
}

class Student(val name : String, var age : Int){

    var id = 1
    init {  // init block runs before constructor
        println("Name is $name and ID is $id")
        println("Age is $age")
    }

    constructor(name: String, age: Int, id : Int) : this(name, age){
        this.id = id
    }
}