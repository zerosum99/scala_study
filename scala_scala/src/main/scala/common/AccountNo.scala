package common

class AccountNo (branch_ : String, product_ : String ) {
  private val branch = branch_
  private var accNo : Int = 0
  private val product : String = product_

  def createACCNO() = {
     val acc = branch + product + accNo
     addACCNO()
     acc
  }

  private def addACCNO() = {
       accNo += 1
  }


}
