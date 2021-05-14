import companion._

object  DomeComp extends App {
  println(Pizza.CRUST_TYPE_THIN)
  println(Pizza.getFoo)

  var p = new Pizza(Pizza.CRUST_TYPE_THICK)
  println(p)

  println(" private field access ")

  val f= new Foo
  println(Foo.double(f)) // prints 4

  f.printObj

  println(" apply creat object  ")
  val dawn = Person("Dawn")
  val a = Array(Person("Dan"), Person("Elijah"))

  println(dawn.name)

  for (i <- a ) println(i.name, i.getClass)
  println(" printing name  ")
  a.foreach((f:Person) => println(f.name))


}
