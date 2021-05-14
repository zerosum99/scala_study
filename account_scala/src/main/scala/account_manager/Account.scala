package account_manager

import trait_common.Deposit

class Account extends Deposit {
  var name:String =""
  var custNo: Int= 0
  var acct : Int = 0
  var balance:Double = 0.0

  def issue(custNo:Int,name:String,acctNo:Int, amount : Int) = {
    this.acct = acctNo
    this.balance = amount
    this.name = name
    this.custNo = custNo
  }

  override def deposit(amount: Double): Unit = {
    this.balance += amount
  }

  override def withdraw(amount: Double): Unit = {
    this.balance -= amount
  }

  override def query : Double = {
    this.balance
  }

}
