package traitTest1

class ServiceImportance(name : String ) {
    def work(i : Int) = {
      println(s"Service Importance: Doing important work ! $i")
      i + 1
    }
}
