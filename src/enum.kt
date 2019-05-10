enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main(args : Array<String>){

    var userDirect = Direction.SOUTH

    if(userDirect == Direction.NORTH)
    {
        println("he went to north")
    }
    else
    {
        println("i don't know where he went")
    }
}