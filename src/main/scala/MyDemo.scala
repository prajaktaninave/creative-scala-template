import doodle.core._
import doodle.image._
//import doodle.image.syntax._
import doodle.image.syntax.core._
//import doodle.java2d._


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

  def myNewFunc(val1: Int, val2:Int, str : String): Int ={
    println("My input String : " .++(str))
    val v3 = val1+val2
    // return v3 or val1+val2 or
    v3
  }

  // Exercise 1:Write a method square that accepts an Int argument and returns the Int square of it’s argument.

  def squareIt(val1: Int): Int ={
    val1*val1
  }

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

  val rowHouse = myImage.beside(myImage).beside(myImage)

  // rectangle beside rectangle
  val rectangle =
    Image.rectangle(40, 40)
    .strokeWidth(5.0)
    .strokeColor(Color.royalBlue.spin(30.degrees))
    .fillColor(Color.royalBlue)

  val row = rectangle.beside(rectangle).beside(rectangle).beside(rectangle).beside(rectangle)

  // recursion for above
  def recursiveBoxes(count: Int): Image ={
    count match {
      case 0 => Image.empty
      case n => rectangle.beside(recursiveBoxes(n-1))
    }
  }

  def oddEven(x : Int): String ={
    //    (x%2==0) match {
    //      case true => "Its even Number"
    //      case false => "Its odd Number"
    //    }
    // Another way

    if (x%2==0) "Its even Number"
    else "Its odd Number"
  }

  val star = Image
    .star(5, 30, 15, 45.degrees)
    .strokeColor(Color.teal)
    .on(Image.star(5, 12, 7, 45.degrees).strokeColor(Color.royalBlue))
    .strokeWidth(5.0)

  val circle = Image
    .circle(60)
    .strokeColor(Color.midnightBlue)
    .on(Image.circle(24).strokeColor(Color.plum))
    .strokeWidth(5.0)

  def alternateImages(x : Int): Image ={
    x match {
      case 0 => Image.empty
      case n =>
        if (n%2==0) circle.beside(alternateImages(n-1))
        else star.beside(alternateImages(n-1))
    }
  }
  //  Defining each object for different color separately
  //  val paleGoldenrod = {
  //    val box =
  //      Image.rectangle(40, 40).
  //        strokeWidth(5.0).
  //        strokeColor(Color.paleGoldenrod.spin(30.degrees)).
  //        fillColor(Color.paleGoldenrod)
  //
  //    box beside box beside box beside box beside box
  //  }
  //
  //  val lightSteelBlue = {
  //    val box =
  //      Image.rectangle(40, 40).
  //        strokeWidth(5.0).
  //        strokeColor(Color.lightSteelBlue.spin(30.degrees)).
  //        fillColor(Color.lightSteelBlue)
  //
  //    box beside box beside box beside box beside box
  //  }
  //
  //  val mistyRose = {
  //    val box =
  //      Image.rectangle(40, 40).
  //        strokeWidth(5.0).
  //        strokeColor(Color.mistyRose.spin(30.degrees)).
  //        fillColor(Color.mistyRose)
  //
  //    box beside box beside box beside box beside box
  //  }

  // Generic function definition for accepting diff colors
  def boxes(myColor: Color): Image ={
    val box =
      Image.rectangle(40, 40).
        strokeWidth(5.0).
        strokeColor(myColor.spin(30.degrees)).
        fillColor(myColor)

    box beside box beside box beside box beside box
  }

  // function use
  val myGoldenBox = boxes(Color.paleGoldenrod)
  val myBlueBox = boxes(Color.lightSteelBlue)
  val myRoseBox = boxes(Color.mistyRose)

  def sierpinski(count: Int): Image = {
    val triangle = Image.triangle(10, 10).strokeColor(Color.magenta)
    count match {
      case 0 => triangle.above(triangle.beside(triangle))
      case n =>
        val unit = sierpinski(n - 1)
        unit.above(unit.beside(unit))
    }
  }
}

