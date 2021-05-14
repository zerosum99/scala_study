package objectTest

class Accounts__ private (val id: Int, var balance : Double = 0.0 ) {
  def deposit(amount:Double) = {balance += amount }

  def query = (id, balance)

}

object Accounts__ {
  private var lastNumber = 0

  private def newAcctNo() = {
    lastNumber +=1
    lastNumber
  }

  def apply(balance : Double)  = {
    new Accounts__(newAcctNo(), balance)
  }
}
