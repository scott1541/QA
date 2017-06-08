//Calculate Prime Numbers

def calculatePrimesStream(end: Int): List[Int] = {
  val odds = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(end).toInt)
  val composites = odds.flatMap(i => Stream.from(i * i, 2 * i).takeWhile(_ <= end))
  Stream.from(3, 2).takeWhile(_ <= end).diff(composites).toList
}

calculatePrimesStream(2000000)