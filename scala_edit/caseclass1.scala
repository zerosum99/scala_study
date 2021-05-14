case class  CaseClass (a : Int , b : Int )   
  
object  MainObject {  
    def  main (args : Array [String]):Unit = {  
        var  c = CaseClass (10,10)        // 케이스 클래스의 객체 생성  
        println ( "a =" + c.a)                // 케이스 클래스의 요소에 액세스  
        println ( "b =" + c.b)  
    }  
}  
