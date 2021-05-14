object Main {
     2	  def main(args: Array[String]): Unit = {
     3	    println("Hello, world!")
     4	
     5	
     6	    val width = args(0).toInt
     7	    for (arg <- args.drop(1)) {
     8	      println("filename :" + arg)
     9	
    10	      LongLines.processFile(arg, width)
    11	    }
    12	
    13	  }
    14	}
