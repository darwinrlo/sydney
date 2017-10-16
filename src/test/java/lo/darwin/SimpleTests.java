package lo.darwin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class SimpleTests {
  @Test
  @DisplayName("Simple test")
  void simple(TestInfo testInfo) {
    assertEquals(1, 1, "1 should equal 1.");
  }
}
