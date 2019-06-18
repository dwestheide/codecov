package lib

object Math {

  def nonNegative(x: Int): Boolean = x >= 0

//  def nonNegative(x: Int): Boolean = sys.env.get("ACTIVE_MUTATION") match {
//    case Some("0") => x > 0
//    case Some("1") => x <= 0
//    case Some("2") => x == 0
//    case _ => x >= 0
//  }

//  def nonNegativeRatio(xs: List[Int]): BigDecimal = {
//    val count = xs.count(x => x >= 0)
//    BigDecimal(count) * 100 / xs.size
//  }
//
//  def posRange(start: Int, end: Int): Boolean = start > 0 && end > start
}
