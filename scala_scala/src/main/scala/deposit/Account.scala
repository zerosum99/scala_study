package deposit

class Account(accountNo_ : String, amount_ : Int ) extends Deposit {
    val accountNo = accountNo_
    var amount = amount_

    def deposit(amt : Int) : Unit = {
      amount += amt
    }

    def accQuery() = s"accountsNo : ${accountNo} amount : ${amount} "

}
