scala> var a = 5
a: Int = 5

scala> println("Hello World!")
Hello World!

scala> println("Hello \n World!")
Hello 
 World!

scala> println("Hello \t World!")
Hello 	 World!

scala> println("Hello \bWorld!")
HelloWorld!

scala> println("Hello \b\bWorld!")
HellWorld!

scala> println("Hello \b\b\bWorld!")
HelWorld!

scala> println("Hello \b\b\b\bWorld!")
HeWorld!

scala> println("Hello \b\b\b\b\bWorld!")
HWorld!

scala> println("Hello \b\b\b\b\b\bWorld!")
World!

scala> println("Hello \f World!")
Hello 
       World!

scala> println("Hello \r World!")
 World!

scala> println("Hello \rWorld!")
World!

scala> println("Hello Hello \r World!")
 World!ello 

scala> println("Hello \"Brazil\" World!")
Hello "Brazil" World!

scala> println("Hello \'Brazil\' World!")
Hello 'Brazil' World!

scala> println("https: \\\\www.google.com")
https: \\www.google.com

scala> var isPresent = true
isPresent: Boolean = true

scala> var isPresent: Boolean = true
isPresent: Boolean = true

scala> var a = 123
a: Int = 123

scala> var a: Int = 123
a: Int = 123

scala> var a: Float = 123
a: Float = 123.0

scala> var a = 123f
a: Float = 123.0

scala> var a = 12.3
a: Double = 12.3

scala> var a = 12.3f
a: Float = 12.3

scala> var a = 123
a: Int = 123

scala> var a: Byte = 123
a: Byte = 123

scala> var a = 123.toByte
a: Byte = 123

scala> var a: Byte = 55
a: Byte = 55

scala> var a: Byte = 7
a: Byte = 7

scala> var b: Byte = 7
b: Byte = 7

scala> var c = a + b
c: Int = 14

scala> var c = (a + b).toByte
c: Byte = 14

scala> var a: Float = 12.3f
a: Float = 12.3

scala> var b: Float = 12.5f
b: Float = 12.5

scala> var c = a + b
c: Float = 24.8

scala> var a = 5
a: Int = 5

scala> var c = a * 0
c: Int = 0

scala> var c = 0. * (0)
c: Int = 0

scala> var c = a * 0
c: Int = 0

scala> var a = 5.toByte
a: Byte = 5

scala> var a = 5.asInstanceOf[Byte]
a: Byte = 5

scala> var a = 5.toInt
a: Int = 5

scala> var a = 5.asInstanceOf[Int]
a: Int = 5

scala> var a: Any = 5
a: Any = 5

scala> var a = 50
a: Int = 50

scala> var b = 30
b: Int = 30

scala> println("Addition of a + b = " + (a + b))
Addition of a + b = 80

scala> println("Subtraction of a - b = " + (a - b))
Subtraction of a - b = 20

scala> println("Multiplication of a - b = " + (a * b))
Multiplication of a - b = 1500

scala> println("Division of a / b = " + (a / b))
Division of a / b = 1

scala> println("Modulus of a % b = " + (a % b))
Modulus of a % b = 20

scala> var a = 50
a: Int = 50

scala> var b = 50
b: Int = 50

scala> println("Equality of a == b = " + (a == b))
Equality of a == b = true

scala> println("Equality of a == b is : " + (a == b).toString)
Equality of a == b is : true

scala> println("Equality of a == b is : " + (a == b))
Equality of a == b is : true

scala> println("Equality of a != b is : " + (a != b))
Equality of a != b is : false

scala> println("Equality of a > b is : " + (a > b))
Equality of a > b is : false

scala> println("Equality of a < b is : " + (a < b))
Equality of a < b is : false

scala> println("Equality of a >= b is : " + (a >= b))
Equality of a >= b is : true

scala> println("Equality of a <= b is : " + (a <= b))
Equality of a <= b is : true

scala> var a = false
a: Boolean = false

scala> var b = true
b: Boolean = true

scala> println("logical Not of (a && b) = " + (a && b))
logical Not of (a && b) = false

scala> println("logical And of (a && b) = " + (a && b))
logical And of (a && b) = false

scala> println("logical Not of And of !(a && b) = " + !(a && b))
logical Not of And of !(a && b) = true

scala> println("logical Or of (a || b) = " + (a || b))
logical Or of (a || b) = true

scala> var a = 50
a: Int = 50

scala> var b = 40
b: Int = 40

scala> var c = 0
c: Int = 0

scala> // Simple Addition

scala> c = a + b
c: Int = 90

scala> println("Simple addition: c = a + b = " + c)
Simple addition: c = a + b = 90

scala> c += a // c = c + a

scala> c
res11: Int = 140

scala> c -= a // c = c - a

scala> c
res13: Int = 90

scala> c *= a // c = c * a

scala> c
res16: Int = 4500

scala> c /= a // It means c = c / a = 4500 / 50

scala> c
res18: Int = 90

scala> c %= a // It means  c = c % a = 90 % 50 = 40

scala> c
res20: Int = 40

scala> c <<= 3

scala> c
res22: Int = 320

scala> c >>= 3

scala> c
res24: Int = 40

scala> c <<= 3

scala> c
res26: Int = 320

scala> c >>= 3

scala> c &= a

scala> c
res29: Int = 32

scala> c ^= a

scala> c
res31: Int = 18

scala> c != a
res32: Boolean = true

scala> c |= a

scala> c
res34: Int = 50

scala> var a = 20
a: Int = 20

scala> var b = 18
b: Int = 18

scala> var c = 0
c: Int = 0

scala> c = a & b
c: Int = 16

scala> c = a | b
c: Int = 22

scala> c = a ^ b
c: Int = 6

scala> c = ~ a
c: Int = -21

scala> c = a << 3
c: Int = 160

scala> c = a >> 3
c: Int = 2

scala> var a = -10
a: Int = -10

scala> var a = 10.unary_-
a: Int = -10

scala> var a = 2 + 5
a: Int = 7

scala> var a = 2
a: Int = 2

scala> var b = a.toByte
b: Byte = 2
