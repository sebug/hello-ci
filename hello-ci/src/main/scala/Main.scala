class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit =
    println(prefix + name + suffix)
}

case class Point(x: Int, y: Int)

object Main extends App {
  def add(x: Int, y: Int): Int = x + y

  val f = (x: Int) => x + 1
  println({
    val x = add(7, 8)
    f(x)
  })

  val g = new Greeter("Hey, ", "?!")
  g.greet("Sebastian")

  val point = Point(1,2)
  println(point)
}
