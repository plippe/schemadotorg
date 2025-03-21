package schemadotorg

import utest._

object MainTests extends TestSuite {
  def tests = Tests {
    test("hello") {
      assert(Main.hello().startsWith("Hello"))
    }
    test("world") {
      assert(Main.hello().endsWith("World!"))
    }
  }
}
