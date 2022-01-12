import java.io.{FileNotFoundException, FileReader}  // import package for reading file and for exception FileNotFoundException
import java.io.IOException  // import for IOException

object DemoATryCatch {

  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("D:\\WorkSpace\\Intellij Projects\\Scala Programming in Depth\\src\\main\\scala\\input.txt")

      val a = 10/5
      println(a)

      val array1 = Array(10)
      println(array1(11))

    } catch {
      case zzz: FileNotFoundException => {
        println("File is not Found - Exception Received" + zzz)
        // instead of e, you can also write name, eg: ex, zzz
        // in real world program, you will usually log this error in some error log file
      }
      case e: IOException => {
        println("Error While reading file - Exception Received")
      }
      case e: ArithmeticException => {
        println("Arithmetic Exception Received")
      }
      case _: Exception => {
        println("It will catch all unhandled exception")
      }
    } finally {
      println("It will always be executed irrespective of Exception or not")
    }
  }
}
