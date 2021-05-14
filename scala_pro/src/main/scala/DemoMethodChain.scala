import methodChain._

object DemoMethodChain extends App {

  val employee = new Employee
  // use the fluent methods
  employee.setFirstName("Al")
    .setLastName("Alexander")
    .setRole("Developer")
  println(employee)

}
