object DemoAArrays {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    var marks = Array(58, 36, 98, 18, 56, 45, 95, 37, 76, 82, 19, 2, 100)

    for(mark <- marks) {  // Accessing each elements of an array marks
      println(mark)
    }

    // Average marks
    var totalMarks = 0
    var averageMarks = 0

    for(mark <- marks) {  // Acessing each elements of an array marks
      totalMarks = totalMarks + mark
    }

    averageMarks = totalMarks / marks.length
    println("Average Marks is " + averageMarks)    
  }
}
