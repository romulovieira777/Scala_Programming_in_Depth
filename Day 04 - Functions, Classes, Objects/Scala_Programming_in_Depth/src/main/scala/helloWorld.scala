// To Demonstrate Functions
object helloWorld {
  // Creating a function
  def main(args: Array[String]): Unit = {
    println("Hello World Of Scala")
    println("Hello World Of Scala Language")

    // Creating a variable that returns the value of the add function
    var result = add(2, 5)
    println("Addition of 2 and is 5 is: " + result)
  }
  // Creating a function that adds two numbers
  def add (x: Int, y: Int): Int = {
    var z = x + y
    return  z
  }

  def addA (x: Int, y: Int): Int = {
    var z = x + y
    return z                               // Not mandatory to specify return keyword
  }

  def addB (x: Int, y: Int) = {      // Nop mandatory to specify return Type. It is auto interpreted.
    var z = x + y
    z                                    // Not mandatory to specify return keyword
  }

  def addC (x: Int, y: Int): Int = {     // IF YOU SPECIFY RETURN. MANDATORY TO SPECIFY RETURN TYPE.
    var z = x + y
    return z                             // Specifying the return keyword
  }

  // QUESTION: If you specify return type, is mandatory to specify return keyword?
  // Answer: No. Correct answer. Refer to function addA

  def AddD (x: Int, y: Int) = x + y
}

// Question: Mandatory to specify RETURN keyword? No
// Question: Mandatory to specify return type? No. What case it becomes mandatory? When you mention RETURN keyword.
// Question: Is it mandatory to give brackets {  }? Single line. eg addD function NOT MANDATORY, multiple lines, EG addA, addB MANDATORY

