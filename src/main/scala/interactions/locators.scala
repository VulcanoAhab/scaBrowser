package scaBrowser.interactions.locators

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement



trait LocAll {
    var pattern:String
    var type:String

    def select(browser:WebDriver):List[WebElement]={
      var locator=By.getProperty(type)
      return browser.findElements(locator(pattern))
    }
}


class Xpath () extends LocAll {
  private var _pattern
  var type="xpath"

  def pattern=_pattern

  def pattern_=(value:String){
    //test for valid xpath :: not yet
    _pattern=value
  }

}
