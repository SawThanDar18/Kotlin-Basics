fun show(name : String) : Unit{
    println("name : " + name)
}

fun show(number: Int) : Unit{
    println("number : " + number)
}

fun show(numberD: Double) : Unit{
    println("number : " + numberD)
}

fun main(args : Array<String>){

    show("saw")
    show(21)
    show(12.45)
}

