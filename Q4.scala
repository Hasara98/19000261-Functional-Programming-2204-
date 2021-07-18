object Q4 extends App {

  def isEven(n:Int):Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n: Int):Boolean = !(isEven(n))

  println(isEven(10))
  println(isOdd(7))
  println(isEven(1))
  println(isOdd(8))

}