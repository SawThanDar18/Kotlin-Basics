fun main(args : Array<String>){

    //if else
    val a = 5
    val b = 2

    val max : Int
    max = if(a > b) a else b
    println("The max value is $max")

    //when
    val x = 0
    var str : String =
    when(x){
        0,1,2 -> "value of x is 0 or 1 or 2"
        2 -> "value of x is 2"
        else -> "x is unknown"
    }
    println(str)

    //while
    var i = 1
    while(i <= 10){
        println(i)
        ++i;
    }

    //do while
    var j = 0
    do{
        ++j;
        println(j)
    }while(j <= 10)

    //for
    /*for(k in 1..10){
        println(k)
    }*/

    /*for(k in 1..10 step 2){
        println(k)
    }*/

    /*for(k in 10 downTo 1 step 2){
        println(k)
    }*/

    /*for(k in 1..10){
        if(k == 5){
            break
        }
        println(k)
    }*/

    for(k in 1..10){
        if(k == 5){
            continue
        }
        println(k)
    }
}