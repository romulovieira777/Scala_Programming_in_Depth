object DemoOPartiallyAppliedFunctions {

    def main(args: Array[String]): Unit = {
        car("Mercedes")
        car("BMW")
        truck("Volvo")
    }

    val car = fourWheeler( _: String, "Car", 200000)        // partially implemented function
    val truck = fourWheeler( _: String, "Truck", 500000)    // partially implemented function

    //def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int): Unit = {
        //println("Vehicle Name is: " + vehicleName +
        // ", Vehicle Type is: " + vehicleType +
        // ", Vehicle Cost is: " + vehicleCost)
    //}

    val fourWheeler = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
        println("Vehicle Name is: " + vehicleName +
          ", Vehicle Type is: " + vehicleType +
          ", Vehicle Cost is: " + vehicleCost)
    }
}
