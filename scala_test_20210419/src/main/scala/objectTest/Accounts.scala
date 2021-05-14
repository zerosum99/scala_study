package objectTest

object Accounts {
  private var lastNumber = 0

  def newAcctNo() = { lastNumber += 1; lastNumber}

}
