abstract class Manager { // 트레이트가아닌 추상클래스임에 주의

  def lookup(): Unit = {
    println("Base lookup")
  }
}

// 슈퍼클래스로 Manager를 선언하였다. 이 선언은 TaskManager 트레이트가 Manager를 상속한 클래스에만 Mixin될 수 있다는 것이다.
trait TaskManager extends Manager {

  abstract override def lookup(): Unit = {
    println("TaskManager task lookup")
    super.lookup()
  }
}

trait JobManager extends Manager {

  abstract override def lookup(): Unit = {
    println("JobManager job lookup")
    super.lookup()
  }
}

// extends Manager가 빠져있다면 즉, Manager 클래스를 상속하지 않았다면 컴파일 에러가 발생한다.
class ManagerImpl extends Manager with TaskManager with JobManager {

  override def lookup(): Unit = {
    println("Impl lookup")
    super.lookup()
  }
}

object trait2 {

  def main(args: Array[String]): Unit = {
    val manager = new ManagerImpl
    manager.lookup()
  }
}

