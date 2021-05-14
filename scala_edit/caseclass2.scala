trait  SuperTrait  
case class  CaseClass1 (a : Int , b : Int ) extends  SuperTrait
case class  CaseClass2 (a : Int ) extends SuperTrait          // 케이스 클래스를 확장 합니다.   
case object  CaseObject extends SuperTrait                // Case 객체를 확장 합니다.   

object  MainObject {  
    def  main (args : Array [String]) : Unit =  {  
        callCase (CaseClass1 (10,10))  
        callCase (CaseClass2 (10))  
        callCase (CaseObject)  
    }  
    def  callCase (f : SuperTrait) : Unit = f  match {  
        case  CaseClass1 (f, g) => println ( "a =" + f + "b =" + g)  
        case  CaseClass2 (f) => println ( "a =" + f)  
        case  CaseObject => println ( "인수 없음" )  
    }  
}  
