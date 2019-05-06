import java.util.*

fun main(args : Array<String>){

    println("Enter your name : ")
    val userName = readLine()
    println("Your name : $userName")

    //with scanner class
    val reader = Scanner(System.`in`)
    println("Enter your age : ")
    var userAge = reader.nextInt() //nextInt can replace with nextDouble, nextFloat, nextLong, nextBoolean
    println("Your age : $userAge")
}