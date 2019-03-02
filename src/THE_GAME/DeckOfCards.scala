package THE_GAME

class DeckOfCards {
 var deck:Array[Cards]= new Array[Cards](54)
 for ( i <- 0 to 12){
    deck(i) = new Cards("S",i+1)
    deck(i+13) = new Cards("D",i+1)
    deck(i+26) = new Cards("H",i+1)
    deck(i+39) = new Cards("C",i+1)
 }
 deck(52)=new Cards("J",14)
 deck(53)=new Cards("J",14)

 def Shuffle():Unit={
    for (i <- 0 to 52){
     val r :Int =  (Math.random()*52).toInt
     val Temp :Cards = deck(i)
     deck(i)= deck(r)
     deck(r) = Temp
    }

  def draw(Player1:Player,Player2:Player,Player3:Player,Player4:Player):Unit={
    Player1.myCards = deck.slice(0,13)
    Player2.myCards = deck.slice(13,26)
    Player3.myCards = deck.slice(26,39)
    Player3.myCards = deck.slice(39,53)
  }


 }

}
