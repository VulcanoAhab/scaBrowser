package scaBrowser.browser.selenium

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import scala.collection.mutable.HashMap
import scala.collection.JavaConverters._
import scaBrowser.browser.base.BrowInterface
import org.openqa.selenium.firefox.FirefoxDriver // default driver


abstract class Driver extends BrowInterface {

  val _driver:WebDriver

  override def get(url:String):Unit={
    _driver.get(url)
  }


  override def title():String={
    return _driver.getTitle()
  }

  override def getPageSource():String={
    return _driver.getPageSource()
  }


  override def currentUrl():String={
    return _driver.getCurrentUrl()
  }

  override def xpath(pattern:String):List[WebElement]={
    var els=_driver.findElements(By.xpath(pattern)).asScala.toList
    return els
  }

  override def close():Unit={
    _driver.quit()
  }

  override def post():Unit={
    println("[-] Not implemented")
  }

  override  def elementByName():Unit={
    println("[-] Not implemented")
  }

  override def saveScreenshot():Unit={
    println("[-] Not implemented")
  }

  override def savePageSource():Unit={
    println("[-] Not implemented")
  }

  override def getScreenshot():Unit={
    println("[-] Not implemented")
  }

  override def sendKeysByName():Unit={
    println("[-] Not implemented")
  }

}
