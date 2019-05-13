import java.io.FileWriter
import java.lang.Exception

fun main(args : Array<String>){

    println("Write to file text : ")
    var string : String = readLine().toString()
    WriteToFile(string)
}

fun WriteToFile(string: String){

    try {
        var fout = FileWriter("test.txt", true)
        fout.write(string + "\n")
        fout.close()
    }catch (exception : Exception){
        println(exception.message)
    }
}