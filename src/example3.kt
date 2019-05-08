class Outer{
    val a = "Outer class"

    /*class Nested{  //nested class allows to define class within another class
        val b = "Nested class"
fun callMe() = "call me function"
}*/

    //inner class can retrieve data from outer class
    inner class Nested{  //nested class allows to define class within another class
        val b = "Nested class"
        fun callMe() = "call me function"
    }
}

fun main(args : Array<String>){

    /*println(Outer.Nested().b)
    val obj = Outer.Nested()
    println(obj.callMe())*/

    println(Outer().Nested().b)
    val obj = Outer().Nested()
    println(obj.callMe())

}