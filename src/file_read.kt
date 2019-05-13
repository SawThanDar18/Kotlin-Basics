import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args : Array<String>){

    println("1- read\n 2- write \n")
    var op = readLine()!!.toInt()

    when(op){
        1-> {
            ReadFromFile()
        }
        2-> {
            println("Write to file text : ")
            var str : String = readLine().toString()
            WriteToFiles(str)
        }
    }
}

fun WriteToFiles(str: String){

    try {
        var fout = FileWriter("test.txt", true)
        fout.write(str + "\n")
        fout.close()
    }catch (exception : Exception){
        println(exception.message)
    }
}

fun ReadFromFile(){

    try{
        var fin = FileReader("test.txt")
        var c : Int?
        do{
            c = fin.read()
            print(c.toChar())
        }while (c != -1)
    }catch (exception : Exception){
        println(exception.message)
    }
}