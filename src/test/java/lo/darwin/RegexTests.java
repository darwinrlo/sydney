package lo.darwin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static lo.darwin.Regex.*;

class RegexTests {
  @Test
  @DisplayName("Validation tests")
  void testValidation(TestInfo testInfo) {
    assertFalse(validate("a"));
    assertFalse(validate("xyz"));
    assertFalse(validate("abaa"));

    assertTrue(validate("aabbaba"));
    assertTrue(validate("aaa"));
  }
}
