package edu.grinnell.csc207;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the c2f method.
 */
public class C2FTests {
  /**
   * Freezing point of water.
   */
  @Test
  public void freezingTest() { 
    assertEquals(32, Utils.c2f(0), "freezing");
  } // freezingTest()

  /**
   * Boiling point of water.
   */
  @Test
  public void boilingTest() {
    assertEquals(212, Utils.c2f(100), "boiling");
  } // boilingTest()
} // class C2FTests
