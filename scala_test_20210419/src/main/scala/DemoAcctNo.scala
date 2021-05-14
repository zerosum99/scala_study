import objectTest._

object DemoAcctNo extends App {
  println(" DemoAcctNo")
  val acct = Accounts.newAcctNo()
  println("acct no :" + acct)

  val acct_ = new Accounts_
  println("acct no :" + acct_.query)

  acct_.deposit(1000)
  println("acct no :" + acct_.query)

  val acct__ = Accounts__(2000.0)
  println("acct no :" + acct__.query)


  object TF extends Enumeration {
    val Red, Yellow, Green = Value
  }

  println(TF.Red + " " + TF.Yellow + " " + TF.Green)
  val b = TF.Red
  val a = if (TF.Red == b) true else false
  println(a)


}
