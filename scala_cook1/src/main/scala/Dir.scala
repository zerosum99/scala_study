object Dir extends App {
  // 클래스 내부의 메소드 이름 가져오기
  List.getClass.getMethods.map(_.getName).foreach(println)

}
