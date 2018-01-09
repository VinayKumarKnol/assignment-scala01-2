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

