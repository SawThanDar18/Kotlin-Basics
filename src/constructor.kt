class CarWithCons() {

    var Owner: String? = null
    var Price: Double? = null
    var MilesDrive: Int? = null
    var Model: Int? = null
    var Type: String? = null

    constructor(Type: String, Model: Int, Price: Double, MilesDrive: Int, Owner: String) : this() {}

    constructor(Name : String) : this(){
        println("new class instance")
    }

    fun GetPrice() : Double{

        return this.Price!!-(this.MilesDrive!!.toDouble()*10)
    }

    fun GetOwner() : String? {

        return this.Owner;
    }
}

fun main(args : Array<String>){

   var car = CarWithCons("saw thandar")
}