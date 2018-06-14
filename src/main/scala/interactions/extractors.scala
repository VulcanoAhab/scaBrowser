package scaBrowser.interactions.extractors



class Text(elements:List[WebElement], field_name:String):Map[String, List[String]] {

  val elsTexts= for (element <- elements) yield element.getText()
  return scala.collection.mutable.Map(field_name, elsTexts)

}
