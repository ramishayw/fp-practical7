import scala.io.StdIn

object Q2 extends App {
    def calculateSquare(list: List[Int]): List[Int] = list.map(x => x * x)

    print("Enter number of elements : ")
    val n = StdIn.readInt()
    println("Enter the numbers : ")
    val list = List.fill(n)(StdIn.readInt())
    println("Square of the numbers : " + calculateSquare(list).mkString(" "))
}