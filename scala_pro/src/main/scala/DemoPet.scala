object DemoPet {

  def main (args : Array[String]) = {
    println("+" * 30 )
    import scala.collection.mutable.ArrayBuffer
    import traitTest._

    // 트레이트를 상속하는 2개의 클래스 지정
    class Cat(val name: String, var age : Int) extends Pet
    class Dog(val name: String, var age : Int) extends Pet
    // 상속하지 않는 하나의 클래스 지정
    class Python(val name : String, var age : Int)
    // 객체를 생성
    val dog = new Dog("Harry", 22)
    val cat = new Cat("Sally", 33)
    // 객체를 생성할 때 트레이트를 사용
    val python = new Python("xxx", 3) with Pet

    // 트레이트 타입을 가진는 버퍼 객체 생성
    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.append(python)
    animals.foreach(pet => println(pet.name, pet.age))
  }

}
