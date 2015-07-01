package controllers

import play.api.mvc._

trait Application {
  this: Controller =>

  def index = Action {
    Ok("Ok")
  }
}

object Application extends Controller with Application
