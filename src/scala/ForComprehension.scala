package scala

object ForComprehansion extends App{
  val RGB = Seq("R", "G", "B")
  val range = Range.apply(1, 4)
  val map = Map("R" -> "Red", "G" -> "Green", "B" -> "Blue")
//  for (el <- RGB){
//    println(el)
//  }

//  for (el <- RGB; el1 <- range){
//    println(s"$el - $el1")
//  }

 // for ((key, value) <- map){
//    println(s"$key - $value")
//  }

  for (
    el1 <- RGB;
    el2 <- RGB;
    el3 <- RGB
  ){
    println(s"$el1 $el2 $el3")
  }

  println("-------------")
  for (
    el1 <- RGB;
    el2 <- RGB;
    el3 <- RGB;
    if el1 != el2
    if el3!=el2 && el3 != el1
    ){
    println(s"$el1 $el2 $el3")
  }

  case class Car(marke: String, model: String, year: Int)
  val cars = Car("VW", "passat", 2005) :: Car("BMW", "i3", 2021) :: Car("Lexus", "UX", 2019) :: Nil

  cars.filter(x=>x.year>2010).foreach(x=>println(x))

  case class Garage(name: String, index: Int)
  val garages = Garage("BWM", 1) :: Garage("Lexus", 2)::Nil

  garages.flatMap{
    garage => cars.filter(car => car.marke == garage.name).map(car =>
    (car.marke, car.model))}.foreach(x => println(s"${x._1} ${x._2}"))


  val cars1 = for{
    car <- cars
    garage <- garages
    if car.marke == garage.name
  } yield {(car.marke, car.model, garage.index)}

  cars1.foreach(x=>println(s"${x._1} ${x._2} ${x._3}"))


}