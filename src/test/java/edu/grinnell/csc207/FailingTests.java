package edu.grinnell.csc207;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Some tests that fail.
 */
public class FailingTests {
  /**
   * Compare two different numbers.
   */
  // @Test
  public void notReallyEqual() { 
    assertEquals(1, 2, "One equals two");
  } // notReallyEqual()

  /**
   * Just fail using fail.
   */
  // @Test
  public void justFail() {
    fail();
  } // justFail()
} // class FailingTests
