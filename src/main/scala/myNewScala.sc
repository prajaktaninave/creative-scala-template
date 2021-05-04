
//object myObj {
//  val one = 1
//}
//
//println(myObj.one)
//
//"abcd" match {
//  case "bcde" => 0
//  case "cdef" => 1
//  case "abcd" => 2
//}
//1 match {
//  case 0 => "zero"
//  case 1 => "one"
//  case 1 => "two"
//}
//
//1 match {
//  case n => n + 1
//  case 1 => 1000
//}
//
//1 match {
//  case a => a+4
//  case b => 31
//  case c => 32
//  case n => n+1
//}
//
//2 match {
//  case 0 => 1
//  case 1 => 1000
//  case a => 2
//}


def identity(n: Int): Int =
  n match {
    case 0 => 0
    case 1 => 1
    case n => 2 * identity(n-1)
  }

identity(4)
import doodle.core._
import doodle.image._
//import doodle.image.syntax._
import doodle.image.syntax.core._
//import doodle.java2d._


