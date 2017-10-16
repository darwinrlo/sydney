package lo.darwin;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class SimpleTests {
  @Test
  @DisplayName("Simple test")
  void simple(TestInfo testInfo) {
    assertEquals(1, 1, "1 should equal 1.");
  }

  @Test
  void testCollections(TestInfo testInfo) {
    Set<Integer> numbers = new HashSet<>(); // using the diamond operator
    numbers.add(Integer.valueOf(3)); // without auto-boxing
    numbers.add(4); // with auto-boxing

    assertTrue(numbers.contains(3));
    assertTrue(numbers.contains(4));
    assertTrue(numbers.containsAll(Set.of(3, 4))); // of creates an immutable set
    assertFalse(numbers.contains(5));
  }
}
