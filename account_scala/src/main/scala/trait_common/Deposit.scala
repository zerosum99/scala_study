package trait_common

trait Deposit {

  def deposit(amount: Double) : Unit
  def withdraw(amount: Double) : Unit
  def query  : Double

}
