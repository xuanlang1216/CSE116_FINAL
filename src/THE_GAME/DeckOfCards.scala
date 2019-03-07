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
 deck(53)=new Cards("J",15)

 def Shuffle():Unit= {
   for (i <- 0 to 52) {
     val r: Int = (Math.random() * 52).toInt
     val Temp: Cards = deck(i)
     deck(i) = deck(r)
     deck(r) = Temp
   }
 }

  //deal cards : First Player and Third Player get 14 cards and others 2 get 13 Cards
  def deal(Player1:Player,Player2:Player,Player3:Player,Player4:Player):Unit={
    Player1.myCards = deck.slice(0,14)
    Player2.myCards = deck.slice(14,27)
    Player3.myCards = deck.slice(27,41)
    Player4.myCards = deck.slice(41,54)
  }

  override def toString: String = {
    var output =""
    for (i <- deck){
      output += i.Num + i.suit +"\n"
    }
    output
  }




}
