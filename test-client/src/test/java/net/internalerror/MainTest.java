package net.internalerror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  @Test
  void testSay() {
    assertEquals("hello", new Main().say("hello"));
  }

}
