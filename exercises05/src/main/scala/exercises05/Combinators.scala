package exercises05

object Combinators {
  // Есть цепочка hefEgGeGFEgGgeHE
  // в данной цепочке есть различные типы частиц
  // f, e, h, g положительно заряженные частицы
  // F, E, H, G отрицательно заряженные частицы
  // если частицы одного типа с разной полярностью стоят вместе в цепочке, они реагируют и исчезают
  // проход слева направо
  //
  // hefEgGeGFEgGgeHE <- gG прореагировали
  // hefEeGFEgGgeHE <- Ee прореагировали
  // hefGFEgGgeHE <- gG
  // hefGFEgeHE <- итоговая цепочка, в которой 10 частиц
  //
  // Напишите функцию, используя комбинаторы стандартной библиотеки,
  // которая проведёт полную реакцию
  def react(ipt: String): String = {
    val ans = ipt.foldLeft(List[Char]()) { (char, s) =>
      char match {
        case head :: tail if head != s && head.toLower == s.toLower => tail
        case _                                                      => s :: char
      }
    }
    ans.reverse.mkString("")
  }
}
