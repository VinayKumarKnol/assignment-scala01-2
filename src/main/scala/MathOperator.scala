object MathOperator {
  val conduit: MathOperations = new MathOperations

  def main(args: Array[String]): Unit = {
    printList()
    printMaximum()
    printFibonacciAt()
    printSumAndProduct()
  }

  def printList(): Unit = {
    val aList: List[Int] = List(10, 20, 30, 40)
    conduit.displayListWithIndex(aList)
  }

  def printMaximum(): Unit = {
    val aList: List[Int] = List(1, 5, 2, 9, 7)
    val max: Int = conduit.findMaxFromList(aList)
    println(s"Maximum element is : $max")
  }

  def printFibonacciAt(): Unit = {
    val position: Int = 4
    val term: Int = conduit.findFibonacciAt(position)
    println(s"Fibonacci Term at $position : $term")
  }

  def printSumAndProduct(): Unit = {
    val number: Int = 5
    val product: Long = conduit.factorial(number)
    val sum: Long = conduit.findSumOfDigits(product)
    println(s"Product from 1 to $number : $product")
    println(s"Sum of each digit of $product: $sum")
  }
}