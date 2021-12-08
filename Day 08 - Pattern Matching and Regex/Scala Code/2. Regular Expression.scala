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
scala> val pattern = "Hellooooooo".r // Trying to search for Hellooooooo
pattern: scala.util.matching.Regex = Hellooooooo

scala> val stringToFind = "Hello How are you? hello Again"
stringToFind: String = Hello How are you? hello Again

scala> pattern findFirstIn stringToFind getOrElse("No Match Found") // it will go in else as pattern not found
res29: String = No Match Found

scala> val pattern = "Hello".r
pattern: scala.util.matching.Regex = Hello

scala> pattern findFirstIn stringToFind getOrElse("No Match Found") // it will get the value as pattern was found
res30: String = Hello


/* B. Using regular expression with forEach */
scala> val pattern = "(H|h)ello".r
pattern: scala.util.matching.Regex = (H|h)ello

scala> val stringToFind = "Hello How are you? hello Again"
stringToFind: String = Hello How are you? hello Again

scala> pattern findAllIn stringToFind foreach(d=>print(d))
Hellohello

scala> pattern findAllIn stringToFind foreach(d=>println(d))
Hello
Hello


/* Intermediate Stage
    1. Example 1 */

stringToFind: String = Hello i am Able to do it, abl11 able able0

scala> val pattern = "abl[ae]\\d+".r
pattern: scala.util.matching.Regex = abl[ae]\d+

scala> pattern findAllIn stringToFind toArray
warning: there were 1 feature warning(s); re-run with -feature for details
res38: Array[String] = Array(able0)

scala>

scala> val pattern = "abl[ae]\\d*".r
pattern: scala.util.matching.Regex = abl[ae]\d*

scala> pattern findAllIn stringToFind toArray
warning: there were 1 feature warning(s); re-run with -feature for details
res39: Array[String] = Array(able, able0)

scala> val pattern = "[Aa]bl[ae]\\d*".r
pattern: scala.util.matching.Regex = [Aa]bl[ae]\d*

scala> pattern findAllIn stringToFind toArray
warning: there were 1 feature warning(s); re-run with -feature for details
res40: Array[String] = Array(Able, able, able0)

scala> val pattern = "(A|a)bl[ae]\\d*".r
pattern: scala.util.matching.Regex = (A|a)bl[ae]\d*

scala> pattern findAllIn stringToFind toArray
warning: there were 1 feature warning(s); re-run with -feature for details
res41: Array[String] = Array(Able, able, able0)


/* 2. Example 2 */

scala> val pattern = "(-)?(\\d+)(\\.\\d*)?".r //listen to video at around 1 hour 40 mins//
pattern: scala.util.matching.Regex = (-)?(\d+)(\.\d*)?

scala> val stringToFind = "-1.5 divide by 5 is 3 is wrong"
stringToFind: String = -1.5 divide by 5 is 3 is wrong

scala> pattern findAllIn stringToFind toArray
warning: there were 1 feature warning(s); re-run with -feature for details
res44: Array[String] = Array(-1.5, 5, 3)

scala>

scala>

scala> val pattern = """(-)?(\d+)(\.\d*)?""".r
pattern: scala.util.matching.Regex = (-)?(\d+)(\.\d*)?

scala> pattern findAllIn stringToFind toArray
warning: there were 1 feature warning(s); re-run with -feature for details
res45: Array[String] = Array(-1.5, 5, 3)


/* 3. More difficult example by extracting the value from regular expression */

scala> val Decimal = """(-)?(\d+)(\.\d*)?""".r
Decimal: scala.util.matching.Regex = (-)?(\d+)(\.\d*)?

scala> val Decimal(sign, integerpart, decimalpart) = "-1.23"
sign: String = -
integerpart: String = 1
decimalpart: String = .23

scala> val stringToFind = "-1.5 divide by 5 is 3 is wrong"
stringToFind: String = -1.5 divide by 5 is 3 is wrong

scala> for (Decimal(sign, integerpart, decimalpart) <- Decimal findAllIn stringToFind)
 | println("Sign is " + sign + "Integer Part is " + integerpart + " Decimal Part is " + decimalpart)
Sign is -Integer Part is 1 Decimal Part is .5
Sign is nullInteger Part is 5 Decimal Part is null
Sign is nullInteger Part is 3 Decimal Part is null