package traitSuper

class Child extends Human with Mother with Father {

  // 트레이트를 상속할 경우 대괄호 다음에 특정 트레이트를 지정한 후에 메소드를 호출할 수 있다.
  // 지정없이 super를 사용할 경우 마지막에 with 다음의 트레이트 내에 있는 메소드를 처리한다.

  def printSuper = super.hello
  def printMother = super[Mother].hello
  def printFather = super[Father].hello
  def printHuman = super[Human].hello
}