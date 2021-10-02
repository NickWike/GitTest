import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf()
    sparkConf.setAppName("FirstTest")

    val sparkSession = SparkSession
      .builder()
      .config(sparkConf)
      .getOrCreate()

    sparkSession
      .sql(
        """
          |SELECT
          | 'hello'
          |FROM tmp
          |""".stripMargin)

    sparkSession.stop()

  }
}
