package THE_GAME

class Player {

   var myCards : Array[Cards]= new Array[Cards](13)

   override def toString: String = {
      var ret:String=""
      myCards.foreach(x=> ret=ret+x.suit+x.Num.toString+"\n")
     ret
   }
}
