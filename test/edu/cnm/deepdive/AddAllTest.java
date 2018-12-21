package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddAllTest {

  @Test
  void dontGiveMeFive() {
    assertEquals(8, AddAll.dontGiveMeFive(1,9));
    assertEquals(12, AddAll.dontGiveMeFive(4,17));
  }
}