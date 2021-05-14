import self_type._

object Demo_selftype extends App {
  val goodboy: Dog = new Dog
  println(goodboy.bark)
  // Woof!
  goodboy.stop()
  // it stops

  // Animal의 subtype Dog는 Security 내의 셀프타입을 사용할 수 있다.
  val guardDog = new Dog with Security
  guardDog.lookout
  guardDog.stop()

  // 특정 메소드를 셀프타입에 넣어서 처리하면 상속관계가 없는 클래스에서 처리할 수 있다.
  val securityGuard = new Human with Security_
  println(" obj " + securityGuard)
  securityGuard.lookout
  // it stops and crosses their arms
  // looking out!
  // 상속관계가 있어도 동일한 메소드가 있으면 처리됨
  val guardDog_ = new Dog with Security_
  guardDog_.lookout
  // it stops
  // looking out!

  println("상속관계 출력")
  val dog_ : Dog = new Dog
  dog_.stop()
  println(dog_.bark)


  try {
    println(" exception ")
    val dog : Dog = new Dog with Security
    // 변수에 타입을 지정하면 트레이트의 메소드 접근을 할 수 없음
    // dog.lookout

  } catch {
    case e : Exception => println("exception : " + e.getMessage)
  }

}
