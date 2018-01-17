package com.scala01Assignment3

import org.apache.log4j.Logger

object OperationsCall {
  def main(args: Array[String]): Unit = {

    val log = Logger.getLogger(this.getClass)
    val operation = new Operations
    val element1 = 1
    val element2 = 2
    val element3 = 3
    val element4 = 1
    val element5 = 2
    val element6 = 3
    val list1 = List(element1, element2, element3)
    val list2 = List(element4, element5, element6)
    val doubleList = operation.doubleElementsOfList(list1)
    log.info("Double Element of List are: \n")
    for (i <- 0 until doubleList.length) yield (s"${doubleList(i)} ")
    val fibonacciNumberParameter = 5
    operation.fibonacci(fibonacciNumberParameter)
    operation.findKthElement(2, list1)
    val reverseList = operation.reverseList(list1)
    log.info("\nReverse list: \n")
    for (i <- 0 until reverseList.length) yield log.info(s"${reverseList(i)} ")
    val length = operation.lengthOfList(list1)
    log.info(s"\nLength of list: $length")
    val shapeLength1 = 5
    val shapeLength2 = 6
    val areaResult1 = operation.area("parallelogram",shapeLength1,shapeLength2,(base,height) => base * height)
    log.info(s"\n$areaResult1")
    val areaResult2 = operation.area("rhombus",shapeLength1,shapeLength2,(diagonal1,diagonal2) => (diagonal1 * diagonal2)/2)
    log.info(s"\n$areaResult2")
    val areaResult3 = operation.area("rectangle",shapeLength1,shapeLength2,(length,breadth) => length * breadth )
    log.info(s"\n$areaResult3")
    val areaResult4 = operation.area("square",shapeLength1,shapeLength2,(side1,side2) => side1 * side2)
    log.info(s"\n$areaResult4")
    operation.addTwoList(list1,list2)
  }
}
