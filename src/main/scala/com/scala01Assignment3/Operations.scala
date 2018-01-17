package com.scala01Assignment3

class Operations {
  def doubleElementsOfList(list: List[Int]) : List[Int] = {
    list.map(x => x * 2)

  }

  def fibonacci(length: Int): Int = {
    print("\n Fibonacci series is: ")

    def fib(number: Int, current: Int, next: Int): Int = {
      print(s"$current")
      number match {
        case 0 => current
        case 1 => next
        case _ => fib(number - 1, next, next + current)
      }

    }

    fib(length, 0, 1)
  }

  def findKthElement(kthElement: Int, args: List[Int]): Unit = {

   val index =for (i <- 0 until args.length) yield if (i == 2) print(s"\nElement at position $kthElement = ${args(i)}")

      }


  def reverseList(list: List[Int]): List[Int] = {
    list match {
      case head :: tail => reverseList(tail) ::: List(head)
      case Nil => Nil
    }

  }


  def lengthOfList(list: List[Int]): Int = {
      def length (number:Int, list:List[Int]):Int = list match {
        case Nil => number
        case head::tail => length(number + 1, tail)
      }
     length(0,list)
    }

  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String = {
   val shapeName = shape.toLowerCase
    shapeName match {
      case "rectangle" => val area = f(first,second)
        s"Area of rectangle is $area"
      case "parallelogram" => val area = f(first,second)
        s"Area of parallelogram is $area"
      case "rhombus" => val area = f(first,second)
        s"Area of rhombus is $area"
      case "square" => "Not defined for square"
    }

  }

  def addTwoList(list1: List[Int], list2: List[Int]) : Unit= {
    if (lengthOfList(list1) != lengthOfList(list2)) {
      print("Both the lists have different length, hence can't be added")
    }
    else {
      print("\nNew list after Addition: \n")
      for (i <- 0 until list1.length) yield print(list1(i) + list2(i) + " ")
    }
  }
}
