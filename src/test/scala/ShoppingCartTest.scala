import org.scalatest.FlatSpec

class ShoppingCartTest extends FlatSpec{
  val apple = new Apple
  val orange = new Orange
  val cart = new ShoppingCart

  "No apples" should "equal 0.0" in {
    assert(apple.addFruit(0) == 0.0)
  }
  "One apple" should "equal 0.60" in {
    assert(apple.addFruit(1) == 0.6)
  }
  "Two apples" should "equal 0.6" in {
    assert(apple.addFruit(2) == 0.6)
  }
  "Four apples" should "equal 1.2" in {
    assert(apple.addFruit(4) == 1.2)
  }

  "No Oranges" should "equal 0.0" in {
    assert(orange.addFruit(0) == 0.0)
  }
  "One Oranges" should "equal 0.60" in {
    assert(orange.addFruit(1) == 0.25)
  }
  "Two Oranges" should "equal 0.5" in {
    assert(orange.addFruit(2) == 0.5)
  }
  "Three Oranges" should "equal 0.5" in {
    assert(orange.addFruit(3) == 0.5)
  }

  "A cart with nothing" should "equal 0.0" in {
    assert(cart.checkout(0.0) == 0)
  }
  "A cart with 2 apples and an orange" should "equal 0.85" in {
    assert(cart.checkout(apple.addFruit(2),orange.addFruit(1)) == 0.85)
  }
  "A cart with 2 oranges and one apple" should "equal 1.10" in {
    assert(cart.checkout(orange.addFruit(1),apple.addFruit(1),orange.addFruit(1)) == 1.10)
  }

}
