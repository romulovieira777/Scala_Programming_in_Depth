object FrmoBArrays {
  def main(args: Array[String]): Unit = {
    var marks = Array(58, 36, 98, 18, 56, 45, 95, 37, 76, 82, 19, 2, 100)

    // To print all the elements of an array using option 1: for loop and option 02: foreach
    // Option no 01: Using foreach loop
    for(mark <- marks) {  // Accessing each elements of an array marks
      println(mark)
    }

    // Oprion no 02: Using foreach
    marks.foreach(println)

    // Find the average marks using option 01: for loop and option 02: foreach
    // Option no 01: Using for loop
    var totalMarks = 0
    for(i <- 0 to (marks).length - 1) {  // Acessing each elements of an array marks
      totalMarks = totalMarks + marks(i)
    }

    var averageMarks = totalMarks / marks.length
    println("Average Marks is " + averageMarks)

    // Option no 02: Using foreach loop
    totalMarks = 0
    // marks.foreach(mark => totalMarks = totalMarks + mark)
    // marks.foreach(mark => totalMarks += mark
    marks.foreach(totalMarks +=_)  // Short Hand Notation
    averageMarks = totalMarks / marks.length
    println("Average Marks is " + averageMarks)

    // foreach, you can get multiple outputs, example: marks.foreach(println) will give you multiple output

    // foreach, you can also get one final output, examples: marks.foreach(mark => totalMarks = totalMarks + mark)
    // will give you totalMarks

    // map ====> You will always get multiple output
    // var newMarks = marks.map(mark => mark + 10)
    var newMarks = marks.map(_ + 10)  // shorthand notation
    newMarks.foreach(println)


    // If you want to do same operation on each element of an Array --->
    // Use Map (Note: You can also do with foreach/for loop but it will be slow)

    // If you want to take Sum/get single output (eg: total marks), use foreach

    
    // Note: If you want for loop to return you an array, you can use yield with it.
    val result = for(mark <- marks) yield {mark + 10}
    result.foreach(println)
  }
}
