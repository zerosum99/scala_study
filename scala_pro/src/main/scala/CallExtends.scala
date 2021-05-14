class CallExtends extends Call with Test {
  override def call = {
    println(" CallExtends call ")
    super.call()
  }
}
