import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._


// Error : does not work outside object
//Image.circle(100).fillColor(Color.paleGoldenrod).strokeColor(Color.indianRed)

// Importing packages

//import myDemoPackage.obj1
//println(myDemoPackage.obj1.obj1)
//println(obj1.obj1)
//println(obj1)

//import myDemoPackage._
//println(obj1.obj1, obj2.two, obj2.three, subPackage.obj3.three)

//import myDemoPackage.subPackage._
//println(obj3.three)

//everything inside package
//import myDemoPackage.subPackage.obj3._
//println(three)

//import myDemoPackage._
//println(obj2.three, subPackage.obj3.three)

object MyDemo {
//  Image.circle(100).fillColor(Color.paleGoldenrod).strokeColor(Color.indianRed).draw()

  val oneInt = 1
  val anImage = Image.circle(100).fillColor(Color.paleGoldenrod).strokeColor(Color.indianRed)
  val image = Image
    .circle(50)
    .fillColor(Color.black)
    .on(Image.circle(100).fillColor(Color.cornflowerBlue))
    .on(Image.circle(150).fillColor(Color.white))
    .on(Image.circle(250).fillColor(Color.darkBlue))

  object MyDemo2 {
    val two = 2
    val oneDouble = 1.0
  }

    val good = "Good"

    // Create a new scope
    //  this is called as lexical scoping
    {
      val morning = good ++ " morning" // no way to refer it by object
      val toYou = morning ++ " to you" // can be use as private or secrete variables
    }

    val toYou = good ++ " day, sir!"

  // rectangle beside rectangle
  val rectangle =   Image.rectangle(40, 40)
    .strokeWidth(5.0)
    .strokeColor(Color.royalBlue.spin(30.degrees))
    .fillColor(Color.royalBlue)

  val row = rectangle.beside(rectangle).beside(rectangle).beside(rectangle)


  // building row house
  val treeBushes = (Image.circle(50).fillColor(Color.green) strokeWidth 0)
  val treeStem = (Image.rectangle(10,30).fillColor(Color.brown) strokeWidth 0)
  val tree = treeBushes.above(treeStem)

  val houseTop = (Image.triangle(50,20).fillColor(Color.darkRed) strokeWidth 0)
  val houseWall1 = (Image.rectangle(50,20).fillColor(Color.orangeRed) strokeWidth 0)
  val houseWall2 = (Image.rectangle(50,30).fillColor(Color.orangeRed) strokeWidth 0)
  val houseDoor = (Image.rectangle(10,30).fillColor(Color.black) strokeWidth 0)
  val house = houseDoor.on(houseWall2).below(houseWall1).below(houseTop)

  val yellowSeg = (Image.rectangle(100, 3).fillColor(Color.yellow) strokeWidth 0)
  val blackSeg = (Image.rectangle(50, 3) fillColor Color.black strokeWidth 0)
  val road = (Image.rectangle(150, 6) fillColor Color.black strokeWidth 0)
  val street = yellowSeg.beside(blackSeg).above(road)

  val myImage = house.beside(tree).above(street)

  val rowHosue = myImage.beside(myImage).beside(myImage)

}

//val obj = MyDemo;
//obj.image.draw()