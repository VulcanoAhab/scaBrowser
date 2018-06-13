import scaBrowser._

object Main extends App {
  val driver = new scaBrowser.browser.Firefox.Vanilla()
  // driver actions :: from config file :: to implement
  driver.close()

}
