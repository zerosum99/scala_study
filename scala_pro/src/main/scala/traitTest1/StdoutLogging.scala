package traitTest1

trait StdoutLogging extends Logging {
  def info(message : String) = println(s" INFO : $message")
  def warning(message :String) = println(s"WARNING : $message")
  def error(message : String) = println(s"ERROR : $message")
}
