package THE_GAME

import play.api.libs.json.{JsValue,Json}

class Game {

  var thisCards :DeckOfCards =  new DeckOfCards

  var Player1 : Player = new Player
  var Player2:Player=new Player
  var Player3:Player =new Player
  var Player4:Player=new Player


  def start():Unit={
    thisCards.Shuffle()
    thisCards.deal(Player1,Player2,Player3,Player4)
  }

  def call():Unit= {

  }

  def Has_A_Winner():Boolean={
    if (Player1.myCards.isEmpty|Player2.myCards.isEmpty|Player3.myCards.isEmpty|Player4.myCards.isEmpty)
      true
    else
      false
  }



}
