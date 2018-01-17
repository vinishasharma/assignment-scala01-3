/*
import scala.util.Random
val value = Random.nextInt()

def something1 (x: Int) : Int = {
  println("calling something")
  x
   }


def callByValue(x: Int) = {
  println("x2=" + x)
  println("x1=" + x)

}

def callByName(x: Int => Int): Unit = {
  println("x1=" + x(10))
  println("x2=" + x)
   }



callByName(something1)

callByValue(something1(3))
  */

/*
abstract class Element {
  def demo() = {
    println("lement class")
  }
}

class B extends Element {
  override def demo() = {
    println("B")
  }
}
class Line extends B {
  override def demo() = {
    println("line")
  }
}

class D extends Element {
  def invokedemo(e: Element) ={
    e.demo()
  }
}

invokedemo(new B)
*/
class Cat {
  val dan = false
}

class Tiger (
override val dan: Boolean,
private var age: Int
            )extends Cat
{
  def pr =5
}
