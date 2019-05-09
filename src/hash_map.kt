fun main(args : Array<String>){

    var map = HashMap<Int, String>()
    map.put(1,"saw")
    map.put(2,"thandar")
    map.put(3,"thinzar")
    map.put(43,"oo")
    println(map.get(43))

    //insert
    map.put(23,"juicy")

    //replace
    map.set(43,"juicy")  //can use put instead of set

    for(k in map.keys){
        println(map.get(k))
    }
}