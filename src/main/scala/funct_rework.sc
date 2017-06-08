import java.util.TimeZone

def functionAL () : Any = {

  //var zoneMap = Map(TimeZone.getAvailableIDs.filter(_.length > 3))
  //val newZones: Array[String] = zones.split
  //val zones: Array[String] = TimeZone.getAvailableIDs.filter(_.length > 3)

  //TimeZone.getAvailableIDs.map(item => item.split("/").last).filter(_.length > 4)))



}

functionAL()



//Functional unique some (sort of)
def uniqueSum (a: Int, b: Int, c: Int) : Int = {

  Set(a,b,c).sum
}

//uniqueSum(45,45,45)


//Functional Blackjack
def blackJack (a: Int, b: Int) : Int = {

  val collect = ((List(a,b,0).sorted)filter(_ <= 21)).reverse
  collect.head
}

blackJack(3,6)

//FizzBuzz
/*def iterAtTT (a: String, b: String, c: Int) : Any = {
  for(i<-1 to c) {
    if ((i % 5 == 0) && (i % 3 == 0))
    {
      print(a.concat(b) + ", ")
    }
    else if (i % 5 == 0)
    {
      print(b + ", ")
    }
    else if (i % 3 == 0)
    {
      print(a + ", ")
    }
    else
    {print(i + ", ")}
  }
} */

def fizzBuzz(a: String, b: String, c: Int) : Any = {

  
}


