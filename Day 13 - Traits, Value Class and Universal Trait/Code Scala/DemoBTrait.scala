trait FourWheelerB {
  def tyres(): Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}

trait CarB {                          // keyword trait
  def engine(): Unit ={              // body is present for engine() method
    println ("Engine is 1000 CC in a Car")
  }
  def tyres(): Unit = {
    println("4 Tyres is present in a Car")
  }
  def break()                        // body is not present for break method. It should be implemented
  // in the class that is extending trait car
}

class MercedesB extends FourWheelerB with CarB {          // keyword is extend and with
  def break(): Unit = {              // unimplemented break() method is implemented here
    println("Disk Breaks in Mercedes")
  }

  override def tyres(): Unit = super.tyres()           // if same method "tyres()" is implemented in
  // multiple traits, it will ne executed from thr trait on right side
}

object DemoBTrait {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesB
    m1.break()
    m1.engine()
    m1.tyres()
  }
}
