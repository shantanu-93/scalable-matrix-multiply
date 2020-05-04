package cse598
import java.util.Random

import org.apache.spark.mllib.linalg.DenseMatrix
import org.apache.spark.sql.SparkSession
object task2 extends App {
  override def main(args: Array[String]) {
    println("Task2")
    val spark = SparkSession
      .builder()
      .appName("cse598-matrix-mult")
      .config("spark.driver.bindAddress", "127.0.0.1").master("local[*]")
      .getOrCreate()
    val queryResult = matrixMult(spark)
//    val result = Seq("Average Time", queryResult.toString).toDF()
//    result.write.mode(SaveMode.Overwrite).text("/home/shantanu/Desktop/task2.txt")
    spark.stop()
  }

  private def matrixMult(spark: SparkSession): Double = {

    var dims = 1000
    val timeLimit = 180
    println("Task2")

    var timeTaken = 0.0D
    val rnd = new Random()
    var iter = 0
    rnd.setSeed(24)
    val matrixA = DenseMatrix.randn(dims, dims, rnd)
    val matrixB = DenseMatrix.randn(dims, dims, rnd)
//    val matrixA = DenseMatrix.ones(dim, dim)
//    val matrixB = DenseMatrix.ones(dim, dim)
    var matrixC = DenseMatrix.zeros(dims, dims)
    while (timeTaken < timeLimit) { // stop on 3 minutes
      iter += 1
      val t1 = System.currentTimeMillis()
      matrixC = matrixA.multiply(matrixB)
      val t2 = System.currentTimeMillis()
      timeTaken += ((t2 - t1) / 1e3)
      println("Iteration" + iter + " time: " + (t2 - t1) / 1e3)

    }
    val avgTime =  timeTaken/iter
    println("Avg time: " + avgTime)
    return avgTime
  }
}