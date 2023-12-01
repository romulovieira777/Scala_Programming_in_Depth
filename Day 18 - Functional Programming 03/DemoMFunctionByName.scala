object DemoMFunctionByName {
    def main(args: Array[String]): Unit = {
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

    def exec(t: => Long, u: => Long): Long = {
        println("Entering exec function")
        println("Time from time(): " + t)
        println("Time from time2(): " + u)
        println("Exiting from exec function")
        return t
    }
}

// Points to remember
// 1. It will first execute the OUTSIDE function "exec()" and then execute the INSIDE function "time()" every time it is
// being referred.
// 2. Since OUTSIDE function "exec ()" got executed first, it calls INSIDE function "time()" using the REFERENCED
// VARIABLE T, it is called as "Function by Name"
