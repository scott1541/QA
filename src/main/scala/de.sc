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
def recurStuffT (a: String, b: Int) : String = {

  for(i<-1 to b)
  {
    print(a)
  }
  print("\n")
  recurStuffT(a, b-1 )

a }



recurStuffT("Pete", 5)
