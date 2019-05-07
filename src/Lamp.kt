class Lamp {

    private var isOn : Boolean = false

    fun on(){
        isOn = true
    }

    fun off(){
        isOn = false
    }

    fun displayLightStatus(){
        if(isOn == true)
            println("lamp is on")
        else
            println("lamp is off")
    }
}