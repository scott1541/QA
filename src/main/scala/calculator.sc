//Calculator
def calculator(num: Int*) : String = {
  val multiply = num.map(item => s"$item * ${num.head} = ${item * num.head}  ").mkString( "\n")
  val divide = num.map(item => s"$item ÷ ${num.head} = ${item / num.head}  ").mkString( "\n")
  val add = num.map(item => s"$item + ${num.head} = ${item + num.head} ").mkString("\n")
  val subtract = num.map(item => s"$item - ${num.head} = ${item - num.head} ").mkString("\n")
  s"\nInput: ${num.mkString(" ")} \n\n$multiply \n$divide \n$add \n$subtract"
}

calculator(1,2,3,4)

//Calculator ADT Attempt
/*
sealed abstract class CalculatorADT(x: Int*) {
  override def toString: String = "nothing"
}

case class Multiply(num: Int*) extends CalculatorADT(mutable.WrappedArray[Any]) {
  override val toString = num.map(item => s"$item * ${num.head} = ${item * num.head}  ").mkString( "\n")
}

case class Divide(num: Int*) extends CalculatorADT(mutable.WrappedArray[Any]) {
  override val toString = num.map(item => s"$item / ${num.head} = ${item / num.head}  ").mkString( "\n")
}

case class Add(num: Int*) extends CalculatorADT(mutable.WrappedArray[Any]) {
  override val toString = num.map(item => s"$item + ${num.head} = ${item + num.head} ").mkString("\n")
}

case class Subtract(num: Int*) extends CalculatorADT(mutable.WrappedArray[Any]) {
  override val toString = num.map(item => s"$item - ${num.head} = ${item - num.head} ").mkString("\n")
}
*/
