package customer_manager

class Person {
  var name = ""
}
object Person {
  def apply(name: String): Person = {
    var p = new Person
    p.name = name
    p
  }
}
