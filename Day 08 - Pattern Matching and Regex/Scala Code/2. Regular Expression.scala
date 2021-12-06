/*
Regular Expression in Scala is adapted from Java. Java Regular Expression is also adopted from Perl.

- import scala.util.matching.Regex

- You have to create an object of class Regex

val pattern = new Regex(“Whatever you want to match”) OR val pattern = “whatevet you want to match”.r

r – is a method/function that is defined in a Regex class and it does nothing but calls the constructor
*/

scala> import scala.util.matching.Regex // Always import this first
import scala.util.matching.Regex

scala> val pattern = new Regex("Hello") // Using the constructor for class Regex
pattern: scala.util.matching.Regex = Hello

scala> val stringToFind = "Hello How are you? Hello Again" // String where you want to
search the pattern
stringToFind: String = Hello How are you? Hello Again
 ^ 
scala> pattern findFirstIn stringToFind // Syntax to find the pattern in a given String. findFirstIn is the method which will only 
// find the 1 st instance of pattern
res16: Option[String] = Some(Hello) // if you search for something
that is not found, it will give you as None

scala> pattern findAllIn stringToFind // findAllIn – will return all the
strings matching with pattern
res17: scala.util.matching.Regex.MatchIterator = non-empty iterator

scala> (pattern findAllIn stringToFind).mkString(", ")
res18: String = Hello, Hello
scala>

scala> val pattern = "Hello".r // used the method r instead of using new Regex 
pattern: scala.util.matching.Regex = Hello 

scala> (pattern findAllIn stringToFind).mkString(", ") 
res19: String = Hello, Hello 

scala>

scala> var stringToFind = "My name is Harish and age is 10 and i study in standard 7"
stringToFind: String = My name is Harish and age is 10 and i study in standard 7

scala> val pattern = "[0-9]+".r // find all between 0 to 9 with 1 or more instance
pattern: scala.util.matching.Regex = [0-9]+

scala> (pattern findAllIn stringToFind).mkString(", ")
res20: String = 10, 7

scala> (pattern findAllIn stringToFind).toArray
res21: Array[String] = Array(10, 7)

scala>

scala>

scala> val stringToFind = "Hello How are you? hello Again"
stringToFind: String = Hello How are you? hello Again

scala> val pattern = "(H|h)ello".r
pattern: scala.util.matching.Regex = (H|h)ello // Find both Hello and hello.

scala> (pattern findAllIn stringToFind).toArray
res22: Array[String] = Array(Hello, hello)


/* A. Using Regular expression with getOrElse Function */
