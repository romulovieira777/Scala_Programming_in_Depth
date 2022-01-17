trait Car {                          // keyword trait
  def engine(): Unit ={              // body is present for engine() method
    println ("Engine is 1000 CC")
  }
  def break()                        // body is not present for break method. It should be implemented
  // in the class that is extending trait car
  def tyres()                        // body is not present for tyres method. It should be implemented
  // in the class that is extending trait car
}

class Mercedes extends Car{          // keyword is extend
  def break(): Unit = {              // unimplemented break() method is implemented here
    println("Disk Breaks")
  }
  def tyres: Unit = {                // unimplemented tyres() method is implemented here
    println("4 Tyres")
  }
}

object DemoATrait {
  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes
    m1.break()
    m1.tyres
    m1.engine()
  }
}
