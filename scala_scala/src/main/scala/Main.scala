import customer.Person
import deposit.Account
import common.AccountNo

object Main {

  def main(args : Array[String]) = {
    println("Hello Scala world ")
    val p = new Person("dahl moon", 50)
    println(p.name + " " + p.age)

    def func = 100

    println(" func call " + func)

    val acno = new AccountNo("001","01").createACCNO()

    println(" account no :" + acno)

    val acc = new Account(acno, 1000)
    println(acc.accountNo + "  " + acc.amount)
    acc.deposit(1000)
    println(acc.accQuery())
  }


}


//def func = 100  오류 발생
