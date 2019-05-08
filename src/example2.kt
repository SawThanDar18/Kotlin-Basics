data class User(val name : String, val age : Int, val gender : String)  //primary constructor

fun main(args : Array<String>){

    //copy function
   /* val user1 = User("Saw", 21)
    //val user2 = user1.copy()  //if all datas are same, you can copy
    val user2 = user1.copy("Thinzar") //if only age is the same, you can copy like this
    //println("Name = ${user1.name}, Age = ${user1.age}")
    //println(user1.toString())
    println("User1 name = ${user1.name}, age = ${user1.age}")
    println("User2 name = ${user2.name}, age = ${user2.age}")*/

    //component function
    val user1 = User("Saw", 21, "female")
    println(user1.component1())  //for name
    println(user1.component2())  //for age
    println(user1.component3())  //for gender
}

//Here are the requirements for data class:
//
//1) The primary constructor must have at least one parameter
//2) The parameters of the primary constructor mush be marked as either val or var
//3) The class cannot be open, abstract, inner
//4) The class may extend other classes or implement interfaces