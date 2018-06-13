package scaBrowser.browser.base

import org.openqa.selenium.WebElement


trait BrowInterface {

  def getPageSource():String

  def title():String

  def currentUrl():String

  def get(url:String):Unit

  def post():Unit

  def xpath(pattern:String):List[WebElement]

  def elementByName():Unit //change

  def saveScreenshot():Unit

  def savePageSource():Unit

  def getScreenshot():Unit //change

  def sendKeysByName():Unit

  def close():Unit


}
