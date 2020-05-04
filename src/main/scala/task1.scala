package cse598

import scala.Array.ofDim
object task1 extends App {
  val random = new java.security.SecureRandom
  def random2dArray(dim1: Int, dim2: Int) = Array.fill(dim1, dim2) { random.nextDouble()}
  var n = 0
  var timeTaken = 0.0D

  var dims = 1000
  val timeLimit = 180
  println("Task1")

  var matrixA = random2dArray(dims, dims)
  var matrixB = random2dArray(dims, dims)
  var matrixC = ofDim[Double](dims, dims)

  while (timeTaken < timeLimit) { // stop on 3 minutes
    n += 1
    val t1 = System.currentTimeMillis()
    for (i <- 0 to dims - 1) {
      for (j <- 0 to dims - 1) {
        var sum = 0.0D
        for (k <- 0 to dims - 1) {
          sum = sum + ((matrixA(i)(k)) * (matrixB(k)(j)))
        }
        matrixC(i)(j) = sum
      }
    }
    val t2 = System.currentTimeMillis()
    timeTaken += (t2-t1)/1e3

    println("Iteration"+n+" time: "+(t2-t1)/1e3)
  }
  println("Avg time: "+timeTaken/n)
  //    for (i <- 0 to dim-1) {
  //      for (j <- 0 to dim-1) {
  //        print(matrixC(i)(j) + " ")
  //      }
  //      println()
  //    }
}