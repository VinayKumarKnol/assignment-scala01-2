class MathOperations {
  def findProductAndSum(number: Int): Unit = {
    val product: Long = factorial(number)
    println(s"The product from 1 to $number : $product")
    println(s"The sum of digits of $product : ${findSumOfDigits(product)}")
  }

  def factorial(number: Int): Long = {
    def fact(n: Int): Long = {
      if (n == 1) {
        n
      }
      else {
        n * fact(n - 1)
      }
    }

    fact(number)

  }

  def findSumOfDigits(number: Long): Long = {
    def findSum(num: Long): Long = {
      if (num == 0) {
        0
      }
      else {
        (num % 10) + findSum(num / 10)
      }
    }

    findSum(number)
  }

  def displayListWithIndex(numbers: List[Int]): Unit = {
    numbers.foreach {
      number => println(s"${numbers.indexOf(number)} = $number")
    }
  }

  def findMaxFromList(myList: List[Int]): Int = {
    if (myList.nonEmpty) {
      myList.max
    }
    else {
      -1 //indicates failure
    }
  }

  def findFibonacciAt(index: Int): Int = {
    def fibonacciTerm(term: Int): Int = {
      if (term <= 1) {
        term
      }
      else {
        fibonacciTerm(term - 1) + fibonacciTerm(term - 2)
      }
    }

    fibonacciTerm(index)
  }
}

object MathOperations {
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

