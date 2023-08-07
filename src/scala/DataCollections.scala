package scala

object dataCollection extends App {
  println("demo")
  val demoCollection  = ("line 1" :: "line 2" :: "line 3" :: "line 3" :: Nil).toSet
  val demoCollection1 = (1::1::2::2::3::3::Nil).groupBy(x=>x).toList.map(x=>x._1) // 1 2 3

  demoCollection1.foreach(x=>println(s"Collection $x"))

  println("demo of functions")
  // fold foldLeft foldRight

  println(s"fold result ${demoCollection1.fold(1)((z,i) => z+i)}") // 7
  println(s"fold left result ${demoCollection1.foldLeft(1)((z,i) => z+i)}") //7
  println(s"fold left result ${demoCollection1.reduce((z,i) => z+i)}")//6

}