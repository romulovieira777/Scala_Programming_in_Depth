scala> val strr = "Hello World"
strr: String = Hello World

scala> strr.toUpperCase
res0: String = HELLO WORLD

scala> implicit class StringFincClass (s:String) { 
 | def firstChar() = s.substring(0,1) 
 | } 
defined class StringFincClass

scala> strr.firstChar
res1: String = H

scala> strr. + asInstanceOf charAt chars codePointAt codePointBefore codePointCount codePoints compareTo compareToIgnoreCase concat 
contains contentEquals endsWith equalsIgnoreCase getBytes getChars indexOf intern isEmpty isInstanceOf lastIndexOf length matches 
offsetByCodePoints regionMatches replace replaceAll replaceFirst split startsWith subSequence substring toCharArray toLowerCase toString 
toUpperCase trim

scala>

scala>

scala>

scala>

scala> implicit class StringFuncClass (s:String) {
 | def nthChar(n:Int) = s.substring(n,n+1)
 | }
defined class StringFuncClass

scala> strr.nthchar(0)
<console>:11: error: value nthchar is not a member of String
 strr.nthchar(0)

 scala> strr.nthChar(0)
res3: String = H

scala> strr.nthChar(1)
res4: String = e

scala> strr.nthChar(2)
res5: String = l

scala> strr.nthChar(3)
res6: String = l

scala> strr.nthChar(4)
res7: String = o