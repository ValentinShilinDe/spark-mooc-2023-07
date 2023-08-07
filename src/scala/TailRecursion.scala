package scala

import scala.annotation.tailrec

object TailRec extends App{
  val demoCollection = "line 1" :: "line 2" :: "line 3" :: "line 4" :: Nil
  println(tailRecursoinLength(demoCollection, 0))


  @tailrec
  def tailRecursoinLength(list: List[String], accum: Long): Long = list match {
    case Nil => accum
    case head :: tail  => tailRecursoinLength(tail, accum + 1)
  }

}
