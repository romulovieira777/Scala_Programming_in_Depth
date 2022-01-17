abstract class Vehicle{         // Abstract Class vehicle
  def category()                // Method "category" is not implemented
}

trait FourWheelerC {             // Trait FourWheelerC
  def tyres(): Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}

trait CarC {                    // Trait CarC
  var x = 1000
  val t = 4
  def engine(): Unit ={
    println ("Engine is " + x + " CC in a Car")
  }
  def tyres(): Unit = {
    println(t + " Tyres is present in a Car")
  }
  def break()                   // break method is not implemented
}

class MercedesC extends Vehicle with FourWheelerC with CarC {
  x = 2000                      // change value of x i.e. Car CC
  override val t = 6            // override the value of tyres

  def break(): Unit = {         // bcause break method was not implemented in trait CarC
    println("Disk Breaks in Mercedes")
  }

  override def tyres(): Unit = super.tyres()   // If you dont write this, scala wont know where to call
                                    // "tyres" method. i.e. call from CarC or call from FourWheelerC
                                    // Since, super.tyres is written, it will call from "CarC" because
                                    // CarC is written in the last

  def category(){
    println("It is Mercedes")
  }

  override def engine(): Unit ={
    println ("Engine is " + x + " CC in a Mercedes")
  }

}

object DemoCTrait {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesC
    m1.break()
    m1.engine()
    m1.tyres()
    m1.category()
  }

}
