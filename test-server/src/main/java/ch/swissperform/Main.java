package ch.swissperform;

public class Main {

  public String say(String string) {
    System.out.println(string);
    return string;
  }

  public String shout(String string) {
    System.out.println("## " + string + "!");
    return "## " + string + "!";
  }

}