package THE_GAME.states
import THE_GAME._
import akka.actor.Actor
import akka.actor.Props
import scala.concurrent.duration._

class SlapState(thegame:Game) extends gameState(thegame ) {

  val system = akka.actor.ActorSystem("system")
  import system.dispatcher
  system.scheduler.scheduleOnce(5000 milliseconds) {
    thegame.GameState=new nonSlapState(thegame)
  }


  override def Play(): Unit ={}

  override def Slap(): Unit ={
    thegame.Players.apply(thegame.CurrentPlayer).Slap(thegame)
    thegame.GameState=new nonSlapState(thegame)
  }

}
