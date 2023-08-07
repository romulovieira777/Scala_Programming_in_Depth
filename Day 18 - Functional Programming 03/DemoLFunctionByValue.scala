object DemoLFunctionByValue {
    def main(args: Array[String]): Unit = {
        println("Main Function: " + exec(time(140698097570299)))
    }

    def time() : Long = {
        println("Inside time function")
        return System.nanoTime()
    }

    def exec(t:Long): Long = {
        println("Inside exec function")
        println("Time: " + t)
        println("Exiting from exec function)
        return t
    }
}

// Points to remember
// 1. It will first execute the inside function "time()" and then execute the outside function "exec(140698097570299)"
// 2. Since inside function "time ()" got executed first, it calls outside function "exec(140698097570299)" using the
// value 140698097570299, it is called as "Function by Value"