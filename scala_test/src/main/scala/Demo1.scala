object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")


    val width = args(0).toInt
    for (arg <- args.drop(1)) {
      println("filename :" + arg)

      LongLines.processFile(arg, width)
    }

  }
}
