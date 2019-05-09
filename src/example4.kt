class Person1 {
    companion object P1 {
        fun callMe() =
            println("In call me function")  //if you have only one statement in function, you don't need to write bracket and can directly write equal to
    }
}
fun main(args : Array<String>){

    Person1.callMe()

    var count = 1
    while(count <= 5){
        if(count == 2) {
            println("count : $count")
        }
        count++
    }

    println("loop done")
}