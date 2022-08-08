package paut.aoc

import os.Path
import paut.utils.Authentication
import org.jsoup.Jsoup

object Files {
  val wd = os.home / ".paut" / "aoc"
    val inputs = wd / "inputs"
      val examples = inputs / "examples"
      val puzzles = inputs / "puzzles"
    val conf = wd / "config"
      val tokenFile = conf / "session.txt"
      val usernameFile = conf / "user.txt"
      val defaultYearFile = conf / "defaultyear.txt"
    val resultsFile = wd / "results.txt"

  def read(path: os.Path) = if (os.exists(path)) Some(os.read(path)) else None

  def username = read(usernameFile)
  def token = read(tokenFile)
}
