import Array._

object DemoFArray {
  def main(args: Array[String]): Unit = {
    var marks1 = Array (5, 6, 8, 9, 2, 4, 6)
    var marks2 = Array (5, 9, 2, 6, 4, 2, 6)

    var allMarks = concat(marks1, marks2)     // concat method is used to combine arrays

    allMarks.foreach(println)


    //    var rollNo = Array (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, . .. . .  .. . 100 )
    var rollNo = range(1,101)
    rollNo.foreach(print)

    println()

    var rollNox = range(2,101,2)
    for (rollnos <- rollNox){
      print(rollnos + ", ")
    }
  }
}
