trait Test extends Call_ {

  override def call() = {
    println(" trait call")
    super.call()
  }

  def mul(x:Int, y:Int) = x * y

}
