package scala

object  Collect {
  def main(args: Array[String]): Unit ={
    case class Car(marke: String, model: String, year: Int)
    val cars = Car("VW", "id4", 2021) :: "kjddkfsjg" :: Car("Lexus", "UX", 2019) :: Nil

    cars.collect{
      case x: Car => x.model
      case y: String => "111"
    }.foreach(x => println(x.toString))

  }

}