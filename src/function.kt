fun main(args : Array<String>){
   /* callMe()
    println("main function is called")*/

    /*println(getName("Saw", "Thandar"))
    println(getName("Thinzar", "Oo"))*/

    //call()

    var number = 4
    var result : Long

    result = factorial(number)
    println("Factorial of $number = $result")
}

/*
fun callMe(){
    println("callMe function is called")
}*/

//fun getName(firstName : String, lastName : String) : String = ("$firstName $lastName")

//recursive function
/*
fun call(){
    println("Hello")
    call()
}
*/

fun factorial(n : Int) : Long{
    return if(n == 1) n.toLong()
    else n*factorial(n-1)
}



