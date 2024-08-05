import scala.io.StdIn

object Q3 extends App {
    def filterPrime(list: List[Int]): List[Int] = list.filter(x => x >= 2 && !(2 to math.sqrt(x).toInt).exists(y => x % y == 0))

    print("Enter number of elements : ")
    val n = StdIn.readInt()
    println("Enter the numbers : ")
    val list = List.fill(n)(StdIn.readInt())
    println("Prime numbers of the list : " + filterPrime(list).mkString(" "))
}