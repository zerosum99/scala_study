package objectTest

class Accounts_ {
  val id = Accounts_.newAcctNo()
  private var balance = 0.0

  def deposit(amount:Double) = {balance += amount }

  def query = (id, balance)

}

object Accounts_ {
  private var lastNumber = 0

  private def newAcctNo() = {
    lastNumber +=1
    lastNumber
  }
}
