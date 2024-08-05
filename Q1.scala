import scala.io.StdIn

object Q1 extends App {
    def filterEvenNumbers(list: List[Int]): List[Int] = list.filter(_ % 2 == 0)

    print("Enter the number of elements: ")
    val n = StdIn.readInt()
    println("Enter the elements: ")
    val list = List.fill(n)(StdIn.readInt())

    println("Even numbers of the list: " + filterEvenNumbers(list).mkString(" "))
}