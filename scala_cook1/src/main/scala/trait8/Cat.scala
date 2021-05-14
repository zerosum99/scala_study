package trait8

class Cat extends Pet {
  // override the speak method
  override def speak =  { println("meow") }
  // 추상 메소드 구현
  def comeToMaster = { println("That's not gonna happen.") }
}