package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddAllTest {

  @Test
  void dontGiveMeFive() {
    assertEquals(8, AddAll.dontGiveMeFive(1,9));
    assertEquals(12, AddAll.dontGiveMeFive(4,17));
    assertEquals(90, AddAll.dontGiveMeFive(1,100));
  }

  @Test
  void getSum() {
    assertEquals(44, AddAll.getSum(2, 9));
    assertEquals(68, AddAll.getSum(5, 12));
    assertEquals(-1, AddAll.getSum(0, -1));
  }
}