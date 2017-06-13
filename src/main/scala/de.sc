import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.TimeZone

//Basic - Hello World
def helloWorld() : Any = {
  println("Hello World!")
}

//Assignment
def assign() : Any = {
  val hello = "Hello World!"

  println(hello)
}

//Parameters
def paraMeters(a: String) : String = {

  println(a)
  a
}

//Return Types
def returnType() : String = {
  val ret = "Hello World!"

  println(ret)
  ret
}

//Type Inference
def typeInf(a: Any) : Any = {

  println(a)
  a
}

//Strings 1
def stringSO(a: Int, b: String) : String = {
  val carr = b.toList
  var ret = ""

  for(i<-0 to a-1)
    ret = (ret + carr.reverse(i))

  println("Output: " + ret)
  ret
}
//stringSO(4, "testing")

//Strings 2
def stringST(a: String, b: String, c: Char, d: Char) : String = {
  val e = a.concat(b)
  val f = e.replace(c,d)

  f
}

//stringST("hello", "world", 'l', 'x')

//Operators
def operaT(a: Int, b: Int) : Int = {
  val c = a + b
  c
}

//operaT(2,4)

//Conditionals 1
def condiT (a: Int, b: Int, c: Boolean) : Int = {
  var d = 0
  if (c)
  {
   d = a + b
  }
  else
  {
    d = a * b
  }
  d
}

//condiT(5,10,true)

//Conditionals 2
def condiTT (a: Int, b: Int, c: Boolean) : Int = {
  var d = 0
  if (a == 0)
    {
      d = b
    }
  else if (b == 0)
  {
      d = a
  }

  else if (c)
  {
    d = a + b
  }
  else
  {
    d = a * b
  }
  d
}

//condiTT(0,677,false)

//Iteration 1
def iterAt (a: String, b: Int) : String = {
  for(i<-1 to b)
    println(a + "\n")

  a
}

//iterAt("Hello", 6)

//Iteration 2
def iterAtT (a: String, b: Int) : String = {
  for(i<-1 to b)
  {
    for(i<-1 to b)
      {
        print(a)
      }
    print("\n")
  }
  a
}

//iterAtT("Hello", 10)

//Iteration 3
def iterAtTT (a: String, b: String, c: Int) : Any = {
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
}

//iterAtTT("Fizz", "Buzz", 15)

//Iteration 4 - Recursion

def recurS (a: String, b: Int) : String = {

  if (b <= 1)
    println(a)
  else {
  println(a)
  recurS(a, b - 1)
  }
  a
}

//recurS("Pineapples", 15)

//Iteration 4.5 - Recursion 2 //Something wrong

def recurStuffT (a: String, b: Int) : String = {

  if (b <= 1)
    prinT(a,b)
  else {
    prinT(a,b)
    recurStuffT(a, b - 1)
  }}

  def prinT(a: String, b: Int) : String = {

    if (b <= 1) {
      println(a)

    }
    else {
      print(a)
      prinT(a, b - 1)

    }
    a
  }

//recurStuffT("Pete", 5)

//Pattern matching
def patMatch (a: Int, b: Int, c: Boolean) : Int = {
  var ret = 0

  c match {
    case true => ret = a + b
    case false => ret = a * b
  }
  ret
}

//patMatch(5,7,false)

//Pattern matching 1.5
def patMatchT (a: Int, b: Int, c: Boolean) : Int = {
  var ret = 0

  c match {
    case _ if a == 0 => ret = b
    case _ if b == 0 => ret = a
    case true => ret = a + b
    case false => ret = a * b
  }
  ret
}

//patMatchT(0,4,true)

//Pattern matching 2   //Need to do this ///////////////////////////////////////////////
/*def patmatchTT (a: Int, b: Int) : Int = {


} */

//Functional 1  //Need to do this  ////////////////////////////////////////////////////

def functionAL () : Any = {

  val zoneMap = TimeZone.getAvailableIDs.map(item => item.split('/').last).filter(_.length > 4)

print(zoneMap)

}

functionAL()

//Blackjack
def blackJack (a: Int, b: Int) : Int = {
    val collect = ((List(a,b,0).sorted)filter(_ <= 21)).reverse
    collect.head
  }

//blackJack(2,20)

//Unique Sum
def uniqueSum (a: Int, b: Int, c: Int) : Int = {
  var ret = 0

  a match{
    case _ if (a != b) && (a != c) && (b != c) => ret = a + b + c
    case _ if (a != b) && (a != c) && (b == c) => ret = a
    case _ if (a != b) && (a == c) && (b != c) => ret = b
    case _ if (a == b) && (a != c) && (b != c) => ret = c
    case _ => ret = 0
  }
  ret
}
//uniqueSum(6,4,6)

//Too Hot

def tooHot (temp: Int, isSummer: Boolean) : Boolean = {

  temp match{
    case _ if (temp >= 60) && (temp <= 90) && (!isSummer) => true
    case _ if (temp >= 60) && (temp <= 100) && isSummer => true
    case _ => false
  }
}

//tooHot(99, true)