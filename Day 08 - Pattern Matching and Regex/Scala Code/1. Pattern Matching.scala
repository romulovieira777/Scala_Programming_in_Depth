/*
Matches Squence of data. 
Syntax var match case => 
Example (Start the command line with “cmd” and write “scala” to start scala repl) 
Example 1: Simple pattern matching
*/

scala> def matchPattern(x: Int) = x match { 
 | case 1 => "One" 
 | case 2 => "Two" 
 | case _ => "None of above" 
 | } 
matchPattern: (x: Int)String 
scala> println(matchPattern(1)) 
One 
scala> println(matchPattern(2)) 
Two 
scala> println(matchPattern(4)) 
None of above 


/* Example 2: Any data type for input parameter and output parameter */
scala> def matchPattern(x:Any) = x match { 
 | case 1 => "One" 
 | case 2 => "Two" 
 | case "Three" => 3 
 | case "Four" => 4 
 | case _ => "None of Above" 
 | } 
matchPattern: (x: Any)Any 
scala> matchPattern(1) 
res4: Any = One 
scala> matchPattern(2) 
res5: Any = Two 
scala> matchPattern(3) 
res6: Any = None of Above 
scala> matchPattern(Three) 
<console>:9: error: not found: value Three 
 matchPattern(Three) 
 ^ 
scala> matchPattern("Three") 
res8: Any = 3 
scala> matchPattern("Four") 
res9: Any = 4 
scala> matchPattern("four")
res10: Any = None of Above


/*
Example 3: Using Case class 
- Default for arguments/parameter is val (immutable) 
- It generates some functions/methods automatically when you define class as a case class. It 
includes methods like equals, hashCode, toString
*/

scala> case class Car(name:String, cost:Int) 
defined class Car 
scala> val mercedes = new Car("Mercedes", 500000) 
mercedes: Car = Car(Mercedes,500000) 
scala> val bmw = new Car("BMW", 700000) 
bmw: Car = Car(BMW,700000) 
scala> val jaguar = new Car("Jaguar", 1000000) 
jaguar: Car = Car(Jaguar,1000000) 
scala> for (car <- List(mercedes,bmw,jaguar) ) { 
 | car match { 
 | case Car("Mercedes",500000) => println("Car is Mercedes, Congrats!") 
 | case Car("BMW",700000) => println("Car is BMW, Waow!") 
 | case Car(name,cost) => println("Car is" +name + "Cost is " + cost + "Thats Awesome!!!") 
 | } 
 | } 
Car is Mercedes, Congrats! 
Car is BMW, Waow! 
Car isJaguarCost is 1000000Thats Awesome!!! 
scala> val mercedesa = new Car("Mercedes" , 550000 ) 
mercedesa: Car = Car(Mercedes,550000) 
scala> for (car <- List(mercedes,bmw,jaguar,mercedesa)){ 
 | car match { 
 | case Car("Mercedes",500000) => println("Car is Mercedes, Congrats!") 
 | case Car("BMW",700000) => println("Car is BMW, Waow!") 
 | case Car(name,cost) => println("Car is" +name + "Cost is " + cost + "Thats Awesome!!!") 
 | } 
 | } 
Car is Mercedes, Congrats! 
Car is BMW, Waow! 
Car isJaguarCost is 1000000Thats Awesome!!! 
Car isMercedesCost is 550000Thats Awesome!!!