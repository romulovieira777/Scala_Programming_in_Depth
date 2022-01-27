// Variable number of Arguments in a Function

object DemoCVariableNumberofArguments {
  def printMultipleTimes(n: Int, args: String*) = {  // String* means you are defining Array[String]
    for (arg <- args)  // for each element in args (" Hello", " World", " Brazil", " São Paulo")
      {                // arg = Hello, execute the for loop
                       // arg = World, execute the for loop ... Brazil .... São Paulo ....
        println(arg * n)
      }
  }
  def main(args: Array[String]): Unit = {
    printMultipleTimes(3, " Hello", " World", " Brazil", " São Paulo")
  }
}


//Note 1: Variable number argument i.e. args:String* should always be at the end/ should be the last parameter
//Note 2: You con not have more then one *.