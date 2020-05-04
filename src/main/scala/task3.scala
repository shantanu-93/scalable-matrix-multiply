package cse598
import breeze.linalg.DenseMatrix
object task3 extends App{
  override def main(args: Array[String]) {

    var dims = 1000
    val timeLimit = 180
    println("Task3")

    val lhs = DenseMatrix.rand[Double](dims, dims)
    val rhs = DenseMatrix.rand[Double](dims, dims)
    var timeTaken = 0.0D
    var iter = 0

    while (timeTaken < timeLimit) { // stop on 3 minutes
      iter += 1
      val t1 = System.currentTimeMillis()
      val product = lhs * rhs
      val t2 = System.currentTimeMillis()
      timeTaken += ((t2 - t1) / 1e3)
      println("Iteration" + iter + " time: " + (t2 - t1) / 1e3)
    }
    val avgTime =  timeTaken/iter
    println("Avg time: " + avgTime)
  }

}