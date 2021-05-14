import account_manager._
import common._

object Demo_issue extends App {
   val a = new Account
   a.issue(1, "Dahl", AccountNo.setAcctNo,1000)
   println("account issue = " + a.name)
   println("account issue = " + a.acct)
   println("account issue = " + a.balance)
   println("account issue = " + a.custNo)

   a.deposit(10000)
   println(a.query)
   a.withdraw(5000)
   println(a.query)
}
