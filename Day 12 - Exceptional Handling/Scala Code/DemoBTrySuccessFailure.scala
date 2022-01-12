import scala.util.{Failure, Success, Try}

object DemoBTrySuccessFailure {

  def main(args: Array[String]): Unit = {
    val a = Try (10 / 0)

    a match {
      case Success(value) => println(value)
      case Failure(exception) => println(exception)
    }
  }

  def errorHandlingFunction(exception: Throwable) = {
    println(exception)

    if (exception.toString.equals("java.lang.ArithmeticException: / by zero")) {
      println("Hello, arithmetic exception had occured")
    }
  }
}
