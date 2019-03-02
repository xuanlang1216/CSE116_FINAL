package GUI

import java.io.FileNotFoundException
import java.nio.file.{Files, Paths}
import scalafx.Includes._
import scalafx.event.ActionEvent
import scalafx.scene.control.Button
import scala.io.Source
import THE_GAME._

class MyButton (game:Game,xScale:Double,yScale:Double) extends Button {
  minWidth = 100 * xScale
  minHeight = 100 * yScale
  style = "-fx-font: 12 ariel;"
}

class StartButton(game: Game, xScale: Double = 1.0, yScale: Double = 1.0)extends MyButton(game,xScale,yScale){
  text = "Start"
  style = "-fx-font: 24 ariel;"
  onAction = (event:ActionEvent) => game.start()
}

class CallButton(game: Game, xScale: Double = 1.0, yScale: Double = 1.0)extends MyButton(game,xScale,yScale){
  text = "Call!"
  style = "-fx-font: 24 ariel;"
}
