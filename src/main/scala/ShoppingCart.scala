class ShoppingCart {
  def checkout(cart:Double*):Double = {
    val sum = cart.foldLeft(0.0)(_ + _)
    sum
  }
}
