class Orange extends Fruit{
  val cost = 0.25

  override def addFruit(quantity: Int): Double = {
    quantity match {
      case `quantity` if quantity % 3 == 0 => (quantity*cost) - ((quantity/3)*cost)
      case _ => quantity*cost
    }
  }
}
