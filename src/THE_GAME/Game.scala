package THE_GAME

import play.api.libs.json.{JsValue,Json}

class Game {

  var thisCards :DeckOfCards =  new DeckOfCards


  def start():Unit={
    thisCards.Shuffle()
  }

  def call():Unit= {

  }



}
