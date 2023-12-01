object DemoLFunctionByValue {
    def main(args: Array[String]): Unit = {
        var t = time
        println("Main Function: " + exec(time(), time2()))
    }

    def time() : Long = {
        println("Inside time function")
        return System.nanoTime()
    }

    def time2() : Long = {
        println("Inside time2 function")
        return System.nanoTime()
    }

    def exec(i:Long, j:Long): Long = {
        println("Inside exec function")
        println("Time from time(): " + i)
        println("Time from time2(): " + j)
        println("Exiting from exec function")
        return i
    }
}

// Points to remember
// 1. It will first execute the inside function "time()" and then execute the outside function "exec(140698097570299)"
// 2. Since inside function "time ()" got executed first, it calls outside function "exec(140698097570299)" using the
// value 140698097570299, it is called as "Function by Value"
