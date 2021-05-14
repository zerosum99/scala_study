package companion

class Foo {
  private val secret = 2
  // access the private object field 'obj'
  // 함수에서 object 객체 이름으로 접근해서 처리함
  def printObj = { println(s"I can see ${Foo.obj}") }
}

object Foo {
  // access the private class field 'secret'
  // 함수에서 객체를 받고  접근해서 처리함
  def double(foo: Foo) = foo.secret * 2

  private val obj = "Foo's object"
}
