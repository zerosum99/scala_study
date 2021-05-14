package person

class Person(var firstName: String, var lastName: String) {
  println("the constructor begins")
  // 'public' access by default
  var age = 0
  // some class fields
  private val HOME = System.getProperty("user.home")
  // some methods
  override def toString(): String = s"$firstName $lastName is $age years old"

  def printHome(): Unit = println(s"HOME = $HOME")
  def printFullName(): Unit = println(this)

  printHome()
  printFullName()
  println("you've reached the end of the constructor")


}
