package trait8

class Dog extends Pet {
  // don't need to implement 'speak' if you don't need to
  // 추상 메소드 구현
  def comeToMaster = { println("I'm coming!") }
}