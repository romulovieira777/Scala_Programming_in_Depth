import scala.collection.mutable.ArrayBuffer

object DemoHArray {
  def main(args: Array[String]): Unit = {
    val marks = ArrayBuffer[Int]()
    marks +=10
    marks +=6
    marks +=3

    println("Printing Marks so far")
    marks.foreach(println)

    marks += 5

    println("Printing Marks so far")
    marks.foreach(println)

    marks.append(7)
    marks ++= Array(5, 9, 7, 3, 5, 8, 9, 1, 2, 5, 7)

    println("Printing Marks so far")
    marks.foreach(println)

    marks -= 5
    println("Printing Marks so far")
    marks.foreach(println)
  }
}
