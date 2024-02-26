// Note: Without partially applied functions
import java.util.Date


object DemoNPartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {
    var date = new Date()
    val logWithDateBound = log(date, _: String) // Partially Applied Functions. Will the parameter that is expected by
                                                // partially applied function

    //log(date, msg="Hello 1 ")
    logWithDate("Hello 1 ")

    Thread.sleep(2000)
    //log(date, msg="Hello 2 ")
    logWithDate("Hello 2 ")

    Thread.sleep(2000)
    //log(date, msg="Hello 3 ")
    logWithDate("Hello 3 ")
  }

  def log(date: Date, msg: String): Unit {
    println(msg + date)
  }
}
