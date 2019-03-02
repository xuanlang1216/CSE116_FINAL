package GUI

import scalafx.animation.AnimationTimer
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.TextField
import scalafx.scene.layout.GridPane
import THE_GAME._

object Gui extends JFXApp {

  val game = new Game

  var CardDisplay :TextField = new TextField{
    editable = false
    style = "-fx-font: 18 ariel;"
  }

  var RemainingCard : TextField = new TextField{
    editable = false
    style = "-fx-font: 18 ariel;"
  }

  val Start_B = new StartButton(game,2 ,2)
  val Call_B = new CallButton(game,2,2)

  this.stage = new PrimaryStage{
    title = "The Slapjack Game"
    scene = new Scene(){
      content = List(
         new GridPane{
           add(Start_B,0,0,3,2)
           add(CardDisplay,2,2)
           add(Call_B,0,4)
           add(RemainingCard,0,5)
        }
      )
    }

    AnimationTimer(Update).start()
  }

  def Update(time:Long):Unit={
    RemainingCard.text = "Remaining Cards: 0"
  }
}
