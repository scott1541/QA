def favouriteBeerPrice(quantity:Double): Double = quantity * 3.5
println(s"Three pints will be £${favouriteBeerPrice(3)}")

def favouriteDrinkPrice(quanity:Double, discountCode:Option[String]): Double = {
  discountCode match {
    case Some(discount) => (quanity * 3.5) * 0.75
    case None => quanity * 3.5
  }
}

println(s"Five pints will be £${favouriteDrinkPrice(5,None)}")
println(s"Five pints will be £${favouriteDrinkPrice(5,Some("XYZ"))}")


//Implicit class

import BeerImplicits._

case class Beer(
               beerName: String, price: Double, productCode: Option[Long] = None
               )

object BeerImplicits {
  implicit class ImprovingBeer(beer: Beer) {
    def uuid: String =
    s"Name: ${beer.beerName}, price: ${beer.price}," +
    s" code: ${beer.productCode.getOrElse(222)}"
  }
}

val corona = Beer("Corona", 2.20)
corona.uuid

//Typed functions
def applyDiscount[T] (discount: T) = {
  discount match {
    case discount: String => println(s"You will receive a discount with this code: $discount")
    case discount: Int => println(s"You will receive a discount of: $discount")
    case _ => println("Invalid discount type")
  }
}

applyDiscount[String]("Coupon-556")
applyDiscount[Int](20)

//More typed functions
def applyMoreDiscount[T](discount: T): Seq[T] = {
  discount match {
    case disc: String => println(s"Looking for discount code in database $disc ")
      Seq[T](discount)
    case disc: Int => println(s"Applying the discount of $disc")
      Seq[T](discount)
    case _ => println("Unsupported discount type")
      Seq[T](discount)
  }
}

println(s"Applying the function with parameter ${applyMoreDiscount("Code-123")}")

//date .map(item=> item.split(/).last).filter(_.length > 4)))