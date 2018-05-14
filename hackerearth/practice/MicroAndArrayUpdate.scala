    import scala.io.StdIn
     
    object MicroAndArrayUpdate extends App {
     
      var T = StdIn.readInt()
     
      while (T > 0) {
        val secondLine = StdIn.readLine().split(' ')
        val K = secondLine(1).toInt
        val A = StdIn.readLine().split(' ').map(_.toInt).sorted
        T -= 1
        val res = K -A(0)
        println(if(res > 0) res else 0)
      }
    }
