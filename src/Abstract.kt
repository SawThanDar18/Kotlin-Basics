abstract class Human{
    abstract var name : String
    abstract fun getName()
    open fun getAge() {}
}
class Doctor : Human(){
    override fun getName(){

    }
    
    override var name : String = "HumanName"
}
fun main(args : Array<String>){
}
