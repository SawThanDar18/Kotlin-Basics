fun main(args : Array<String>){
    println("Hello World") //inline comment

    /*
    *this is multi line comment
    * */

    var name = readLine()!!
    if(name !is String){
        println("error")
    }

    else
        println(name)
}


