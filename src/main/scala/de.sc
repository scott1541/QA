import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.TimeZone

//Parameters
def doStuff(a: String) : String = {

  println(a)
  a
}

//Type Inference
def typeInfStuff(a: Any) : Any = {

  println(a)
  a
}
//Strings 1
/*def stringStuff(a: Int, b:String) : String = {
  val carr = new Array[Char](b.length)

  for(i<-1 to b.length)
    carr(i) == b.charAt(i)
  b

  b.length
} */

//Strings 2
def stringsTwo(a: String, b: String, c: Char, d: Char) : String = {
  var e = a.concat(b)
  var f = e.replace(c,d)
  f
}

stringsTwo("hello", "world", 'l', 'x')

//Operators
def stuffOps(a: Int, b: Int) : Int = {
  var c = a + b
  c
}

stuffOps(2,4)

//Conditionals
def stuffCond (a: Int, b: Int, c: Boolean) : Int = {
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

stuffCond(5,10,true)

//Conditionals 2
def stuffCondT (a: Int, b: Int, c: Boolean) : Int = {
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

stuffCondT(0,677,false)

//Iteration
def iterStuff (a: String, b: Int) : String = {
  for(i<-1 to b)
    println(a + "\n")
  a
}

iterStuff("Hello", 6)

//Iteration 2
def iterStuffT (a: String, b: Int) : String = {
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

iterStuffT("Hello", 10)

//Iteration 3
def iterStuffTT (a: String, b: String, c: Int) : Any = {
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

iterStuffTT("Fizz", "Buzz", 15)

//Iteration 4 - Recursion

def recurStuff (a: String, b: Int) : String = {

  if (b <= 1)
    println(a)
  else {
  println(a)
  recurStuff(a, b - 1)
  }

  a
}

recurStuff("Pineapples", 15)

//Recursion 2
/*
def recurStuffT (a: String, b: Int) : String = {

  for(i<-1 to b)
  {
    print(a)
  }
  print("\n")
  recurStuffT(a, b-1 )

a }



recurStuffT("Pete", 5)  */

//Pattern matching
def patMatch (a: Int, b: Int, c: Boolean) : Int = {

  var ret = 0

  c match {
    case true => ret = a + b
    case false => ret = a * b
  }
  ret
}

patMatch(5,7,false)

//Pattern matching 1.5     //Not quite right
def patMatchT (a: Int, b: Int, c: Boolean) : Int = {
  var ret = 0

  c match {
    case true => ret = a + b
    case false => ret = a * b
    case _ if a == 0 => ret = b
    case _ if b == 0 => ret = a
  }
  ret
}

patMatchT(5,0,true)

//Pattern matching 2   //Come back to this
/*def patmatchTT (a: Int, b: Int) : Int = {


} */

//Functional 1
def functionAL () : Any = {

  val zones: Array[String] = TimeZone.getAvailableIDs.filter(_.length > 3)
  //val newZones: Array[String] = zones.split
  zones


}

functionAL()

//Blackjack    //Needs improvement

def blackJack (a: Int, b: Int) : Int = {
  var c = 0
if((a > 21) && (b > 21)){
  c = 0
}
else if((a > b) && (a <= 21) ){
  c = a
}
else if((b > a)  && (b <= 21)){
  c = b
}
else
{
  c = 0
}
c
}

blackJack(21,5)

//Unique Sum
def uniqueSum (a: Int, b: Int, c: Int) : Int = {


}