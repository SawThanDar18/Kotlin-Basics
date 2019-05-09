fun main(args : Array<String>){

    var arrayList = ArrayList<String>()
    arrayList.add("saw")
    arrayList.add("thandar")
    arrayList.add("thinzar")
    arrayList.add("oo")

    println("First name : " + arrayList.get(0))  // 0 = location

    arrayList.set(0,"Juicy") //replace

    println("all element by object")
    for(item in arrayList){
        println(item)
    }

    println("all element by index")
    for(index in 0..arrayList.size-1){  // 0 to 3
        println(arrayList.get(index))
    }
    //search
    if(arrayList.contains("thinzar")){
        println("name is found")
    }
    else{
        println("name is not found")
    }
}