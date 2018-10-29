class Apple extends Fruit{
  val cost = 0.60

  override def addFruit(quantity: Int): Double = {
    quantity match {
      case `quantity` if quantity % 2 == 0 => (quantity*cost) - ((quantity/2)*cost)
      case _ => quantity*cost
    }
  }
}
