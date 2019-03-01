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

 }

}
