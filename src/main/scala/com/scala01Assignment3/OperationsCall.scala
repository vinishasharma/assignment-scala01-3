package com.scala01Assignment3

object OperationsCall {
  def main(args: Array[String]): Unit = {
    val operation = new Operations
    val element1 = 1
    val element2 = 2
    val element3 = 3
    val element4 = 1
    val element5 = 2
    val element6 = 3
    val list1 = List(element1, element2, element3)
    val list2 = List(element3, element5, element6)
    val doubleList = operation.doubleElementsOfList(list1)
    print("Double Element of List are: \n")
    for (i <- 0 until doubleList.length) yield print(s"${doubleList(i)} ")
    val fibonacciNumberParameter = 5
    operation.fibonacci(fibonacciNumberParameter)
    operation.findKthElement(2, list1)
    val reverseList = operation.reverseList(list1)
    print("\nReverse list: \n")
    for (i <- 0 until reverseList.length) yield print(s"${reverseList(i)} ")
    val length = operation.lengthOfList(list1)
    print(s"\nLength of list: $length")
    val shapeLength1 = 5
    val shapeLength2 = 6
    val areaResult1 = operation.area("parallelogram",shapeLength1,shapeLength2,(base,height) => base * height)
    print(s"\n$areaResult1")
    val areaResult2 = operation.area("rhombus",shapeLength1,shapeLength2,(diagonal1,diagonal2) => (diagonal1 * diagonal2)/2)
    print(s"\n$areaResult2")
    val areaResult3 = operation.area("rectangle",shapeLength1,shapeLength2,(length,breadth) => length * breadth )
    print(s"\n$areaResult3")
    val areaResult4 = operation.area("square",shapeLength1,shapeLength2,(side1,side2) => side1 * side2)
    print(s"\n$areaResult4")
    operation.addTwoList(list1,list2)
  }
}
