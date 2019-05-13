import java.lang.Exception

fun main(args : Array<String>){

    try{
        println("Enter number : ")
        var n2 : Int = readLine()!!.toInt()
        var div = 100/n2
        println("Answer : " + div)
    }catch (ex : Exception){
        println(ex.message)
    }

    println("app is done")
}