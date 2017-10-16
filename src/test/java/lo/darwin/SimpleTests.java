package lo.darwin;

import java.util.*;

import org.junit.jupiter.api.Assertions;
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
  void testSets(TestInfo testInfo) {
    Set<Integer> numbers = new HashSet<>(); // using the diamond operator
    numbers.add(Integer.valueOf(3)); // without auto-boxing
    numbers.add(4); // with auto-boxing

    assertTrue(numbers.contains(3));
    assertTrue(numbers.contains(4));
    assertTrue(numbers.containsAll(Set.of(3, 4))); // of creates an immutable set
    assertFalse(numbers.contains(5));
  }

  @Test
  void testMaps(TestInfo testInfo) {
    Map<String, Integer> accountBalances = new HashMap<>();
    accountBalances.put("Darwin Lo", 100);
    assertEquals(accountBalances.get("Darwin Lo"), Integer.valueOf(100),
      "The account balance for Darwin is not $100.");

    int removed = accountBalances.remove("Darwin Lo"); // auto-unboxing
    assertEquals(removed, 100, "The removed value should be 100.");

    assertFalse(accountBalances.containsKey("Darwin Lo"),
      "\"Darwin Lo\" should've been removed.");
  }
}
