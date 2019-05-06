fun main(args : Array<String>){

    var name : String = "Mark"  // var variable_name : data_type
    val number : Int = 10
    //number = 20   //compile error bec val cannot be reassigned
    println(name)
    println("Name :" + name)

    var number1 : Int = 22
    number1 = 23 // no error bec var can be reassigned
    println(number1)

    var number2 : Double
    number2 = 10.25
    println(number2)

    var number3 : Float
    number3 = 10.257F //F must include
    println(number3)
}