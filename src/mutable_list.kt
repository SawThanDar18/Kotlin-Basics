fun main(args : Array<String>){

    var map = hashMapOf(1 to "saw", 2 to "thandar")
    map.put(3, "thinzar")
    println(map.get(3))
    println(map[2])

    var arr = arrayOf(1,10,22,11)
    println(arr[0])

    var list = mutableListOf(11,22,33,22)

    //replace
    list[0] = 22  //if you want to add value in list only the list is mutableListOf
    for(item in list){
        println(item)
    }
}