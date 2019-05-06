fun main(args : Array<String>){

    val a = 10
    val b = 9
    val c = 5

    //AND operator
    if((a>b) && (b>c))
        println("true")
    else
        println("false")

    //OR operator
    if((a<b) || (b<c) || (c<b))
        println("true")
    else
        println("false")
}