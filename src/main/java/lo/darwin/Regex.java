package lo.darwin;

import java.util.regex.*;

public class Regex {
  /**
   * Checks to see if the string consists of a's and b's and if a is the 3rd
   * from last character.
   */
  public static boolean validate(String s) {
    Pattern p = Pattern.compile("(a|b)*a(a|b){2}");
    Matcher m = p.matcher(s);
    return m.matches();
  }
}
