package scaBrowser.browser.Firefox

import scaBrowser.browser.selenium.Driver
import org.openqa.selenium.firefox.FirefoxDriver

class Vanilla extends Driver {
  override val _driver=new FirefoxDriver()

}
