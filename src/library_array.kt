fun main(args : Array<String>){

    //var a = arrayOf<Int>(1,2,3,9,8)
    var a = intArrayOf(1,2,3,9,8) //already assigned integer array

    /*for(x in a){
        println(x)
    }*/

    /*if(3 in a){
        println("array contain 3")
    }
    else {
        println("no")
    }*/

    if(5 !in a){
        println("add 5 to array")
    }
    else {
        println("added")
    }
}