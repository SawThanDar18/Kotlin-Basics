class UserAdmins<T> (credit : T){

    init {
        println(credit)
    }
}

fun <T> display(process : T){
    println(process)
}

fun main(args : Array<String>){
    var userAdmin = UserAdmins<String>("saw")
    var userAdmin2 = UserAdmins<Int>(1234)
    var userAdmin3 = UserAdmins<Double>(1234.56)

    display<Int>(22)
    display<String>("process user")
}
