package net.internalerrorr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  @Test
  void testShout(){
    assertEquals("## hello!", new Main().shout("hello"));
  }

}
