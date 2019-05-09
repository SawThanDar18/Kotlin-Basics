class Car(Type : String, Model : Int, Price : Double, MilesDrive : Int, Owner : String){

    var Owner : String? = null
    var Price : Double? = null
    var MilesDrive : Int? = null
    var Model : Int? = null
    var Type : String? = null

    init {
        println("Type : $Type")
        println("Model : $Model")
        println("Price : $Price")
        println("MilesDrive : $MilesDrive")
        println("Owner : $Owner")
        this.Owner = Owner
        this.Price = Price
        this.MilesDrive = MilesDrive
        this.Model = Model
        this.Type = Type
    }

    fun GetPrice() : Double{

        return this.Price!!-(this.MilesDrive!!.toDouble()*10)
    }

    fun GetOwner() : String? {

        return this.Owner;
    }
}

fun main(args : Array<String>){

    var car = Car("BMW", 2015, 10000000.0, 105,
        "Saw")
    println("Owner : " + car.GetOwner())
    println("Price : " + car.GetPrice())

    var car2 = Car("KA", 2017, 1000000.0, 102, "vv")
    println("Owner : " + car2.GetOwner())
    println("Price : " + car2.GetPrice())
}