package tests

import org.scalatest._
import THE_GAME._

class TestGame extends FunSuite {

  var testGame : Game= new Game
  testGame.start()
  testGame.Player1.myCards =new Array[Cards](0)
  test("Has_A_Winner")
  {
    assert(testGame.Has_A_Winner(),"  ")
  }

}
