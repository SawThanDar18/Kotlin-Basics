var fullname = "Saw Thandar"  //global variable

fun display() : Unit{
    println(fullname)
    //println(name) //error bec name is local variable only effects in its function
}

fun main(args : Array<String>){

    var name = "saw" //local variable
    println("name : " + name)
    println(fullname)
}