package companion

class Person {
  var name: String = _
}

// apply 메소드를 사용해서 생성자 만들기
object Person {

  // 반환 타입을 동반 클래스로 지정
  def apply(name: String): Person = {
    // 객체를 생성하고 추가적인 속성 할당
    var p = new Person
    p.name = name
    p
  }
}
