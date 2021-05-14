package methodChain

class Person {
  protected var fname = ""
  protected var lname = ""
  def setFirstName(firstName: String): this.type = {
    fname = firstName
    this
  }

  def setLastName(lastName: String): this.type = {
    lname = lastName
    this
  }
}
