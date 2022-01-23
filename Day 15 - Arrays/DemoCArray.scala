object DemoCArray {
  def main(args: Array[String]): Unit = {
    println("Hello")
    // reduceLeft

    var marks = Array(21, 25, 39, 58, 79, 64, 52, 94, 34)
    var avg = marks.reduceLeft((x,y) => (x + y) / 2)

    var avg2 = marks.reduceLeft((x,y) => {
      println("value of x is: " + x + " and y is :"+ y + " and the average is:" + (x + y) / 2)
      (x+y) / 2
    }
    )

    var avg3 = marks.reduceLeft(_/2+_/2)

    println(avg)
    println(avg2)
    println(avg3)

    var totalMarks = marks.reduceLeft(_+_)
    println("Total Marks is " + totalMarks)

    var maxMarks = marks.reduceLeft(_ max _)
    println("Max Marks is " + maxMarks)

    // without shorthand notation
    var maxMarks2 = marks.reduceLeft((x, y) => x max y)
    println("Max Marks is " + maxMarks2)


    var minMarks = marks.reduceLeft(_ min _)
    println("Min Marks is " + minMarks)
  }
}
