case class Car(name: String, model: String)
{
  val carName = name
  val carModel = model

  def printDetails(): Unit ={
    println(s"Car Name is: ${carName} or ${name} and Car Model is: ${carModel}")
  }
}


object CaseClassDemoA {
  def main(args: Array[String]): Unit = {
    val bmw = Car("BMW", "550")  // 1. No need to write "new", since apply method is auto generated
                                                   // in case class
    bmw.printDetails()
    //bmw.carName = "B.M.W"  // 2. constructor parameter is val by default.
                           // therefore mutator method is not auto generated and hence you can not change the name.
                           // However, if you change the constructor paramenter tpo var, mutator method will be
                           // auto generated and you will be able to modify the value in variable
    //bmw.printDetails()

    bmw match {case Car(a, b) => println(a, b)}  // 3. Case class autogenerate unapply method , used for patern matching

    // 4. Autogenerates copy method
    val mercedes = bmw.copy(name = "mercedes")
    mercedes.printDetails()

    // 5. equals and hashcode method
    println(bmw == mercedes)

    // 6. toString method is autoimplemented
    println(bmw)
  }
}
