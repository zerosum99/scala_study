package methodChain

class Employee extends Person {

  protected var role = ""
  def setRole(role: String): this.type = { this.role = role
    this
  }
  override def toString = {
    "%s, %s, %s".format(fname, lname, role)
  }

}
