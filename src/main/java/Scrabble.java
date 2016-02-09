import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {
  }

  public static Integer scrabbleScore(String userString) {
    char[] scrabbleArray = userString.toCharArray();
    Integer wordScore = 0;
    for(int i = 0; i < scrabbleArray.length; i++) {
      if((scrabbleArray[i] == 'd') || (scrabbleArray[i] == 'g')) {
        wordScore += 2;
      } else {
        wordScore += 1;
      }
    }
    return wordScore;
  }
}
